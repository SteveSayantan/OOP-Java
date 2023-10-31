package Code.Generics;

public class Bounded_Type_Parameter {
   /* 
        class Test <T>{     // Any type can be passed as type parameter , hence unbounded type
            ...
        }

        We can bound the type parameter within a range by using `extends` keyword, such types are called bounded types.
         Ex:

            class Test <T extends Number>{     // Only Number and its child classes (Byte,Short,Int,Float,Double,Long) can be passed as type parameter , hence bounded type
                ...
            }

            Test <Integer> t1 = new Test<Integer>();    // valid
            Test <String> t2 = new Test<String>();      // Compile time error

         We can only define bounded type using `extends` keyword ; `implements` , `super` not allowed ; But we can replace `implements` keyword's purpose with `extends` . 
         

         Syntax:
         ------
            class Test <T extends X >{     // X can be class or Interface. 
                ...
            }

            If X is a class, as a type parameter, X or its child classes are allowed.
            If X is a Interface, as a type parameter, X or its implementation classes are allowed.

        
            class Test <T extends Runnable >{     // Runnable is an interface
                ...
            }

            Test <Runnable> t1 = new Test<Runnable>();    // valid
            Test <Thread> t2 = new Test<Thread>();      // Thread is an implementation class of Runnable
            Test <Integer> t2 = new Test<Integer>();      // Integer is not an implementation class of Runnable, hence C.E.
         
         Combination of Class and Interface:
         -----------------------------------
         We can define bounded types even in combination also.

         Ex. 
           class Test <T extends Number & Runnable>{ // Anything that is child class of Number and implements Runnable is allowed as type parameter

           }

           class Test < T extends Runnable & Comparable>{ // Anything that implements both Comparable and Runnable is allowed as type parameter

           }

           class Test < T extends Runnable & Number >{ // Invalid, we have to provide class first, followed by interface 

           }

           class Test < T extends Runnable & Number >{ // Invalid, we can't extend more than one class simultaneously

           }
    */ 

    
}
