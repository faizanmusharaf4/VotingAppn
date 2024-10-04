package San;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 class Product1 {
     int pid;
     String pname;
     double price;
     int quantity;

     public Product1(int pid, String pname, double price, int quantity) {
         this.pid = pid;
         this.pname = pname;
         this.price = price;
         this.quantity = quantity;
     }

     @Override
     public String toString() {
         return "Product1{" +
                 "pid=" + pid +
                 ", pname='" + pname + '\'' +
                 ", price=" + price +
                 ", quantity=" + quantity +
                 '}';
     }
 }


 public class IteratotTest {
        public static void main(String[] args) {
            Product1 p1 = new Product1(111, "Samsung", 50000, 10);
            Product1 p2 = new Product1(222, "OnePlus", 30000, 15);
            Product1 p3 = new Product1(333, "Samsung", 10000, 5);
            Product1 p4 = new Product1(444, "Samsung", 30000, 3);
            ArrayList<Product1> phoneList = new ArrayList<>();
            Collections.addAll(phoneList, p1, p2, p3, p4);
            System.out.println(phoneList);
            Iterator<Product1> itr = phoneList.listIterator();
            while (itr.hasNext()) {
                if (itr.next().quantity < 10) {
                    itr.remove();
                }
            }
            System.out.println("After removing");
            System.out.println(phoneList);
        }
    }
