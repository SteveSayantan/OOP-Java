package Code;

public class StaticExample {
    static int a=4;
    static int b;

    static{     // will only run once, when the class is loaded for the first time
        System.out.println("Static block executed");
        b=a*5;
    }

    public static void main(String[] args) {

        StaticExample obj= new StaticExample();
        System.out.println(StaticExample.a+" "+StaticExample.b);   // 4 20

        StaticExample.b+=3;
        System.out.println(StaticExample.a+" "+StaticExample.b);    // 4 23


        /*
            Static Block
            -------------
            If you need to do computation in order to initialize your static variables, you can declare a static block that gets executed exactly once, 
            when the class is first loaded.
        
            As soon as the StaticExample class is loaded, all of the static statements are run. First, a is set to 4, then the static block executes, which prints a message and then initializes b to a*4 or 20. 
            Then main() is called, which prints a & b . After that b is incremented by 3. But static block does not run again.

        */
    }
}
