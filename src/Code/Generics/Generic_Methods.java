package Code.Generics;

public class Generic_Methods {
   /* 
        Type parameter is declared at class level (after class name). We can use this type parameter within this class as per our requirement. 
            class Test <T> {
                ...
            }

        But when we want to have type-safety only at method level, not at class level, we can add type parameter just before the return type of the method,

            class Test{     // normal class

                public  <T>void m1 (T ob){   // we can use this type parameter anywhere inside this method as per requirement, e.g. in this case, it has been used as the type of the parameter 
                    ...
                }

                public  <T>void m2 (){  
                    ...
                }
            }
        
        We can use bounded type parameter at the method level also, e.g.
            
            public <T extends Number> m1(){...}

            public <T extends Runnable> m1(){...}

            public <T extends Number & Runnable> m1(){...}

            public <T extends Comparable & Runnable> m1(){...}

            public <T extends Number & Comparable & Runnable > m1(){...}

            public <T extends Runnable & Number> m1(){...} // invalid as we have to write class first

            public <T extends Number & Thread> m1(){...} // invalid, can't extend more than one classl=


        Communication with non-generic code
        ---------------------------------
          If we send generic object to non-generic area, then it starts behaving like non-generic object. Similarly, if we send, non-generic object
           to genric area, then it starts behaving like generic object i.e. the location in which the object is present based on that behaviour will be defined.
           
          class Test{

            public static void main(String[] args){

                ArrayList <String> l= new ArrayList<String>();  // This ArrayList is generic

                // Generic area starts

                l.add("durga");
                l.add("ravi");
                l.add(10.9);      // invalid, C.E.

                m1(l);      // sending generic ArrayList to non-generic area (as m1 takes a non-generic ArrayList as arg)
                System.out.println(l);  ["durga","ravi",10,10.5,"hello"]

                l.add(20.1)     // invalid,C.E

                // Generic Area ends
            }

            public static void m1(ArrayList l){    // l is non-generic
                // non-generic area starts

                l.add(10);
                l.add(10.5);
                l.add("hello");

                // non-generic area ends
            }
          }

        Generics -- Compile time Only
        ------------------------------
        The main purpose of generics is to provide type-safety and to resolve type-casting problems. Type-safety and Type-casting both are applicable at compile time, hence
         generics concept also applicable only at compile time but not at run time. At the last step of compilation, generic syntax will be removed. Hence for the JVM generic syntax won't be
         available.

         e.g.
         ArrayList l= new ArrayList<String>();      // non-generic ArrayList ref can hold generic ArrayList object.

         // since, compiler only checks the ref variable part and it is non-generic, we shall not get any compilation error for the following

         l.add(10);
         l.add(true);
         System.out.println(l);  // [10,true]

         // Now, in the runtime, there is no existance of generic syntax, therefore no runtime error will occur as well
         
        From the discussion above, we can conclude that the following declaration are equal:

          ArrayList l = new ArrayList <String>();
          ArrayList l = new ArrayList <Integer>();
          ArrayList l = new ArrayList <Double>();
          ArrayList l = new ArrayList ();

        Following declarations are also same:

          ArrayList <String> l= new ArrayList<String>();
          ArrayList <String> l= new ArrayList();        // no existance of generic syntax in runtime, hence we can omit from the rhs
        
        Since, the ref variables are of ArrayList<String>, we can only add Strings to these.

        
        Generics -- Compile time Only (Another Proof)
        ---------------------------------------------

        class Test{

            public void m1(ArrayList<String> l){   // its erasure looks like m1(ArrayList l) 
               ... 
            }

            public void m1(ArrayList<Integer> l){   // its erasure looks like m1(ArrayList l)
                ...
            }
        }

        The code above may seem a simple example of method overloading, but it will give compile time error.

            Why?
            ----
            At compile time,

             i. Code is compiled normally by considering generic syntax
            ii. Generic syntax is removed
           iii. Resultant code is again compiled normally

           Now, at the third stage, since the generic syntax is removed, the method signature of both the methods 
            becomes the same. Hence, we get a compilation error.

            method signature after removing generic syntax is known as erasure.
        
        Hence, we can conclude that Generic concept is only applicable at compile time and not at run time.
    */
}
