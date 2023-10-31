package Code.OOP_Principles.Inheritance;

/* 
    In OOP, any class derived from another class (base class) is called Child class.
    The child class that has its own properties and methods, can also access the members of the base class.
    Basically, the child class is inheriting properties and methods from the base class, this is known as Inheritance.
    
    When we want to create a child class from a base class, we need to initialize the parent class variables also.

    A child class can not access the private members of the parent class. Objects created directly from the parent class 
    can not access child class members.

     
*/
public class Inheritance_Example extends Box{
    int weight;

    Inheritance_Example (int ln,int wd,int ht,int wt){
        /* 
            Inside the constructor of a child class, we must must call the super() with
            sufficient args. It calls the parent class (exact above) constructor and initializes the values present in it.

            If we don't call super(), in that case also, super will be called implicitly, which is known as implicit super(). Implicit super() will always call the default parent constructor i.e. 
            Box() in this case. 
            
            But we already have two Box(...) constructors defined and therefore calling implicit super() will result in error as the parent class does not
            have a Box() constructor (with no args) defined.
            If the parent has a Box constructor (with no args) defined or does not have any constructor defined at all, it is fine for implicit super(). 

         */
        super(ln, wd, ht);     // This calls the Box(int l,int w,int h) constructor that initializes all the parent variables.
        this.weight=wt;

        // this.height=1;      // Can't be accessed as it is private
        
        /* 
            We can use super to access the parent class properties also. 
                e.g. :  
                super.length= 500 ;

            It is specially useful when both child and parent class have the same instance variable
            and we want to access the one belonging to the parent class. Using 'this' here, will get us the one present the in child class

            If all the instance variables are unique in both parent and child class, it will refer to the parent property.

        */

    }


    Inheritance_Example(Inheritance_Example other){

        /* 
            This super(other) calls Box (Box old) constructor. 

            Now, internally, 'old' (parent class ref var) points to 'others' which is a child class ref var. 
            
            Hence, Box(Box old) constructor can access only the common values present in 'others' 

            This saves us from doing the following:

            this.length=other.length;
            this.width=other.width;
            this.height=other.height;

         */
        super(other);       

        this.weight=other.weight;   // Only the weight property has to be initialized explicitly.    
    }



    public static void main(String[] args) {
        
        Box temp= new Inheritance_Example(1, 2, 3, 4);
        // temp.length              // Can be accessed
        // temp.weight              // Can not access, even it has been initialized

        /* 
            In the above example, the instance is of child class i.e. Inheritance_Example and the
            reference variable is of type Box (base class) . Due to this, we can only access the members defined in
            the parent class ( and inherited by the child class). 
            
            The parent class has no idea about its child classes and their members. As a result, we can only use the inherited parent methods.
            
            Therefore, we can say it is the type of reference variable and not the type of object
            that determines which members can be accessed.
        */


        // Inheritance_Example test= new Box(1, 2, 3);          // this gives error
        /* 
            Here, we can access the variables that are in the ref type i.e. Inheritance_Example, e.g. weight .
            This also means, we have to initialize those variables that belong to the child class i.e. Inheritance_Example .

            However, when the obj (we are trying to create), itself is of type parent class, in no way we can call the child class constructor
            for initializing those variables.This is why it gives error.
            
        */

        /* 
            Types of Inheritance:
            ---------------------

            Single Inheritance: One class extends another class e.g. Inheritance_Example is extended from Box

            Multi-Level Inheritance: One class, which inherits from another class, is further extended to form a child class. E.g. A --> B --> C --> D

            Multiple Inheritance: One class inherits from more than one classes. E.g. A --> B , C-->B (Not supported in Java, it is implemented using Interfaces)

            Hierarchial Inheritance: One class is inherited by many classes E.g. A --> B, A --> C, A --> D

            Hybrid Inheritance: It is the combination of single and multiple inheritance (Not supported in Java) E.g. A --> B, A --> C, B --> D, C --> D

        */
        
    }
}