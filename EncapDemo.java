package San;
public class EncapDemo {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();

        encapsulation.setEmpName("Faizan");
        encapsulation.setEmpId("PS101");
        encapsulation.setSalary(100);
        encapsulation.setDept("Developer");
        encapsulation.setSalaryHike("Developer");

        encapsulation.setDept("Other");

        System.out.println(encapsulation.getSalary());

    }
}
