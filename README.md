# spring-boot-3x
Spring Boot 3x


## Create User

```
curl http://localhost:8080/api/users -i -H "Content-Type: application/json" -d {\"firstName\":\"mark\",\"lastName\":\"farrel\",\"email\":\"mark@gmail.com\"}
curl http://localhost:8080/api/users -i -H "Content-Type: application/json" -d {\"firstName\":\"crawford\",\"lastName\":\"candy\",\"email\":\"crawford@gmail.com\"}
```

## List Users
```
curl http://localhost:8080/api/users
```

