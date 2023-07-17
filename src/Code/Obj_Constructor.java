package Code;

public class Obj_Constructor {
    public static void main(String[] args) {

        // We do not have any constructor defined in Car, therefore Java uses default constructor that allocates default values
        Car car_1= new Car();   
        // car_1.speed ;     // 0    (This default value is allocated by the default constructor)
        // car_1.model ;     // null (This default value is allocated by the default constructor)


        // Calling the constructor present in Box class 
        Box package_1= new Box();   
        // package_1.height;        //23 ( allocated by the constructor present in Box class)


        // Passing args to the constructor
        Employee employee_1= new Employee(23, 2.5f, "Alex");
        // employee_1.salary;       // 2.5
        // employee_1.greeting();   //Hello, this is Alex
        employee_1.changeSalary(5f);


        // Calling the Employee constructor with no args
        Employee employee_2= new Employee();
        //employee_2.salary;        // 3.5
        // employee_2.greeting();   //Hello, this is test
        employee_2.changeAge(22);
        // employee_2.age           // 22

        // Calling the Employee constructor which internally calls other Employee constructor
        Employee employee_3= new Employee(34);
        // employee_3.age;          // 34  
        // employee_3.name;         // Alice
        // employee_3.salary;       // 3.5
        
    }
}

class Car{
    int speed;
    String model;
    float price=2.3f;
}

class Box{
    
    int height;
    float weight;
    String color;

    // Creating the constructor for Box class

    Box (){  // This a function, its name should match exactly to that of the corresponding class
       
        this.height=23;
        this.color="red";
        this.weight= 15.5f;
        /* 
            While creating an object, 'this' will be replaced by the particular reference variable associated with the object.

            e.g., If we create this, Box container= new Box(); , then internally 'this' keyword will be replaced with 'container',

                container.height=23;
                container.color="red";
        
            Making creation of object less cumbersome
        */
    }
}


class Employee{
    int age;
    float salary;
    String name;

    // Constructor & Constructor Overloading (Having multiple constructors instead of one)

    Employee(int years,float money,String name){

        this.age=years;        
        salary=money;       // If the name of the property in class and that of our formal argument in constructor fn. is different, we might not use 'this'. Java handles it internally.

        this.name= name;    // If the name of both are same, we must use 'this'
    }


    Employee(){ // We can have another constructor fn. which will take no args.
        this.name="test";
        this.age=18;
        salary=3.5f;        // Here also, we might not use 'this'
    }


    Employee(int years){   // We can have another constructor which internally calls another constructor

        this(years,3.5f,"Alice");       // Here, invoking this() with 3 args will invoke the Employee(int years,float money,String name) constructor.

        // this();          // Here, invoking this() with no args will invoke the Employee() constructor.
    }


    // creating some methods

    void greeting(){       // Here, void is the return type and 'greeting' is the name of method

        System.out.println("Hello, this is "+this.name);    // we might not use 'this' here also, because internally java assumes 'this.' before 'name'
    }

    void changeSalary(float salary){

        // salary=salary;           // This acts like this.salary=this.salary, therefore no changes
        this.salary=salary;         // Therefore, we must use 'this', otherwise Java can't understand before which 'salary', 'this.' has to be attached. 
    }

    void changeAge(int years){
        age=years;          // Here, we might avoid 'this', as the name of the property in class and that of our formal argument in the method is different. Java handles it internally.
    }

}
