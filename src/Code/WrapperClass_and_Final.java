package Code;


public class WrapperClass_and_Final {
    public static void main(String[] args) {
        
        // Integer is the wrapper class for int, we can use those to create integers. This wrapper class has so many functions.

        Integer a=20;       // Now, this is no more a primitive, it is an object in heap.
        Integer b=45;
        int c=56;

        // Calling by reference as both are objects
        swap(a, b);     // But still they do not get swapped, as 'Integer' is 'final' class


        // 'final' keyword 
        final int INCREMENT=2;      // Now, we can not modify this 'INCREMENT' variable. Such variables must be written in UPPERCASE entirely, initialized while declaring.
        // INCREMENT =3 ;             // Gives error

            /* 
                However, if the variable is of reference type, this behavior of 'final' is not observed. 
                In case of reference variables, 'final' prevents reassignment to that reference variable but, the object referenced by that
                variable can be modified.
            */

            final Example canBeModified= new Example("Harry");
            canBeModified.name="Steve";             // The object referenced to can be changed

            // canBeModified=new Example("Kunal");         // This is not allowed


            
    }   

    static void swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class Example{
    final int num=45;   // we can declare 'final' property in a class
    String name;

    Example(String name){
        this.name=name;
    }


}


