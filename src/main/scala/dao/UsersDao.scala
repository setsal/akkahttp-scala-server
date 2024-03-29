package dao

import models.{UserId, User}
import slick.driver.MySQLDriver.api._
import scala.concurrent.Future

object UsersDao extends BaseDao{
  def findAll: Future[Seq[User]] = usersTable.result
  def findById(userId: UserId): Future[User] = usersTable.filter(_.id === userId).result.head
  def create(user: User): Future[UserId] = usersTable returning usersTable.map(_.id) += user
  def update(newUser: User, userId: UserId): Future[Int] = usersTable.filter(_.id === userId)
    .map(user => (user.name, user.email, user.phone, user.gender))
    .update((newUser.name, newUser.email, newUser.phone, newUser.gender))

  def delete(userId: UserId): Future[Int] = usersTable.filter(_.id === userId).delete

}
