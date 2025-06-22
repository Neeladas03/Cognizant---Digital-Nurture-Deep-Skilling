# Factory Method Pattern Example

This project implements the Factory Method pattern to simulate a document creation system. It includes document types like Word, PDF, and Excel, each represented by a concrete class.

An abstract factory class defines a method for creating documents, and separate concrete factories are responsible for instantiating specific document types. This approach helps in decoupling the object creation logic from the main business logic.

By using the factory method pattern, the system becomes flexible and easy to extend. Adding a new document type does not affect existing code, which supports better maintainability and scalability.
