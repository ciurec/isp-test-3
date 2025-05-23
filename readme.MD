# Java Task: Car Renting System with Threads

Simulate a car renting system where multiple users try to rent cars at the same time. Handle cases where no cars are
available using a custom exception.

---

## Section 1: Classes and Methods (5P)

### 1. `Renter` Class (2p)

Represents a Renter with a limited number of cars available for rent.

### **Fields**:

- `renterId`: Unique identifier for the renter.
- `renterName`: The name of the renter.
- `carsAvailable`: Number of cars remaining to rent.

### **Method**:

- `rentCar()`: Decreases `carsAvailable` by 1 or throws `CarUnavailableException` if none are available.

### **Use lombok for model class to reduce boilerplate code.** (1p)

### 2. `CarUnavailableException` Class (1p)

### 3. `RentThread` Class (1p)

- Simulates a user trying to rent a car.
- Display a message on the screen that the car was rented successfully, and also show the number of remaining cars at
  each iteration

## Section 2: Implementation (4P)

- Create a `Renter` instance with 5 available cars. (1p)
- Start 6 instances of `RentThread` to simulate users trying to rent simultaneously. (1p)
- Handle `CarUnavailableException` when no more cars are available and display a message. (1p)
- Ensure that only one thread can rent a car at a time using thread synchronization. (1p)

---