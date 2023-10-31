package Code.InnerClass;

public class InnerClass_RegularInnerClass {
    /* 
        From regular inner class we can access static and non-static members of outer class directly.

        Ex.

        class Outer{

            int x=10;
            static int y=20;

            class Inner{

                public void m1(){
                    System.out.println(x);      // 10
                    System.out.println(y);      //20
                }
            }

            public static void main(String[] args){
                
                new Outer().new Inner().m1();
            }
        }

        Within the inner class, 'this' always refers to current inner class object. If we want to refer current outer class object, we have to use
         'outer_classname.this'

        class Outer{

            int x=10;

            class Inner{

                int x=100;

                public void m1(){
                    int x=1000;
                    System.out.println(x);      // 1000

                    System.out.println(this.x);      //100  or, we could've written `Inner.this.x`

                    System.out.println(Outer.this.x);      //10 
                }
            }

            public static void main(String[] args){
                
                new Outer().new Inner().m1();
            }
        }

        Only applicable for outer classes are: public,<default>, final, abstract, strictfop. 
        
        But for inner classes, applicable modifiers are: public,<default>, final, abstract, strictfop, 
         private, static, protected.

        Nesting of Inner Class
        ----------------------

        Inside inner class we can declare another inner class i.e. nesting of inner class is possible.

        class A {

            class B{

                class C {
                     
                    public void m1(){
                        System.out.println("Innermost class method")
                    }
                }
            }
        }

        class Test{

            public static void main(String[] args){

                A a = new A();
                A.B b = a.new B();
                A.B.C c = b. new C();
                c.m1();
            }
        }
     */
}
