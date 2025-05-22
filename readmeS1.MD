# Java Task: Ticket Booking System with Threads

Simulate a **ticket booking system** where multiple users try to book concert tickets at the same time. Handle cases
where tickets are sold out using a **custom exception**.

---

## Section 1: Classes and Methods (5P)

### `Event` Class (2p)

Represents an event with a limited number of tickets.

### **Fields**:

- `eventId`: Unique identifier for the event.
- `eventName`: The name of the event.
- `ticketsAvailable`: Number of tickets remaining.

### **Method**:

- `bookTicket()`: Decreases `ticketsAvailable` or throws `TicketsSoldOutException` if none are available.

### **Use lombok for model class to reduce boilerplate code.** (1p)

### `TicketsSoldOutException` Class (1p)

### `BookingThread` Class (1p)

- Simulates a user trying to book a ticket.
- Display a message on the screen that Ticket was booked successfully and also remaining tickets at every iteration

---

## Section 2: Implementation (4P)

- Create a `Ticket` instance that contains 5 tickets. (1p)
- Start 6 instances of `BookingThread` instances to simulate users trying to book tickets simultaneously. (1p)
- Handle `TicketsSoldOutException` when no more tickets are available and display message in console. (1p)
- Ensure that only one thread can book a ticket at a time using thread synchronization. (1p)

---