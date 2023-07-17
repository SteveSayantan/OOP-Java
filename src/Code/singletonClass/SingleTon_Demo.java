package Code.singletonClass;

public class SingleTon_Demo {
    public static void main(String[] args) {
        // This is the first call, hence an object will be returned of class SingleTon_Example
        SingleTon_Example obj= SingleTon_Example.returnInstance();
        
        // All the following calls will return the same reference stored in 'obj'
        SingleTon_Example obj2= SingleTon_Example.returnInstance();
        SingleTon_Example obj3= SingleTon_Example.returnInstance();

        // Hence, obj1,obj2,obj3 are pointing to just one object.
    }
}
