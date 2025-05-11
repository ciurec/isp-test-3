# Java Exam Task: Library Book Borrowing with Threads

## Objective
The goal is to create a library system that allows users to borrow books. The system should handle exceptions when books are unavailable and use multithreading to simulate multiple users borrowing books at the same time.

---

## Classes Overview

### 1. `Book` Class
This class represents a book in the library.

- **Fields**:
    - `title` (`String`): The title of the book.
    - `author` (`String`): The name of the book's author.
    - `copiesAvailable` (`int`): The number of copies available for borrowing.

- **Method**:
    - `public synchronized void borrowBook() throws BookUnavailableException`:
        - **Purpose**: Allows a user to borrow a book.
        - **Behavior**:
            - If `copiesAvailable` is `0`, throw a `BookUnavailableException`.
            - Otherwise:
                - Decrease `copiesAvailable` by 1.
---

### 2. `BookUnavailableException` Class
This is a custom exception class used to indicate that a book is unavailable for borrowing.

---
### 3. `BorrowThread` Class
This class simulates a user trying to borrow a book. It extends the `Thread` class.

- **Field**:
    - `Book book`: A reference to the book that the thread will attempt to borrow.

- **Constructor**:
    - `public BorrowThread(Book book)`:
        - Initializes the thread with the book it will borrow.

- **Method**:
    - Override the `run()` method:
        - **Purpose**: Simulates the borrowing process.
        - **Behavior**:
            - Calls the `borrowBook()` method of the `Book` class inside a `try-catch` block.
            - If a `BookUnavailableException` is thrown, catch it and print the exception message along with the thread's name.

---
## Main Method Instructions
1. **Create a `Book` instance**:
    - Example:
        - Title: `"Java Essentials"`
        - Author: `"John Doe"`
        - Copies available: `2`

2. **Create and start `2` `BorrowThread` instances**:
    - Pass the same `Book` instance to all threads.
    - Start each thread to simulate multiple users trying to borrow the same book.

---

## Thread Safety
- The `borrowBook()` method in the `Book` class must be synchronized to ensure that only one thread can access it at a time. This prevents race conditions when multiple threads try to borrow the same book simultaneously.