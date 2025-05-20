# Java Task: Ticket Booking System with Threads

Simulate a **ticket booking system** where multiple users try to book concert tickets at the same time. Handle cases
where tickets are sold out using a **custom exception**.

---

## Section 1: Classes and Methods (5P)

### `Ticket` Class

Represents a concert with a limited number of tickets.

- **Fields**:
    - `ticketId`: Unique identifier for the ticket.
    - `event`: The name of the concert/event.
    - `ticketsAvailable`: Number of tickets remaining.

- **Method**:
    - `bookTicket()`: Decreases `ticketsAvailable` or throws `TicketsSoldOutException` if none are available.

### `TicketsSoldOutException` Class

### `BookingThread` Class

Simulates a user trying to book a ticket.

---

## Section 2: Implementation (4P)

- Create a `Ticket` instance that contains 5 tickets. (1p)
- Start 6 instances of `BookingThread` instances to simulate users trying to book tickets simultaneously. (1p)
- Handle TicketsSoldOutException when no more tickets are available and display message in console. (1p)
- Ensure that only one thread can book a ticket at a time using thread synchronization. (1p)
- Use lombok for model class to reduce boilerplate code. (1p)

---