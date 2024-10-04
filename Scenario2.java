package San;
/*
 * If the superclass method declares an exception, subclass overridden method can declare same subclass exception or no exception,
 * but cannot declare parent exception.
 * */

class Parent1{
    void display(){
        System.out.println("Hello world");
    }
}

class Child1 extends Parent1{
    @Override
    void display(){
        System.out.println("Hello World");
    }
}
public class Scenario2 {
    public static void main(String[] args) {

    }
}

