# Java Task: Car Rental System with Threads

## Objective
Simulate a car rental system where multiple users try to rent cars at the same time. Handle cases where cars are unavailable using exceptions.

---

## Classes Overview

### 1. `Car` Class
- Represents a car in the rental system.
- **Fields**:
    - `model`: The car's model.
    - `carsAvailable`: Number of cars available for renting.
- **Method**:
    - `rentCar()`: Decreases `carsAvailable` or throws an exception if no cars are available.

---

### 2. `CarUnavailableException` Class
- Custom exception thrown when no cars are available for renting.

---

### 3. `RentThread` Class
- Simulates a user trying to rent a car.
- Calls `rentCar()` and handles exceptions.

---

## Main Method
1. Create a `Car` instance with a limited number of cars.
2. Start multiple `RentThread` instances to simulate users renting cars.
3. Observe how the system handles unavailable cars.