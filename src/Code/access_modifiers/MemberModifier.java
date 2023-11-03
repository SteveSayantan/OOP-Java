package Code.access_modifiers;

public class MemberModifier {
    /* 
        Member modifier: method or variable level modifiers

        1. public members:
        -------------------
        If a member is declared as public, we can access that member from anywhere.
         But corresponding class should be visible i.e. before checking member visibility we have to check class visibility.

        A.java
        -------
         package pack1;

         class A{
            public void m1(){
                System.out.println("A class method");
            }
         }

        `javac -d . A.java` --> compiles fine

        B.java
        -------
         package pack2;

         import pack1.A;

         class B{
            public static void main(String[] args){
                A a = new A();
                a.m1();
            }
         }

        `javac -d . B.java` --> gives compile-time error as A is not visible

        In above program even though m1 is public, it can not be accessed since the class A is not public. 

        <default> members:
        -----------------
        If a member is declared as default, then we can access that member only within the current package. From outside of the package, we 
         can't access. 

        private members:
        ----------------
        If a member is private, then we can access that member only within the class i.e. from outside of the class we can't access.

        Abstract methods should be available to the child classes to provide implementation whereas private methods are not available to the child classes. Hence, 
         private abstract combination is illegal for methods.

        protected members: (The most misunderstood modifier in Java)
        -----------------
        If a member is declared as protected, we can access that member anywhere within the current package but only in child classes of outside packages.

         protected= default + kids
        
        We can access protected members within the current package anywhere either by using parent or child ref.
         But we can access protected members within outside package only in child classes and we should use ** that child ref. ** only.
         Parent ref. can not be used to access protected members from outside package.

        A.java
        ------
        package pack1;
        
        public class A{

            protected void m1(){
                System.out.println("Protected Access Granted");
            }
        }

        class B extends A{      // inside package pack1

            public static void main(String[] args){

                A a = new A();
                a.m1();     // valid

                B b = new B();
                b.m1();     // valid

                A c = new B();
                c.m1();     // valid

            }
        }

        C.java
        ------
        package pack2;      // different package pack2
        import pack1.A;

        class C extends A{

            public staic void main(String[] args){

                A a = new A();
                a.m1();     // invalid, gives Compile-time error

                C b = new C();
                b.m1();     // valid

                A c = new C();
                c.m1();     //  invalid, gives Compile-time error

            }
        }

        class D extends C {     // inside pack2

            public static void main(String[] args){

                // Inside class D, if we try to access m1, we need to use class D as reference (as we are inside class D which is a child of class A)

                D d = new D();
                d.m1();     // valid

                C c = new D();
                c.m1();     // invalid, gives Compile-time error

                A a = new D();
                a.m1();     // invalid, gives Compile-time error

                A b = new C();
                b.m1();     // invalid, gives Compile-time error
            }

        }
        

        
        */
    }
