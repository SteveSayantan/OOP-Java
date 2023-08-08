package Code;

public class StaticExample {
    static int a=4;
    static int b;
    int c;
    static{     // will only run once, when the class is loaded for the first time
        System.out.println("Static block executed");
        b=a*5;
    }

    {   // Example of Non-static block
        System.out.println("This is a non-static block");
    }

    {   // Another example of Non-static block
        System.out.println("This is also a non-static block");
        this.c=50;         // setting the value of c
    }

    public static void main(String[] args) {

        StaticExample obj= new StaticExample();  // Before executing this constructor, two Non-static blocks are executed    
        System.out.println(StaticExample.a+" "+StaticExample.b+ " " + obj.c);   // 4 20 50

        StaticExample.b+=3;
        System.out.println(StaticExample.a+" "+StaticExample.b);    // 4 23


        /*
            Static Block
            -------------
            If we need to do computation in order to initialize our static variables, we can declare a static block that gets executed exactly once, 
            when the class is first loaded.
        
            As soon as the StaticExample class is loaded, all of the static statements are run. First, a is set to 4, then the static block executes, which prints a message and then initializes b to a*4 or 20. 
            Then main() is called, which prints a,b and c . 
            
            After that b is incremented by 3. But static block does not run again.

        */

        /*
            Non-static Block
            -------------
            Non-static blocks will execute only once before the constructor for that class is executed. We can include multiple such blocks.
            In that case, the flow of execution is top to bottom.

            This is useful for setting the values of some properties beforehand, as shown in the example above.

        */
    }
}
