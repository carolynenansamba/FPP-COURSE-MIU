package inclassExerciseday6;

import java.sql.SQLOutput;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Benny",80_000,1987,12,15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1]= new Employee("Jimmy",50_000,1989,10,1);
        staff[2]= new Employee("Tommy",40_000,1990,3,15);

        System.out.println( "what the hake");


        // the parameter e is a typical example of polymorphism since e is both a manager and a staff
        for(Employee e: staff){
            System.out.println( "Name: " + e.getName() + "Salary: " + e.getSalary());
        }
    }
}
