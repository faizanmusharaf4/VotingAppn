package San;
public class Exception1 {
    public static void main(String[] args) {

        try {
            int num = 4/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

