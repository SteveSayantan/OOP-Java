package Code.Generics;

public class WildCard_Generics {
    
    // complete rules for overriding in Polymorphism/Square.java

    /* 
       1.  m1(ArrayList <String> l){
            ...
          }

          -- This method can only be called using ArrayList of String type.
          -- But, inside this method, we only can add String and null to ArrayList l.

       2.  m1(ArrayList <?> l){
            ...
          }

          -- This method can be called using ArrayList of any type.
          -- But,inside this method, we only can add null to ArrayList l. This is because, the type of ArrayList l is unknown in compile time.
          -- This type of method is suitable for read only operations.

       3.  m1(ArrayList <? extends X> l){
            ...
          }

          -- X can be class or interface.
          -- If X is a class then we can call this method by passing ArrayList of either X type or its child classes.
          -- If X is an interface then we can call this method by passing ArrayList of either X type or its implementation classes.
          -- Within the method, we can't add anything to the list except null. As we don't know the type of ArrayList l exactly
          -- This type of method is suitable for read only operations.

       4.  m1(ArrayList <? super X> l){
            ...
          }

          -- X can be class or interface.
          -- If X is a class then we can call this method by passing ArrayList of either X type or its super classes.
          -- If X is an interface then we can call this method by passing ArrayList of either X type or super class of interface X (e.g. Parent Interface of Z,Object class )
            
          -- Within the method, we can add null and objects of type X .
          -- This type of method is suitable for read only operations.

        Important Usecases
        ------------------
          1. ArrayList<String> l=new ArrayList<String>(); // valid

          2. ArrayList<?> l=new ArrayList<String>();  // valid

          3. ArrayList<?> l=new ArrayList<Integer>(); // valid

          4. ArrayList<? extends Number> =new ArrayList<Integer>(); // valid

          5. ArrayList<? extends Number> =new ArrayList<String>(); // invalid, As String is not child class of Number

          6. ArrayList<? super String> =new ArrayList<Object>(); // valid

          7. ArrayList <?> l= new ArrayList <?>();  // invalid, as we can not use wildcard in the rhs part, we must mention a class or interface without any boundary.

          8. ArrayList <?> l= new ArrayList <? extends Number>();  // invalid, as we can not use wildcard in the rhs part, we must mention a class or interface without any boundary.
    */  
    
}


