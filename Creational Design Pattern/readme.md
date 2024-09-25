Factory Pattern (Creational)

The Factory Pattern is used to create objects without exposing the instantiation logic to the client. It provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.


Files:

Shape.java: Defines a common interface for all shapes with a draw() method.

Circle.java / Square.java: Implements the Shape interface.

ShapeFactory.java: Has a method getShape() that takes a string and returns the appropriate Shape object.

Main.java: Demonstrates how the factory can create different shapes based on input.

Workflow:

The ShapeFactory hides the logic of which shape to instantiate based on the user input ("CIRCLE" or "SQUARE").

The client requests a Shape by calling getShape(), and the factory returns an appropriate instance.

The Main class demonstrates using the factory to create and draw different shapes.

This pattern is often used in applications where object creation is complex or requires a large amount of setup, but the client shouldn’t have to manage the specifics.
