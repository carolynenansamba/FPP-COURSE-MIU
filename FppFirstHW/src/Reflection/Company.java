package Reflection;

import java.sql.SQLOutput;

public class Company {
    private final String name;
    private int numOfEmployees;
    public Company(String name, int numOfEmployees){
        this.name = name;
        this.numOfEmployees = numOfEmployees;
    }
    public String getName(){
        return name;
    }
    public int getNumOfEmployees(){
        return numOfEmployees;
    }
    private void setNumOfEmployees(int newNumber){
        this.numOfEmployees= newNumber;
    }
    private static void internalRules(int newNumber) {
        System.out.println("This is the internal rules");
    }
}
