package models.definitions

import models.{UserId, User}
import slick.driver.PostgresDriver.api._

class UsersTable(tag: Tag) extends Table[User](tag, "users"){
  def id = column[UserId]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name")
  def email = column[String]("email")
  def phone = column[String]("phone")
  def gender = column[Int]("gender")
  def * = (id.?, name, email, phone, gender) <> ((User.apply _).tupled, User.unapply)
}
