package Code.Interface.Default_Methods;

public interface Interface_Neptune {
    void revolve();

    // We can have default methods inside interfaces from JDK 8
    default void sayName(){
        System.out.println("I am Neptune");
    }
}
