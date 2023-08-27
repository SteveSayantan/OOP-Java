package Code.access_modifiers;


public class AccessFile {
    private int num;    // private members and methods are only accessible within that class only.

    public String name; // public means it is accessible from anywhere

    int [] arr;  // If no access modifier is specified, then that method (or member) will be available within same package but not outside.  

    protected boolean isHappy;
    
    public int getNum(){    // To access private members we can use getters and setters. Using those user can access private members instead of accessing directly.
        return num;
    }

    public void setNum(int val){    // To access private members we can use getters and setters
        num=val;
    }
    /* 
       From security point of view, allowing public access to data members is not a good practice.

       Hence, we can use access modifiers to restrict the access.

       private --> to hide sensitive data, only accessible through getters and setters (if provided publically)

       no modifer --> can be used for members that are not allowed to be used outside package.

       protected --> can be used for members that are allowed to be used only within a subclass (same/different package).

       Checkout the Demo.Protected_Example.java for details about protected.

    */
    public static void main(String[] args) {    // main method is public as it should be accessible from anywhere.
        AccessFile test= new AccessFile();
        System.out.println(test.arr);

        
    }
}
