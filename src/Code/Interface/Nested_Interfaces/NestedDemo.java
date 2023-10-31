package Code.Interface.Nested_Interfaces;

public class NestedDemo {
   // we can have an interface inside an class.
   
   protected interface Interface_Nested{
        // nested interfaces can be declared as public,protected,private or default. But any top level interface must be declared as public or default

        boolean isOdd(int num);
   }
}

class RandomClass implements NestedDemo.Interface_Nested{   // we can use the nested Interface like this

    @Override
    public boolean isOdd(int num) {
        return (num&1)==0;
    }

}
