Observer Pattern (Behavioral)
The Observer Pattern allows one object (the Subject) to notify multiple other objects (the Observers) when its state changes. It is typically used when one object needs to keep other objects updated about its state.

Files:
Observer.java (Interface): Defines the contract for observers, requiring an update() method to handle notifications.
ConcreteObserver.java (Class): Implements the Observer interface, and reacts to state changes.
Subject.java (Class): Manages a list of observers. It notifies them whenever its internal state (a message) changes.
Main.java: Demonstrates adding observers and notifying them of state changes.
Workflow:
Subject holds a list of Observers.
Observers register themselves with the Subject by calling addObserver().
When the Subject’s state changes (e.g., through setMessage()), it calls notifyObservers().
Each registered Observer gets the update and reacts (prints a message).
This pattern is useful in scenarios like notification systems, where an update (such as a weather report or stock price change) should notify multiple users.
