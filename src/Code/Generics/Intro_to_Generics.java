package Code.Generics;

public class Intro_to_Generics {
    /* 
        Generics are required to provide type-safety and solve type-casting problems. Ref: https://youtu.be/watjoMfP-3M?si=lqBQZxWfLTgjhrCw

        Type-Safety
        ------------
        Arrays are type-safe i.e. we can give the guarantee for the type of elements present inside array. It holds elements of its own class or child classes i.e. array is polymorphic in nature. 

        But, collections are not type-safe i.e. we can not give guarantee for the elements present inside collection.
        E.g.
            ArrayList l= new ArrayList();
            l.add(34);  // valid
            l.add("hello") // valid

        But arrays are fixed in size, therefore, if we don't know the size beforehand, we have to use collections i.e. no type-safety .
        To solve this problem, we use Generics. Generics provide type-safety to the collections.

        Type-Casting
        ------------
        In the case of arrays, at the time of retrival, it is not required to perform type-casting because
        there is a guarantee for the type of elements present inside the array.

        E.g.
            String[] s= new String[3];
            String name1=s[0];      // valid, type-casting not required

        But in the case of collections, at the time of retrival, compulsory we should perform type-casting (even if the element is of the same type) because there is no guarantee for
        the type of elements present inside collection. Otherwise, we get compile time error.

        E.g.
            ArrayList l= new ArrayList();
            l.add("hello");

            String name= l.get(0);      // invalid, compile time error
            String name= (String)l.get(0);      // valid

        Hence, type-casting is bigger headache in case of collections.

        To overcome above problems of collections, Generics concept was introduced.

        Using Generics
        ---------------

        With the help of generic version of ArrayList, we can ensure type-safety
        E.g.
            ArrayList<String> m= new ArrayList<String>();     // It can only hold String objects

        Therefore, at the time of retrival, no type casting is required.

        In the example stated above, at the lhs, 'ArrayList' is called the base type, 'String' is the parameter type.

        We can apply polymorphism to the base type like this,
            List<String> a= new ArrayList<String>();
            Collection<String> c= new ArrayList<String>();

        but we can not apply polymorphism to the parameter type,
            ArrayList<Object> l= new ArrayList<String>();  // Invalid, gives compile time error

        We can provide any class or Interface name as Parameter Type but not primitives as Collections only contains objects, not primitives. Otherwise,
         we get compile time error.

        Internal implementation
        -----------------------
        In Java 1.5, a generic version of ArrayList is defined as follows:

            class ArrayList <T> {   // T is the type-parameter

                ...

                add (T *){      // * represents the name of the arg of type T
                    ...
                }

                T get (int index){
                    ...
                }
            }
        Based on our runtime requirement, T will be replaced with our provided type. E.g. to hold only String type Objects
         a generic version of AL object can be created as follows:

            ArrayList <String> l = new ArrayList<String>();

        For this requirement, compiler considered version of AL class is as follows:
            
            class ArrayList <String> {   

                ...

                add (String s){     // only String type can be added, hence type-safe
                    ...
                }

                String get (int index){     // return type is String , hence type-casting is not required
                    ...
                }
            }
            
        Such parameterized classes are known as Generic Classes or Template Classes
    */
}
