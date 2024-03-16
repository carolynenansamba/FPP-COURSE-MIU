package Anonymus;

public class Vehicle {
    String name;
    Vehicle (String name){
        this.name= name;
    }
    Vehicle(){}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
        public void printSomething(){
            System.out.println("vehicle");
        }

}
