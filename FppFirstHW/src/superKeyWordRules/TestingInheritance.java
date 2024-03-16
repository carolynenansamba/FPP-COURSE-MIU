package superKeyWordRules;

import java.sql.SQLOutput;

public class TestingInheritance {
    public static void main(String[] args) {
//        Manager boss = new Manager();
        Employee [] staff = new Employee[3];
        staff[0] = new Manager("Benny",80_000,1997,12,15);
        staff[1] = new Employee("Jimmy",50_000,1989,02,1);
        staff[2] = new Manager("Tommy",40_000,1990,3,15);

        for(Employee e: staff){
            System.out.println("name : "+ e.getName() + " salary: " + e.getSalary());
        }
    }
}
