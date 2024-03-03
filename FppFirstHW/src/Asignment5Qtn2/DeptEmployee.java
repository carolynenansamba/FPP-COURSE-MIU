package Asignment5Qtn2;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
    // Instance fields
    private String name;
    private double salary;
    private Date hireDay;

    //DeptEmployee Constructor

    DeptEmployee(String dName, double dSalary, int dYear, int dMonth, int dDay){
        name = dName;
        salary = dSalary;
        GregorianCalendar cal = new GregorianCalendar(dYear, dMonth-1, dDay);
        hireDay = cal.getTime();
    }
    public  String getName(){ return name;}
    public  String getHireDay(){
        SimpleDateFormat fmt = new SimpleDateFormat(("dd/MM/yyyy"));
        String dateFormatted = fmt.format(hireDay);
        return dateFormatted;
    }

    //Compute salary Method
    public double computeSalary(){
        return salary;
    }
}
