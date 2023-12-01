package Code.access_modifiers;

public class ClassModifiers {
    /* 
        Whenever we are writing our own classes, we've to provide some info about our classes to JVM.

         # Whether this class can be accessible from anywhere or not.
         # Whether child class creation is possible or not.
         # Whether object creation is possible or not.

        We can specify these info by using appropriate modifiers.

        The only applicable modifiers for top level classes are --> public,<default>, final, abstract,strictfop

        The only applicable modifiers for inner classes are --> public,<default>, private,protected,static final, abstract,strictfop

        In old languages like C++, 
         public, private,protected,<default> these are known as access specifiers. The remaining ones are considered as access modifiers.

        But in Java, all are considered as access modifiers only.

        Public Classes
        --------------
        If a class is declared as public, the we can access that class from anywhere.
        
        A.java
        -------

        package pack1;

        public class A{

            public void m1(){

                System.out.println("Hello");
            }
        }

        `javac -d . A.java` --> compiles fine and creates A.class file inside pack1.

            pack1
            |- A.class

        B.java
        -------

        package pack2;
        import pack1.A;

        class B{

            public static void main(String[] args){
                A a= new A();
                a.m1();
            }
        }

        `javac -d . B.java` --> compiles fine and creates B.class file inside pack2.

        `java pack2.B` --> "Hello"

        If class A is not public, then while compiling B class, we shall get compile-time error.

        Default Classes
        ---------------
        If a class is declared as default then we can access that class only within the current package. Hence,
         default access is also known as package level access.

        Final Modifier
        -------------

        Final is a modifier applicable for classes methods and variables.

        Final Method
        ------------
        Whatever methods parents has, those are by default available to the child through inheritance. If the child is not
         satisfied with parent method implementation than child is allowed to redefine that method based on its requirement.
         This process is called overriding.
        
        If parent class method is declared as 'final', we can't override that method in child class because its implementation is final.

        Final Class
        -----------
        If a class declared as final, we can't extend functionality of that class i.e. we can't create child classes for 
         that class i.e. inheritance is not possible for final classes.

        Every method in final class is always final by default. But every variable inside final class need not to be final.

        final class P{

            static int x=10;

            public static void main(String [] args){

                x=772;                      // reassigning x, as it is not final
                System.out.println(x);      // 772 
            }
        }

        The main advantage of final keyword is we can achieve security and we can provide unique implementation. But we miss out
         on Inheritance (due to final class) and polymorphism (due to final method). Hence, it is recommended not to use final
         class without any reason.
     */
}
