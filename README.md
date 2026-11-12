# Order Approval Workflow

A simple Java project to understand Hexagonal Architecture (Ports & Adapters) and Order Approval flow.

## Project Structure

- `domain` - Core business logic, Order, OrderStatus
- `application` - Use cases, OrderService
- `adapters` - Input adapters, Main class

## How it Works

1. Order is created with status `PENDING`
2. OrderService checks the order amount
3. If approved, status becomes `APPROVED`
4. If rejected, status becomes `REJECTED`

## How to Run

```bash
mvn clean install
## Tech Stack

- Java
- Maven
- Hexagonal Architecture

## Author
ANITHA-R-1710


