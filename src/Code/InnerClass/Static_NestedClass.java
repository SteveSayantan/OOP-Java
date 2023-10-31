package Code.InnerClass;

public class Static_NestedClass {
    /* 
        Sometimes we can declare an inner class with 'static' modifier. Such type of inner classes are called Static Nested classes.

        In the case of regular inner class, w/o the existance of outer class obj, inner class obj can not exist i.e. inner class obj 
         is strongly associated with the outer class obj.

        But in the case of static nested classes, without the existance of outer class obj, there may be a chance of existing nested 
         class object, hence static nested class object is not strongly assoicated with outer class object.
        
        However, the .class file generated will have the same name Outer$Nested.class

        class Outer{

            static class Nested{

                public void m1(){

                    System.out.println("Static Nested Class Method");
                }
            }

            public static void main(String[] args){

                Nested n = new Nested();    // No need to create outer class object
                n.m1();     // "Static Nested Class Method"
            }
        }

        If we want to create nested class object from outside of the outer class, then we can create as follows:

            `Outer.Nested n= new Outer.Nested();`

        In regular inner classes, we can't declare any static members
         But in static nested classes, we can declare static members including main method. Hence, we can invoke static nested class
         directly from command prompt.

         class Test{
     
             static class Nested{
     
                 public static void main(String[] args) {
                     System.out.println("static nested class main method");
                 }
                 
             }
             public static void main(String[] args) {
                 System.out.println("outer class main method");
             }
         }
        
         `javac Test.java` --> creates two .class files Test.class and Test$Nested.class

         `java Test` --> "outer class main method"

         `java Test\$Nested` --> "static nested class main method"


        From regular inner classes we can access both the static and non-static members of outer class directly. But from static nested classes, we can only 
         access static members of outer class directly. We can't access non-static members.

         class Test{
            
            int x=10;
            static int y =20;

            static class Nested{
    
                public void m1() {
                    System.out.println(x);      // Gives compile-time error

                    System.out.println(y);
                }
                
            }
            
         }

        Differences between regular inner class and static nested class
        ----------------------------------------------------------------

         1. Without the existance of outer class obj, inner class obj can't exist i.e. inner class obj is strongly associated with outer class object.
            Without the existance of outer class obj, static nested class obj can exist i.e. static inner class obj is not strongly associated with outer class object.
        
         2. In regular inner class we can't declare static members. In static nested classes we can.

         3. In regular inner class we can't declare main method, hence we can't invoke inner class from command prompt . In static nested classes we can
            declare main method, hence we can invoke nested class directly from command prompt.

         4. Inside regular inner class we access static and non-static members of outer class directly. In static nested classes we can only access the static
            members of the outer class.

    */

}
