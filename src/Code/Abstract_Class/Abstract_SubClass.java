package Code.Abstract_Class;

public class Abstract_SubClass extends Abstract_Demo {
    // This is the child class of Abstract_Demo and it must override these methods.
    
    Abstract_SubClass(){
        super(23);
    }
    @Override
    void career() {
        System.out.println("I wanna become a software developer");        
    }

    @Override
    void partner(String name) {
        System.out.println("I wanna marry "+name);
        
    }

    @Override
    void printLuckyNum() {  // We can also override the normal methods
        
        System.out.println("I do not believe in luck");
    }
    
    void onlyChild(){
        System.out.println("This is only for Abstract_SubClass");
    }
    
}
