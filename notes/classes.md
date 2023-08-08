## Class

A class is a template for an object, and an object is an instance of a class.
A class creates a new **data type** that can be used to create objects.

When you declare an object of a class, you are creating an instance of that class.
Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)

Objects are characterized by three essential properties: *state*, *identity*, and *behavior*.

- The state of an object is a value from its data type.
- The identity of an object distinguishes one object from another.
    It is useful to think of an object’s identity as the place where its value is stored in memory.
- The behavior of an object is the effect of data-type operations.

The dot operator links the name of the object with the name of an instance variable.
Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.


## New Keyword

The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it. This reference is then stored in the variable (reference variable).

Thus, in Java, all class objects must be dynamically allocated.
``` Java
Box mybox;           // declare reference to object
mybox = new Box();  // allocate a Box object
```
The first line declares `mybox` as a reference to an object of type Box. At this point, `mybox` does not yet refer to an
actual object. The next line allocates an object and assigns a reference to it to `mybox`. After the execution of the second line,
mybox simply holds the memory address of the actual Box object and can be used for other purposes.

The key to Java’s safety is that you cannot manipulate references as you can actual pointers.
Thus, you cannot cause an object reference to point to an arbitrary memory location or manipulate it like an integer.

## Contructor

``` Java
classname ref_var = new classname ( );
```
`classname()` is the constructor for the class. A constructor is a special function inside class that defines what values are allocated when an object of a class is created.

## Primitives

We may wonder why we do not need to use `new` for such things as *integers* or *characters*.
The answer is that **Java’s primitive types are not implemented as objects** .
Rather, they are implemented as “normal” variables, allocated in stack.
This is done in the interest of efficiency.

## Garbage Collection

When no reference variable points to an object, Garbage Collector removes it automatically from the memory. Sometimes an object will need to perform some action when it is destroyed.
To handle such situations, Java provides a mechanism called finalization. By using finalization, we can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.

To add a finalizer to the objects of a class, we simply define the finalize( ) method in the class. The Java run time calls that method whenever it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( ) method on the object. 

But lately, *it has been deprecated*.

``` Java

class SomeClass{

    /.../
    void finalize(){

        /...Some code to be executed.../
    
    }

}
```
 