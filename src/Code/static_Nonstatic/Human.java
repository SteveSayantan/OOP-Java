package Code.static_Nonstatic;

public class Human {
    int age;
    String name;
    int salary;
    boolean isLoyal=false;
    int increment;

    static int population;      // Properties or methods not related to the object, but common to all the objects of that class, are declared as static. 

    public Human(int years,String str,int money){
        this.age=years;
        this.name=str;
        this.salary=money;
        this.increment++;

        Human.population++;     // As it is a static one, we have to use the classname. Use of 'this' is not recommended at all.
    }

    static void fun_static(){       // This does not depend on an object
        System.out.println("Let's have some fun with static");
        // fun_nonstatic();         // Gives an error as it is non-static

        Human obj= new Human(23,"Test",20);     // First, we need to create an instance
        obj.fun_nonstatic();        // Now, we can call non-static method with reference to this created object.
    }


    void fun_nonstatic(){           // This depends on an object
        System.out.println("But it is not static");
        Human.fun_static();           // This is allowed

        greeting();             // This is also allowed because fun_nonstatic requires an object reference, that same reference would be used by greeting().
    }

    void greeting(){
        System.out.println("Have a good day");
    }

    public static void main(String[] args) {
        // fun_nonstatic();        // Gives an error as it is non-static
    }
}
/* 
    Refer to Package_intro.java for examples
    ---------------------------------------

    Human steve= new Human(23, "Sayantan", 100);

    While calling the constructor in this case, 'this' is replaced by 'steve'.

        Therefore, 
            steve.increment= steve.increment+1;    // 0 (as initially, 'increment' is present in the class, not in the object) + 1
            steve.increment= 1;

    However, the 'population' property present in the class (not in the object,as is a static property). That's why
        calling the constructor increases its value by one each time.

    
 */
