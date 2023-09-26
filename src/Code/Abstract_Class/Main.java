package Code.Abstract_Class;

public class Main {
    public static void main(String[] args) {

        Abstract_SubClass son= new Abstract_SubClass();
        son.career();       // I wanna become a software developer
        son.partner("Sweetu"); // I wanna marry Sweetu
        

        // Abstract_Demo temp= new Abstract_Demo();         // This is will give error, as we can not create objects of an abstract class

        Abstract_Demo.greet();      // calling the static method inside abstract class
        son.printLuckyNum();        // calling the normal method (overridden)

        Abstract_Demo daughter= new Abstract_SubClass();    // Abstract class ref variable can hold child class objects ( same rule as previous )
        // daughter.onlyChild();                            // can not access child class methods

        
    }
}
