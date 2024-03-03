package Asignment5Qtn2;

public class Professor extends DeptEmployee{
    private int numberOfPublications;

    // Professor Constructor
    Professor(String dName, double dSalary, int dYear, int dMonth, int dDay){
        super(dName,dSalary,dYear,dMonth,dDay);
    }

    // Accessor numberOfPublications
    public int getNumberOfPublications(){
        return  numberOfPublications;
    }
    // Mutator
    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}

