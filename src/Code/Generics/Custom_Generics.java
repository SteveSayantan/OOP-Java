package Code.Generics;

public class Custom_Generics{
    /* 
       Based on our requirement, we can create our own Generic Classes also.
        E.g.
        
        class Account <T>{      // Naming the type parameter as T is convention, any valid Java identifier is allowed.
            ...
        }

        Account <Gold> a= new Account <Gold> ();
        Account <Platinum> a= new Account <Platinum> ();

        Based on our requirement, we can declare any number of type parameters. Each parameter should be separated by comma ,
         E.g.

         class Test <X,Y,Z> {

         }

         class Hashmap <K,V> {  // K represents Key Type and V represents Value Type

         }

         Hashmap <Integer, String> h = Hashmap <Integer, String> ();
    */

    public static void main(String[] args) {
        
        Gen<String> str=new Gen<String>("Hello");
        str.show();     // The type of ob: java.lang.String
        System.out.println(str.getOb());


        Gen<Double> dbl=new Gen<Double>(23.5);
        dbl.show();     // The type of ob: java.lang.Double
        System.out.println(dbl.getOb());

        
    }
}

class Gen<T>{

    T ob;   // Based on our runtime requirement, T will be replaced with our provided type

    public Gen(T ob) {  
        this.ob = ob;
    }

    public void show(){
        System.out.println("The type of ob: "+ob.getClass().getName());
    }

    public T getOb(){
        return ob;
    }

    

    
    
}
