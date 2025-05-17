# URL Shortener

A simple URL shortening service built with Spring Boot. This application allows users to convert long URLs into shorter, more manageable links.

## Features

- URL shortening functionality
- RESTful API endpoints
- H2 in-memory database

## Technologies Used

- Java 17
- Spring Boot 3.2.3
- Spring Data JPA
- H2 Database
- Lombok
- Maven

## Prerequisites

- JDK 17 or higher
- Maven 3.6 or higher

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/aurasphere/url-shortener.git
cd url-shortener
```

2. Build the project:

```bash
mvn clean install
```

3. Run the application:

```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

The service provides the following REST endpoints:

- `POST /api/urls` - Creates a shortened URL
- `GET /api/urls/{shortCode}` - Redirects to the original URL

## License

This project is licensed under the MIT License - see the LICENSE file for details.
