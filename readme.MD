[//]: # (# Java Task: Car Renting System with Threads)

[//]: # ()
[//]: # (Simulate a car renting system where multiple users try to rent cars at the same time. Handle cases where no cars are)

[//]: # (available using a custom exception.)

[//]: # ()
[//]: # (---)

[//]: # ()
[//]: # (## Section 1: Classes and Methods &#40;5P&#41;)

[//]: # ()
[//]: # (### 1. `Renter` Class &#40;2p&#41;)

[//]: # ()
[//]: # (Represents a Renter with a limited number of cars available for rent.)

[//]: # ()
[//]: # (### **Fields**:)

[//]: # ()
[//]: # (- `renterId`: Unique identifier for the renter.)

[//]: # (- `renterName`: The name of the renter.)

[//]: # (- `carsAvailable`: Number of cars remaining to rent.)

[//]: # ()
[//]: # (### **Method**:)

[//]: # ()
[//]: # (- `rentCar&#40;&#41;`: Decreases `carsAvailable` by 1 or throws `CarUnavailableException` if none are available.)

[//]: # ()
[//]: # (### **Use lombok for model class to reduce boilerplate code.** &#40;1p&#41;)

[//]: # ()
[//]: # (### 2. `CarUnavailableException` Class &#40;1p&#41;)

[//]: # ()
[//]: # (### 3. `RentThread` Class &#40;1p&#41;)

[//]: # ()
[//]: # (- Simulates a user trying to rent a car.)

[//]: # (- Display a message on the screen that the car was rented successfully, and also show the number of remaining cars at)

[//]: # (  each iteration)

[//]: # ()
[//]: # (## Section 2: Implementation &#40;4P&#41;)

[//]: # ()
[//]: # (- Create a `Renter` instance with 5 available cars. &#40;1p&#41;)

[//]: # (- Start 6 instances of `RentThread` to simulate users trying to rent simultaneously. &#40;1p&#41;)

[//]: # (- Handle `CarUnavailableException` when no more cars are available and display a message. &#40;1p&#41;)

[//]: # (- Ensure that only one thread can rent a car at a time using thread synchronization. &#40;1p&#41;)

[//]: # ()
[//]: # (---)

# Java Task: Library Book Borrowing System with Threads

Simulate a library system where multiple readers try to borrow books at the same time. Handle situations when no books are available using a custom exception.

---

##  Section 1: Classes and Methods (5P)

### 1. `Library` Class (2p)

Represents a library with a limited number of books available for borrowing.

####  Fields:
- `libraryId`: Unique identifier for the library.
- `libraryName`: Name of the library.
- `booksAvailable`: Number of books currently available to borrow.

#### 🔧 Method:
- `borrowBook()`: Decreases `booksAvailable` by 1 or throws `BookUnavailableException` if none are available.

 **Use Lombok** for this model class to reduce boilerplate code. (1p)

---

### 2. `BookUnavailableException` Class (1p)

Custom exception thrown when no books are left to borrow.

---

### 3. `BorrowThread` Class (1p)

- Simulates a reader trying to borrow a book.
- Displays a message when a book is borrowed successfully and shows how many books remain.
- Catches and handles the `BookUnavailableException`.

---

##  Section 2: Implementation (4P)

- Create a `Library` instance with 4 available books. (1p)

- Start 6 `BorrowThread` instances to simulate readers trying to borrow at the same time. (1p)

- Handle `BookUnavailableException` when no books are available and show a warning message. (1p)

- Use **thread synchronization** (`synchronized`) to ensure only one thread can borrow a book at a time. (1p)

---