package Code.singletonClass;

public class SingleTon_Example {
    /* 
        If we have a class and we want to create only one instance of that class, we can achieve that via SingleTon class.

        Here, we shall not allow users to call constructor for this this class more than once, hence, only one object will
        be created.
        Moreover, we shall return only one instace of this class again and again.
     */

    private SingleTon_Example(){}  // declaring the constructor as private to prevent usage outside this class.

    // Just declaring an object of this class
    public static SingleTon_Example instance;       

    // Instead of the constructor, we shall call the following method to get an instance of this class
    public static SingleTon_Example returnInstance(){
        
        // Initially, the 'instance' will be null, hence create one  
        if(instance==null){
            instance=new SingleTon_Example();
        }
        return instance;

    }
    /* 
        Reason for adding 'public' and 'static' to 'instance' and 'returnInstance':
        ---------------------------------------------------------------------------

        As we already know, we can not call the constructor for this class, hence we must declare both of these as 'static',
        so that they can be used via the class reference without creating an instance of this class.

        They are declared 'public' to allow access outside this class.

    */

}
