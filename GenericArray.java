package San;
import java.util.Arrays;

public class GenericArray<T> {
    T arr[];

    GenericArray(int size) {
        arr = (T[]) new Object[size];
    }

    void setElement(int index, T element) {
        arr[index] = element;
    }

//    public static void main(String[] args) {
//        GenericArray<Integer> garr = new GenericArray<Integer>(5);
//
//        garr.setElement(0, 34);
//        garr.setElement(1, 36);
//        garr.setElement(2, 88);
//        garr.setElement(3, 24);
//        garr.setElement(4, 78);
//        System.out.println(Arrays.toString(garr.arr));
//
//        for(Object obj : garr.arr){
//            System.out.println(obj);
//        }
//    }

    static public<T> void disp(T arr[]){
        for(T i:arr){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        disp(a);
    }
}
