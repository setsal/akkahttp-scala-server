# akkahttp-scala-server
simple restful http server by scala

## Requirements

- SBT
- Scala
- MariaDB or MySQL

## Configuration

Modify the file `application.conf.example` to `application.conf` with the correct information.

## Getting started

Deployment:

Run developement server on `localhost:8080`

```
$ sbt run
```

Data & testing:

When the developement server start, it will do the migration first.
If you want to add some simple data to test, please execute the `init.sql` in your database.


## Restful API Interface

**USERS**
- `GET /demo/users`
- `GET /demo/users/user_id`
- `POST /demo/users`
- `PUT /demo/users/user_id`
- `DELETE /demo/users/user_id`


## Contributors
+ setsal lan
+ xia.shu.12
