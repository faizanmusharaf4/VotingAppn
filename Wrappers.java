package San;

/*
* T - Type
* E - Elements
* G - Generics
* K - Key
* V - Value
* ? - List of sny type of elements
* */


class Demo<T>{
    T obj;
    Demo(T obj){
        this.obj = obj;
    }

    static public<T> void setObj(T obj){
        System.out.println(obj);
    }
}
public class Wrappers {
    public static void main(String[] args) {

        Demo d = new Demo(123.22); // Here the input can be anything like a number or string or a double value
        System.out.println(d.obj);

        Demo.setObj("XYZ");
    }
}
