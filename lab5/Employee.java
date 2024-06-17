package lab5;

public class Employee {
    private static int eidCounter = 1000; 
    private static String companyName = "ABC Corp"; 

    private int eid;
    private String ename;

    public Employee(String ename) {
        this.eid = eidCounter++;
        this.ename = ename;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public static void setCompanyName(String companyName) {
        Employee.companyName = companyName;
    }

    public static int getNextEid() {
        return eidCounter;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }
}
