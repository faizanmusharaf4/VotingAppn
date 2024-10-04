package San;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List list = new ArrayList<>();
        list.add("Akash");
        list.add("12");
        list.add('a');
        list.add("12.4f");
        list.add(null);
        list.add(true);
        System.out.println(list);
    }
}
