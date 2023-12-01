package Code.Exception_Handling;

public class CustomizedExceptions {
    /* 
        Important Keywords in Exception Handling
        ----------------------------------------

        1. try --> to maintain risky code
        
        2. catch --> to maintain exception handling code

        3. finally --> to maintain cleanup code

        4. throw --> to hand-over our created exception object to the JVM manually

        5. throws --> to delegate responsibility of exception handling to the caller

        Customized or User-defined Exception
        ------------------------------------
        Sometimes, to meet programming requirements we can define our own exceptions, such exceptions are called customised exceptions.
         Ex. TooYoungException, TooOldException, InsufficientFundsException etc.

        class TooYoungException extends RuntimeException{
    
            TooYoungException(String s){
                super(s);       // to make the description available to the default Exception handler, we're using super()
            }
        }
    
        class TooOldException extends RuntimeException{
    
            TooOldException(String s){
                super(s);
            }
        }
    
        class CustomException{
            
            public static void main(String[] args){
                int age= Integer.parseInt(args[0]);
    
                if(age> 60) throw new TooYoungException("Please wait further to get best match");
    
                if (age<18) throw new TooOldException("You have already crossed the max age for marriage");
    
                System.out.println("You will get match details by email soon!!");
            }
        }
        
        Note:
        -----       
        1. Throw keyword is best suitable for user-defined exceptions but not for pre-defined exceptions.

        2. It is highly recommended to defined customized exceptions as unchecked i.e. we have to extend RunTimeException but not Exception. Otherwise, compiler will make unnecessary
         mess.

         
        */
    }
    