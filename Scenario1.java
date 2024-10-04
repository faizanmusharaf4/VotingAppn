package San;
/*
* If the superclass method does not declare an exception, subclass overridden method cannot declare the checked
* exception, but it can declare unchecked exception
* */

class Parent{
    void display(){
        System.out.println("Hello world");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Hello World");
    }
}
public class Scenario1 {
    public static void main(String[] args)  {

    }
}
