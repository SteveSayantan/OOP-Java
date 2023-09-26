package Code.Interface.Basics;

public interface Interface_Engine{
    /* 
        Interface contains functions that are public and abstract (by default).

        The instance variables are final and static in nature (by default)

        It can implement multiple inheritance. We can not create objects of interface as they don't have constructor.

        A class can maintain its state info via instance variables but interfaces can not (as variables are static and final in interface)

        Type of methods:
            Interface can have only abstract methods.
            Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.

        Final Variables:
            Variables declared in a Java interface are final.
            An abstract class may contain non-final variables.

        Type of variables:
            Abstract class can have static,non-static, private, protected, default,public variables.
            Interface has only static and final variables that are public by default.

        Implementation:
            Abstract class can provide the implementation of interface.
            Interface can’t provide the implementation of abstract class.

        Inheritance vs Abstraction:
            A Java interface can be implemented using keyword “implements”
            and abstract class can be extended using keyword “extends”.
    */

    int PRICE=80000;    // It is by default static and final

    void start();
    void stop();
    void acc();


    /* 
      In normal classes, to override some method present in the parent_class, the method should be present in both the parent and child
      class. Otherwise, it will give compile time error. 
      
      In this way, to avail some method in the child class, the parent_class gets filled with such methods. This problem is solved by interfaces.
      
      Interfaces disconnect the definition of a method from this hierarchy of inheritance, as all the methods are being implemented in the child_class
      only.

      For this reason, if two classes are totally separate from each other in terms of class hierarchy, they can still implement same interface.
      
      Using Interface adds extra overhead, so using it casually is not recommended in performace critical code.
    */
}
