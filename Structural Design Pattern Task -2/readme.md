Decorator Pattern (Structural)

The Decorator Pattern allows behavior to be added to individual objects dynamically, without affecting other objects from the same class. It’s useful for adding

functionality to objects in a flexible way.

Files:

Coffee.java: Declares methods for getting the description and cost of a coffee.

SimpleCoffee.java: Basic implementation of Coffee, with a description and a base cost.

CoffeeDecorator.java: Base decorator class that implements Coffee and holds a reference to a Coffee object.

MilkDecorator.java: Adds milk to the coffee, modifying both the description and cost.

Main.java: Demonstrates creating a basic coffee and adding milk to it.

Workflow:
SimpleCoffee is a basic coffee implementation that can be decorated with additional features.

MilkDecorator adds milk to the coffee and increases its cost.

The Main class allows the user to dynamically add milk to the coffee and displays the final description and price.

The Decorator Pattern is common in scenarios where adding responsibilities to objects at runtime is necessary, like a customizable GUI framework where each component

can have varying features.
