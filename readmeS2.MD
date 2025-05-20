#  Java Task: Car Renting System with Threads

Simulate a car renting system where multiple users try to rent cars at the same time. Handle cases where no cars are available using a custom exception.

---

## Section 1: Classes and Methods (5P)

### 1. `Car` Class
Represents a car model with a limited number of cars available for rent.

- **Fields**:
- `carId`: Unique identifier for the car.
- `model`: The name/model of the car.
- `carsAvailable`: Number of cars remaining to rent.

- **Method**:
- `rentCar()`:  
  Decreases `carsAvailable` by 1 or throws `CarUnavailableException` if none are available.

---

### 2. `CarUnavailableException` Class

---

### 3. `RentThread` Class
Simulates a user trying to rent a car by calling `rentCar()`.

---

## Section 2: Implementation (5P)

- Create a `Car` instance with 5 available cars. **(1p)**
- Start 6 instances of `RentThread` to simulate users renting simultaneously. **(1p)**
- Handle `CarUnavailableException` when no more cars are available and display a message. **(1p)**
- Ensure thread safety using `synchronized` keyword to prevent race conditions. **(1p)**
- Use Lombok* to reduce boilerplate (e.g., getters, setters, constructors).**(1p)**

---