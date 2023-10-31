package Code.Interface.Static_Methods;

public interface StaticExample {
    
    static void hello(){
        // since, static methods can neither be inherited nor overridden, we must provide body for a static function
        System.out.println("hello from static method");
    }
}
