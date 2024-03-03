package Asignment5Qtn2;


    import java.util.Scanner;

    public class Main {
        public static void main(String[]args){

            Professor p1 = new Professor("Damien Kato", 200000,2021,10,23);
            p1.setNumberOfPublications(10);
            Professor p2 = new Professor("Alvin J Murungi", 150000,2023,8,06);
            p2.setNumberOfPublications(10);
            Professor p3 = new Professor("Aaron Ddembe", 300000,2021,06,29);
            p3.setNumberOfPublications(10);

            Secretary s1 = new Secretary("Elizabeth", 50000, 2017, 9, 07);
            s1.setOverTimeHours(200);
            Secretary s2 = new Secretary("Gloria", 40000,2020,2,27);
            s2.setOverTimeHours(200);

            // Create an array of Department employees
            DeptEmployee [] department = new DeptEmployee [5];

            // Populate array with professor and secretary instances
            department [0] = p1;
            department [1] = p2;
            department [2] = s1;
            department [3] = s2;
            department [4] = p3;

            // Ask user
            Scanner sc = new Scanner (System.in);
            System.out.println("Do you wish to see salaries in the department? Y / N");
            String  res = sc.nextLine();
            sc.close();

            double sum = 0;
            if(res.equalsIgnoreCase("y")){
                for(DeptEmployee dept: department){
                    sum = sum + dept.computeSalary();
                }
                System.out.println("Total salaries = " + sum);
            }
            System.exit(0);
        }
}
