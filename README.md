# Math API

## Description
This is a simple REST API built with Spring Boot that provides basic mathematical operations such as addition, subtraction, multiplication, division, mean calculation, and square root computation.

## Technologies Used
- Java
- Spring Boot
- Maven

## Endpoints
The API exposes the following endpoints:

### 1. Addition
**Endpoint:** `GET /math/sum/{numberOne}/{numberTwo}`

**Description:** Adds two numbers and returns the result.

**Example Request:**
```
GET /math/sum/5/3
```

**Example Response:**
```json
8.0
```

---

### 2. Subtraction
**Endpoint:** `GET /math/subtraction/{numberOne}/{numberTwo}`

**Description:** Subtracts `numberTwo` from `numberOne` and returns the result.

**Example Request:**
```
GET /math/subtraction/10/4
```

**Example Response:**
```json
6.0
```

---

### 3. Multiplication
**Endpoint:** `GET /math/multiplication/{numberOne}/{numberTwo}`

**Description:** Multiplies two numbers and returns the result.

**Example Request:**
```
GET /math/multiplication/7/2
```

**Example Response:**
```json
14.0
```

---

### 4. Division
**Endpoint:** `GET /math/division/{numberOne}/{numberTwo}`

**Description:** Divides `numberOne` by `numberTwo` and returns the result.

**Example Request:**
```
GET /math/division/9/3
```

**Example Response:**
```json
3.0
```

**Error Handling:** If `numberOne` or `numberTwo` is `0`, the API throws an error: `"Division by zero"`.

**Example Erro:**
```json
{
    "timestamp": "2025-03-23T04:01:46.346+00:00",
    "message": "Division by zero",
    "details": "uri=/math/division/0/2"
}
```

---

### 5. Mean
**Endpoint:** `GET /math/mean/{numberOne}/{numberTwo}`

**Description:** Computes the mean (average) of two numbers.

**Example Request:**
```
GET /math/mean/10/20
```

**Example Response:**
```json
15.0
```

---

### 6. Square Root
**Endpoint:** `GET /math/squareRoot/{number}`

**Description:** Computes the square root of a number.

**Example Request:**
```
GET /math/squareRoot/25
```

**Example Response:**
```json
5.0
```

---

## Error Handling
The API validates input values to ensure they are numeric. If a non-numeric value is provided, it throws an error:
```json
{
    "timestamp": "2025-03-23T04:01:03.925+00:00",
    "message": "For input string: \"a\"",
    "details": "uri=/math/sum/6/a"
}
```

## Setup & Running the Application

### Prerequisites
- Java 17+
- Maven

### Installation & Execution
1. Clone the repository:
   ```sh
   git clone https://github.com/Nrzty/Simple-Math-API/
   cd Simple-Math-API
   ```
2. Build the project with Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```
4. The API will be available at `http://localhost:8080`

## License
This project is licensed under the MIT License.

