package Code.Exception_Handling;


public class Throw {
    public static void main(String[] args) {
        /* 
            Throw keyword
            -------------
            After creating an Exception Object explicitly, Programmer throws it using 'throw' keyword, JVM catches that Exception.

            Sometimes we can create Exception Objects explicitly and we can hand over it to the JVM manually. We can do that using 'throw' keyword.
            Ex.
                thow new ArithmeticException("/ by zero")

            In the example above, we created the ArithmeticException Object explicitly (using new keyword) and handed over that to the JVM manually using 'throw' .

            Code 1:
            -------
            class Test{
                public static void main(String[] args) {
                    System.out.println(10/0);       // Exception in thread "main": java.lang.ArithmeticException: / by zero at Test.main()
                }
            }
            In the above case, main method is responsible to create Exception object and hand over to JVM.

            Code 2:
            -------
            class Test{
                public static void main(String[] args) {
                    throw new ArithmeticException("/ by zero");       // Exception in thread "main": java.lang.ArithmeticException: / by zero at Test.main()
                }
            }
            In the above case, programmer creates Exception object explicitly and hand over to JVM manually.

            Note: Best usage of 'throw' keyword is for user-defined/customised exceptions.

            Case 1:
            ------
            throw e;
            
            If 'e' refers to null, we shall get NullPointerException

            class Test{
        
                static ArithmeticException e= new ArithmeticException();
                public static void main(String[] args) {
                    throw e;        // gives ArithmeticException (at runtime)
                }
            }

            class Test{
        
                static ArithmeticException e;
                public static void main(String[] args) {
                    throw e;        // gives NullPointerException (at runtime)
                }
            }

            case 2:
            ------
            After 'throw' we're not allowed to write any statement directly, otherwise we shall get compile-time error saying unreachable statement.
            However, if 'throw' is used conditionally, the above rule is not applicable.

            class Test{
        
                public static void main(String[] args) {
                    
                    System.out.println(10/0);        // gives ArithmeticException (at runtime)
                    System.out.println("Hello");
   
                }
            }

            class Test{
        
                public static void main(String[] args) {

                    throw new ArithmeticException("/ by zero");        
                    System.out.println("Hello");        // gives unreachable statement (compile-time error)
                           
                }
            }

            case 3:
            -------
            We can use 'throw' keyword only for throwable types. If we're trying to use with normal java objects we shall get compile-time error.
            
            class Test{
        
                public static void main(String[] args) {

                    throw new Test();    // gives compile-time error (incompatible types)    
                                              
                }
            }

            class Test extends RuntimeException{
        
                public static void main(String[] args) {

                    throw new Test();    // Exception in thread "main": Test at Test.main()    
                                              
                }
            }

            */
        }
    }

