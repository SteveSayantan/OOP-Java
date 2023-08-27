package Code;

public class ObjectMethods {
    /* 
        Every class in java inherits from Object class. When a class inherits from another class that class or that class's parent class 
        is already inheriting object class that is how every class must inherit object class.
    */
    int num;

    public ObjectMethods(int num) {
        this.num = num;
    }
    


    @Override
    public int hashCode() {     // It gives an unique representation of an object using number (random integer value, formed using an algorithm)
        
        return super.hashCode();
        
    }

    

    @Override
    public boolean equals(Object obj) {     // Generally it compares the content of both the object, but here we are overriding it
        
        return num==((ObjectMethods)obj).num;   // Type casting obj to ObjectMethods class and compairing the 'num' property
    }



    public static void main(String[] args) {
        ObjectMethods temp= new ObjectMethods(19);
        ObjectMethods temp2= new ObjectMethods(19);

        System.out.println(temp.hashCode());    // 1995265320 for every object this value is unique
        System.out.println(temp.equals(temp2)); //true     since we are comparing the num property

        System.out.println(temp instanceof ObjectMethods);  // true, It is used to check whether an object is the instance of a particular class

        System.out.println(temp2.getClass());   // class Code.ObjectMethods (this method returns a Class object which has a lot of methods)
        System.out.println(temp2.getClass().getSimpleName());   // ObjectMethods (exists in Class object returned by getClass() )
    }
    
}
