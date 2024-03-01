package SecondHomework;



public class Problem1CustomerClass {
    private String firstName;
    private String lastName;
    private String socSecurityNum;
    private Problem1Address billingAddress;
    private Problem1Address shippingAddress;
    public Problem1CustomerClass (String fName, String lName, String ssn) {
        firstName = fName;
        lastName = lName;
        socSecurityNum = ssn;
    }

    public String toString() {

        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum + "]";
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getSocSecurityNum() {

        return socSecurityNum;
    }

    public void setSocSecurityNum(String socSecurityNum) {

        this.socSecurityNum = socSecurityNum;
    }

    public Problem1Address getBillingAddress() {

        return billingAddress;
    }

    public void setBillingAddress(Problem1Address billingAddress) {

        this.billingAddress = billingAddress;
    }

    public Problem1Address getShippingAddress() {

        return shippingAddress;
    }

    public void setShippingAddress(Problem1Address shippingAddress) {

        this.shippingAddress = shippingAddress;
    }

}

