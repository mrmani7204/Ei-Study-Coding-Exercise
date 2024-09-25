Singleton Pattern (Creational)

The Singleton Pattern ensures that a class has only one instance and provides a global point of access to it. It is used when exactly one instance of a class is

needed across an application.

Files:

Singleton.java: Implements the Singleton pattern with lazy initialization. The instance is created the first time it's requested.

Main.java: Demonstrates how to get the single instance and call a method on it.

Workflow:
Singleton uses a private constructor and a static getInstance() method to return the only instance of the class.

When getInstance() is called, if no instance exists, it creates one and returns it. Subsequent calls return the same instance.

Main.java demonstrates calling getInstance() and invoking the showMessage() method.

This pattern is useful in cases where managing a single resource (like a database connection pool or configuration settings) is necessary.
