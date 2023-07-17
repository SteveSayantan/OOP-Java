package Code;

public class InnerClass_Example {   // This class is not inside any class, therefore it can't be static.

    class NonStatic_inner{      // This inner class must need an object of the InnerClass_Example, as it is not static.
        String name;

        public NonStatic_inner(String name){
            this.name=name;
        }
    }


    static class Static_inner{
        String name;

        public Static_inner(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {

        // NonStatic_inner notPossible= new NonStatic_inner("Gives Error");         // Gives Error, because main() is static and NonStatic_inner is non-static.

        AnotherOuterClass_Example test = new AnotherOuterClass_Example();   // This is possible because AnotherOuterClass_Example is not dependent on any other class

        Static_inner test2= new Static_inner("Thompson");       // Static_inner is a static class, hence does not depend on any object of InnerClass_Example, therefore can be used directly like normal classes.
        Static_inner test3= new Static_inner("John");       

        // test2.name;     // Thompson
        // test3.name;     // John

        InnerClass_Example newExample= new InnerClass_Example();
       
        InnerClass_Example.NonStatic_inner test5= newExample.new NonStatic_inner("Rahul");          // Doubt

        

    }
    
}

class AnotherOuterClass_Example{}    // This is also an outer class, therefore can not be static.

/* 
    Classes inside a class are called inner classes. Inner classes can be static, but the classes that are not
    inside any class, can not be static.

    --> Because, if a method/property/class is static, it is static wrt. some other class, but in case of Outer classes
        that parent class is not present.
*/
