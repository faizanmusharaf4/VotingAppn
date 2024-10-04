package San;
public class Encapsulation {

    private String empId;
    private String empName;
    private String dept;
    private double Salary;
    private String company;


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Encapsulation(String empId, String empName, String dept, double salary, String company) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
        this.Salary = salary;
        this.company = company;
    }


    public void setSalaryHike(String dept){
                if(dept.equals("Developer")){
                    Salary = Salary+1000;
                }

                if(dept.equals("Other")){
                    Salary = Salary+22;
                }
    }

    public Encapsulation(){

    }

}
