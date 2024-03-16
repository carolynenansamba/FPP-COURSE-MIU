package pastPapers;

import java.util.Objects;

public class Company {
    public static void main(String[] args) {

    }
    private String name;
    private int numberOfEmployees;

    public Company(String name, int numberOfEmployees){
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }
    @Override
    public int hashCode(){
        return Objects.hash(numberOfEmployees,name);
    }
    @Override
    public String toString(){
        return "Company {name =" + name + " ,number of Employees = "  + numberOfEmployees + "}";
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(obj==null || !(obj instanceof Company))return false;
        Company company = (Company)obj;
        return numberOfEmployees == company.numberOfEmployees && Objects.equals(name,company.name);

    }
}
