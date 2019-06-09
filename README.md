# akkahttp-scala-server

## Requirements

- SBT
- Scala
- Mariadb

## Configuration

Modify the file `application.conf.example` to `application.conf` with the correct information.

## Deployment

Run developement server on `localhost:8080`

```
$ sbt run
```

## API REST Interface

**USERS**
- `GET /demo/users`
- `GET /demo/users/user_id`
- `POST /demo/users`
- `PUT /demo/users/user_id`
- `DELETE /demo/users/user_id`
