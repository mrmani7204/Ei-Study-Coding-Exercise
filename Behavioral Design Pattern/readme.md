Command Pattern (Behavioral)

The Command Pattern turns a request into a stand-alone object, allowing it to be passed, stored, or executed later. It is used to decouple the sender of a request
from the receiver, supporting undoable operations or queueing commands.

Files:

Command.java (Interface): Declares a execute() method for commands.

Light.java (Class): Has operations to turn the light on and off.

LightOnCommand.java / LightOffCommand.java: Concrete implementations of the Command interface for turning the light on/off.

RemoteControl.java: Acts as the invoker. It holds a reference to a Command and can trigger its execution.

Main.java: Demonstrates the setting of commands in the remote control and executing them.

Workflow:

LightOnCommand and LightOffCommand are concrete commands that call light.on() or light.off(), respectively.

RemoteControl stores a command, and pressing the button executes that command.

The actual request (turning on/off the light) is decoupled from the action invoker (the remote control).

This pattern is often used in scenarios like GUIs, where buttons trigger different operations, or in task queues where commands are executed at different times.
