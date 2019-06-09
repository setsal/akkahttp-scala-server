package models

case class User(id: Option[UserId], name: String, email: String, phone: String, gender: Int)
