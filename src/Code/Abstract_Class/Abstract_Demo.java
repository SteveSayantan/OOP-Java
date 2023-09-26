package Code.Abstract_Class;

public abstract class Abstract_Demo {

    /* 
        Abstract class only declares some methods without initializing them. Its child classes
        are allowed to override each and every necessary methods provided by its parent (i.e. abstract class).

        syntax:
        ------
        abstract void func_name (String args);     // no body, just declaration. abstract keyword is used to declare an abstract method

        Any class containing at least one abstract method should also be declared abstract.

        'final' classes can't be inherited hence, abstract classes can't be final as they are meant to be inherited.

        Still we can't use multiple inheritance.

     */
    int luckyNumber;    // We can have properties in abstract class

    final String REALHERO="spiderman"; // we can have final properties as well

    Abstract_Demo(int num){        // We can have constructor for abstract class, but we can't call it directly and we can't make it abstract also.
    // This constructor has to be called via super() inside a child class that is not abstract itself.
        luckyNumber=num;
    }


    abstract void career();
    abstract void partner(String name);

    static void greet(){    // We can create static methods inside our abstract class
        System.out.println("Have a nice day");
    }

    // We can not declare static methods as abstract, as abstract methods are meant to be overridden, but static methods can't be overridden.

    void printLuckyNum(){   // We can also have normal methods like this in abstract class 
        System.out.println(luckyNumber);
    }

    
}
