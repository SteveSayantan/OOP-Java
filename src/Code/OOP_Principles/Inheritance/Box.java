package Code.OOP_Principles.Inheritance;

public class Box {
       
    private int height;
    int length;
    int width;

    Box(int side){
        /*
            Even though Box is not derived from any other class, it calls super() implicitly, which in turn calls Object Class constructor.
            Every class in Java inherits from this Object class.
         */
        
        // super();        // Object Class            
        this.length=side;
        this.width=side;
        this.height=side;
    }
    Box(int l,int w,int h){
        this.length=l;
        this.width=w;
        this.height=h;
    }

    Box (Box old){      // This type of constructor is also called copy constructor
        this.length=old.length;
        this.height=old.height;
        this.width=old.width;
    }
        
}




