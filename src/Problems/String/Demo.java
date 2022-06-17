package Problems.String;


public class Demo {
    public static void main(String[] args) {
        Base child = new Child();
        child.hello();

    }
}

class Child extends Base {

    public void hello() {

        System.out.println("Hello from child class");
    }
}

class Base {
    public void hello() {
        System.out.println("Hello from base class");
    }
}