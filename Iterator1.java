package San;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(52);
        al.add(87);
        al.add(85);
        al.add(14);
        al.add(36);

        Iterator<Integer> itr = al.iterator();

//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        while(itr.hasNext()){
            if(itr.next()==87){
                itr.remove();
            }
        }
        //System.out.println(Arrays.toString(al.toArray()));
        System.out.println(al);
    }
}
