The Composite Pattern allows us to compose objects into **tree structures** to represent part-whole hierarchies.
This pattern lets clients treat individual objects and compositions of objects uniformly.

The client interacts with an Abstract Class (Component) that defines the general contract to interact with
leafs or nodes of the tree.

The Component Abstract class must offer, at least, methods to add and remove nodes or leafs from the structure. It also
provides default implementations of the methods that offers.

The Component class is extended by two classes:

- **Leaf**: This class represents a leaf of the tree structure, therefore, it won't provide an implementation of the add 
and remove methods.

- **Composite**: This class represents a node of the tree structure, therefore, it must have a collection of Composition
and provide an implementation of add and remove to allow the client interact with the tree structure.
