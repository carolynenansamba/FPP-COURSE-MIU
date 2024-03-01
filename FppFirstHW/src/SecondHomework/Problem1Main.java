package SecondHomework;

public class Problem1Main {

    public static void main(String[] args) {
        Problem1Address add1A = new Problem1Address("10 Adams", "Chicago", "IL", "60290");
        Problem1Address add1B = new Problem1Address("110 Burlington", "Fairfield", "IA", "52556");
        Problem1Address add2A = new Problem1Address("322 Harrison", "Chicago", "IL", "60290");
        Problem1Address add2B = new Problem1Address("2210 Burlington", "Fairfield", "IA", "52556");

        Problem1CustomerClass e1 = new Problem1CustomerClass("Joe", "Smith", "332-22-4444");
        e1.setBillingAddress(add1A);
        e1.setShippingAddress(add1B);

        Problem1CustomerClass e2 = new Problem1CustomerClass("Bill", "Jones", "325-58-9643");
        e2.setBillingAddress(add2B);
        e2.setShippingAddress(add2A);


        Problem1CustomerClass[] empArray = new Problem1CustomerClass[2];
        empArray[0] = e1;
        empArray[1] = e2;


  }

    }





