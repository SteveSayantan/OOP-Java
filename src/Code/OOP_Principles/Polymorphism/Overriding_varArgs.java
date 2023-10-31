package Code.OOP_Principles.Polymorphism;

public class Overriding_varArgs {
    /* 
        We can override vararg method with another vararg method only. If we are trying to override with normal method, then it will become 
         overloading but not overriding.
        e.g., 
            class P{

                public void m1(int ...x){
                    System.out.println("Parent");
                }
            }

            class C{
                
                // The following is overloading, not overriding
                public void m1(int x){      // Had this been a varArg method, it would be overriding
                    System.out.println("Child");
                }
            }

            class Test{

                public static void main(String[] args){

                    P p = new P();
                    p.m1(10);   // "Parent"

                    C c = new C();
                    c.m1(10);   // "Child"

                    P p1 = new C();
                    p1.m1(10);   // "Parent"  (In overloading, method resolution is handled by compiler based on ref. type)
                }
            }

        Overriding variables (Not possible)
        --------------------

            class P {
                int x= 888;     (can be static/non-static)
            }

            class C extends P {
                int x= 999;     (can be static/non-static)
            }

            class Test{

                public static void main(String[] args){

                    P p = new P();
                    System.out.println(p.x);   // 888

                    C c = new C();
                    System.out.println(c.x);   // 999

                    P p1 = new C();
                    System.out.println(p1.x);   // 888 
                }
            }

            Either or both of the 'x' can be of type static/non-static but that will not affect the output as variable resolution is handled by 
             compiler based on ref. type.

        Difference between Overloading and overriding
        ---------------------------------------------
        
        1. Method names must be same in both cases.

        2. In overloading, argument types must be different (at least order) . But in overriding, the args must be the same (including order).

        3. In overloading, method signatures must be different. In overriding, method signatures must be the same.

        4. In overloading, no restriction about return type. In overriding, return type must be the same or co-variant return type is allowed.

        5. In overloading, private, static, final methods can be overloaded . In overriding, it is not possible.

        6. In overloading, no restriction about access modifiers . In overriding, access modifer with same or greater flexibility is allowed only.

        7. In overloading, method resolution is taken care by compiler based on ref. type . In overriding, method resolution is taken care by JVM based on run-time object.

        8. In overloading, no restriction about throws clause. In overriding, if child class method throws any checked exception, parent class must throw same checked exception 
         or its parent. But no restriction for unchecked exception.

        Note:
        -----
         In overloading we have to check only method names (must be same) and argument types (must be different). We are not required to check remaining things like return type,
          access modifiers etc.

          But in overriding, we have to check everything like method name, arg type, return type, access modifier, throws clause etc.

        Suppose we have the following method in a parent class,
         
            public void m1 (int x) throws IOException {
                ...
            }
        
        Which of the following methods can be there in the child class:

            1. public void m1(int i) {...}      // valid, overriding

            2. public static int m1(long l) {...}      // valid, overloading but not overriding (since, arg type is different)

            3. public static void m1(int i) {...}      // invalid, can not override a non-static method with a static one

            4. public void m1 (int i) throws Exception {...}      // invalid, in overriding the parent class must throw the same exception as child method or its parent-type.

            5. public static abstract void m1 (double d) {...}      // invalid, abstract method can not be static (compile time error)

        
     */
}
