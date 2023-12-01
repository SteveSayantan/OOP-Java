package Code.Exception_Handling;

public class FinallyBlock {
   public static void main(String[] args) {
    /* 
        Final:
        -----
        It is a modifier applicable for classes, methods and variables. 
        
        If a class is declared as final, it can't be extended i.e. we can't create child class for that class.

        If a method is declared as final, it can't override that method in the child class.

        If a variable is declared as final, it can't perfrom reassignment for that variable .

        Finally:
        -------
        Finally is a block, always associated with try-catch to maintain cleanup code.
         
        try{
            // risky code
        }
        catch (Exception e){
            // handling code
        }
        finally{
            // cleanup code
        }

        Finally block will be executed always irrespective of whether exception has occured or not or whether exception has been handled or not 

        Finalize
        --------

        It is method always invoked by Garbage Collector just before destroying an object to perform cleanup activities. Once finalize method completes,
         immediately GC destroys that object.

        Note: Finally block is responsible to perform cleanup activities related to try block i.e. whatever resources we opened as a part of try block will be 
         closed inside Finally block. 

        Whereas finalize method is reponsible to perform cleanup activities related to object i.e. whatever resources associated with object will be deallocated before destroying an object by 
         using finalize method.

        Various Possible Combinations of Try,Catch & Finally
        ----------------------------------------------------
        In try-catch-finally order is  important.

        Whenever we are writing try, we must write either catch or finally, otherwise we shall get compile-time error i.e. try w/o catch or finally is invalid. 

        Whenever we are writing catch block, compulsorily try block is required i.e. catch without try is invalid.

        Whever we are writing finally block, we must write try block i.e. finally without try is invalid.

        Inside try, catch, and finally blocks we can declare try, catch and finally blocks i.e. nesting of try-catch-finally is allowed.

        For try, catch and finally blocks curly braces are mandatory.

        Examples:
        ---------
        1. try , finally --> valid

        2. try, catch, try, finally --> valid

        3. try --> invalid

        4. catch --> invalid

        5. finally --> invalid

        6. try , finally, catch --> invalid (try-finally valid, catch becomes alone)

        7. Invalid (separate try and catch)
            try{

            } 
            System.out.println("Hello");
            catch (Exception e){

            }
        8. Invalid (catch without try)
            try{

            } 
            catch (Exception e){

            }
            System.out.println("Hello");
            catch (Exception e){

            }
        9. Invalid (finally without try)
            try{

            } 
            catch (Exception e){
                
            }
            System.out.println("Hello");

            finally{

            }
        
        10. Valid
            try{
                try{

                }
                catch(Exception e){

                }
            }
            catch (Exception e){

            }
        11. Invalid (try without catch/finally)
            try{
                try{

                }
            }
            catch (Exception e){

            }

        12. Valid
            try{
                try{

                }
                finally{

                }
            }
            catch (Exception e){

            }

        13. Valid

            try{
                
            }
            catch (Exception e){
                try{

                }
                finally{

                }
            }
        14. Invalid (finally without try)
            try{
    
            }
            catch (Exception e){
                
                finally{
    
                }
            }

        15. Valid 
            try{
    
            }
            catch (Exception e){
                
            }
            finally{
                try{

                }
                catch(Exception e){

                }
            }

        16. Invalid (finally without try) 
            try{
    
            }
            catch (Exception e){
                
            }
            finally{

                finally{

                }

            }
        17. Invalid (finally without try) 
            try{
    
            }
            catch (Exception e){
                
            }
            finally{

                
            }            
            finally{

            }

     */
   } 
}
