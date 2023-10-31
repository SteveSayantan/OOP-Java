package Code.OOP_Principles.Polymorphism;

public class Square extends Shapes{
    
    @Override   // This is an annotation
    void area(){
        System.out.println("Area is square of a side");
    }
       
    static void message(){    // This  will not override the message() present in Shapes class. It is called method hiding. In method hiding, both the parent and child methods should be static. 

        System.out.println("It is trying to override static method");
    } 

    /* 
        Rules for Overriding: (Ref: https://youtu.be/MYzaDgNGmTg?si=lbCfxHimYTPjRQAI)
        --------------------
        1. The names and argument types of overriding and overridden methods should match i.e. method signatures must be same.

        2. The return types must be same. From 1.5 version, co-variant return types are also allowed. Acc. to this, if the return type of overridden method is of reference-type, the overriding 
         method can have child-class return type also. In case of primitive return types, it should be the same both in overriding and overridden methods. 

         e.g.,
         class P{
            public Object m1(){
                return null;
            }
         }

         class C extends P{
            public String m1(){     // String is a child of Object class
                return null;
            }
         }

         
         Overridden method return type: Object ; Overriding method return type: Object/String/StringBuffer...etc.   --> valid
         Overridden method return type: Number ; Overriding method return type: Integer/Double/Float...etc.         --> valid
         Overridden method return type: String ; Overriding method return type: Object.                             --> invalid (child class method return-type can not be parent of parent class method return-type)
         Overridden method return type: double ; Overriding method return type: int.                                --> invalid (covariant return type concept not applicable for primitive return type)

        3. private methods are not inherited from the parent class, hence, overriding is not available for private methods of the parent class. Based on our requirement we can define exactly same private method in child class,
            it is valid. But not overriding.
            e.g.,

            class P {

                private void m1(){
                    
                }
            }
            class C extends P {

                private void m1(){

                }
            }
        
        4. In overriding the following modifiers won't keep any restriction,
          
            The parent method can be `synchronized` but the child method can be `non-synchronized` or vice-versa    // valid

            The parent method can be `native` but the child method can be `non-native` or vice-versa    // valid

            The parent method can be `strictfp` but the child method can be `non-strictfp` or vice-versa    // valid

            The parent method can be `abstract` but the child method can be `non-abstract` or vice-versa    // valid

            The parent method can be `non-final` but the child method can be `final` but the vice-versa is not valid. As final methods in a parent class can't be overridden.

        5. We can not override a static method with a non-static one or the vice-versa, otherwise we shall get C.E.
          e.g.,
            
            class P{
                public static void m1(){
                    
                }

                public void m2(){
                    
                }
            }
            class C extends P{

                public void m1(){   // gives C.E.

                }

                public static void m2(){  // gives C.E.
                    
                }
            }

        6. If both the parent and child class methods are static then we won't get any C.E. . It seems overriding concept is applicable for static methods. But it is 
            not overriding , it is method hiding.

            In method hiding, all of the rules are same as overriding. However, in method hiding, method resolution is done by compiler based on reference type, the run 
             time object will not play any role.

            class P{
                public static void m1(){
                    System.out.println("parent");
                }
            }

            class C extends P{

                public static void m1(){        // method hiding
                    System.out.println("child");
                }
            }

            class Test{

                public static void main( String[] args){

                    P obj= new C();
                    obj.m1();           // "parent"
                }
            }

        
     */
}
