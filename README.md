<h1 align="center">
  FreteFlex
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Social&message=@evandersondev&color=EA2027&labelColor=000000" alt="@evandersondev" />
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Formação Spring Boot&color=EA2027&labelColor=000000" alt="Formação Spring Boot" />
</p>

API para calcular frete feito em Java e Spring Boot, api desenvolvido no curso Formação Spring Boot da Build & Run.

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)

## Práticas adotadas

- API REST
- Injeção de Dependências

## Como Executar

- Clonar repositório git
- Construir o projeto:

```
$ ./mvnw clean package
```

- Executar a aplicação:

```
$ java -jar target/freteflex-1.0.0.jar
```

A API poderá ser acessada em [localhost:8080/shipping](http://localhost:8080/shipping).

## API Endpoints

- Calcular Frete - Tipo de frete [EXPRESS | STANDARD]

```http
GET http://localhost:8080/shipping/calculate?type=EXPRESS&distance=10&weight=3
```

<br>
