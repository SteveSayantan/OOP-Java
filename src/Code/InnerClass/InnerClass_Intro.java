package Code.InnerClass;

/* 
    Classes inside a class are called inner classes. 

    Without the existance of one type of object, if another type of object can't exist --> then we should go for inner classes.

    Ex. A university consists of several departments. Without the existance of the university, there is no existance of the departments. Hence, we should declare Department class (inner class) inside
     University class (outer class).

    Ex 2. Map is group of key-value pair. Each key-value pair is called an Entry. Without the existance of the Map object, there is no existance of the Entry object. Hence, interface Entry is defined 
     inside Map interface.

    Note: Without the existance of outer class object, there is no existance of the inner class object.
    
    Classification
    --------------
     Based on position of declaration and behaviour , inner classes can be divided into following categories:
        1. Normal or Regular Inner Class
        2. Method Local Inner Class
        3. Anonymous Inner Class
        4. Static Nested Class

    Normal/ Regular Inner Class
    ---------------------------
     If we are declaring any named class directly inside a class w/o static modifier, such inner class is called Normal/Regular Inner class.

     Ex.

     Outer.java
     ----------
     class Outer{

        class Inner{

        }
     }

     When we compile this code by `javac Outer.java` , two .class files will be generated. One is "Outer.class" and the other one is "Outer$Inner.class" (Since,
     it is present inside Outer class)

     But, if we try to execute any of the .class files (e.g. `java Outer\$Inner`), we shall get Run-time exception since no main method is present inside both of them. '\' is
      for escaping the '$' symbol while running the command in terminal.

     Ex 2.

     Outer.java
     ----------
     class Outer{

        class Inner{

        }

        public static void main (String[] args){
            System.out.println("Outer class main method");
        }
     }

     Now, as the Outer class contains a main method, running `java Outer` will execute that and "Outer class main method" will be logged.
     But, running `java Outer\$Inner`, will still give Run-time exception due to absence of main method in it.
     
     Inside Inner class, we can't declare any static members. Hence, we can't declare main method and we can't run Inner class directly from command prompt.

     Ex.
     Outer.java
     ----------
     class Outer{

        class Inner{

            public static void main (String[] args){
                System.out.println("Inner class main method");
            }
        }

     }

     The above code gives compile-time error.
    
    Case 1: Accessing Inner class code from static area of Outer class
    --------------------------------------------------------------------

    Outer.java
    ----------
     class Outer{

        class Inner{

            public void m1 (){
                System.out.println("Inner class method");
            }
        }

        public static void main(String[] args){

            // First, we create outer class object
            Outer o= new Outer();   

            // Using outer object, create inner object
            Outer.Inner i= o.new Inner();              // Outer.Inner refers to the inner class

            // Or, the shorthand for above two lines
            Outer.Inner i1= new Outer().new Inner();

            // Now, we can access inner class method
            i.m1();
        }

     }

    Case 2: Accessing Inner class code from instance area of Outer class
    --------------------------------------------------------------------
    Outer.java
    ----------
     class Outer{

        class Inner{

            public void m1 (){
                System.out.println("Inner class method");
            }
        }

        public void m2(){   // To invoke m2, we must create an object of Outer class, hence, using that object, we can directly access the inner class like shown below

            Inner i = new Inner();  
            i.m1();
        }

        public static void main(String[] args){

            // First, we create outer class object
            Outer o= new Outer(); 

            o.m2();
        }

     }

    Case 3: Accessing Inner class code from outside of Outer class
    --------------------------------------------------------------------
    Outer.java
    ----------
     class Outer{

        class Inner{

            public void m1 (){
                System.out.println("Inner class method");
            }
        }
     }

     class Test{

        public static void main(String[] args){

            // same as case 1
            
            Outer o = new Outer();
            Outer.Inner i = o.new Inner();
            i.m1();
        }
     }
*/


