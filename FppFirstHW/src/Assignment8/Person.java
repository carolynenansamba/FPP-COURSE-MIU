package Assignment8;

import java.util.Arrays;

public class Person {
    private String lastName;
    private String firstName;
    private int age;
    // --------------------------------------------------------------
    public Person(String last, String first, int a) { // constructor
        lastName = last;
        firstName = first;
        age = a;
    }
    // --------------------------------------------------------------
    public String getLast() // get last name
    {
        return lastName;
    }
    @Override
    public String toString() {
        return "Person [lastName=" + lastName + "\n FirstName=" + firstName +
                "\nAge=" + age + "]";
    }
}
       class MyPersonList {
    private final int INNITIAL_LENGTH = 3;
    private Person[] currentArray;
    private int numOfElements;


    public MyPersonList() { // constructor
        currentArray = new Person[INNITIAL_LENGTH];
        numOfElements = 0;
    }
    // --------------------------------------------------------------

    public void add(Person p){
        if(p == null)return;
        if(numOfElements == currentArray.length)
            resize();
        currentArray[numOfElements] = p;
        numOfElements = numOfElements + 1;
    }

    public Person get(int i){
        if(i <0 || i >=numOfElements){
            return null;
        }
        return currentArray[i];
    }
    public void insert(Person p, int pos){
     if(p==null )return;
     if(pos>numOfElements || pos <0)return;
     if(numOfElements == currentArray.length){
         resize();
     }
     Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray,0,temp,0,pos);
        temp[pos] = p;

        System.arraycopy(currentArray,pos,temp,pos+1,currentArray.length- (pos + 1));
        currentArray = temp;
        ++numOfElements;
    }

    public boolean remove(MyPersonList p){
        if(numOfElements == 0)return false;
        if(p == null)return false;
        int index = -1;
        for(int i =0;i < numOfElements; ++i){
            if(currentArray[i].equals(p)){
                index = i;
                break;
            }
        }

        if(index == -1)return false;
        Person[] temp  = new Person[currentArray.length];
        System.arraycopy(currentArray,index+1,temp,index,currentArray.length- (index +1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    public int size(){return numOfElements;}

    public Object clone(){
        Person[] temp = Arrays.copyOf(currentArray,numOfElements);
        return temp;
    }

    public void resize(){
        System.out.println("Resizing");
        int len = currentArray.length;
        int newlen = 2*len;
        Person[] newArray = new Person[newlen];
        System.arraycopy(currentArray,0,newArray,0,len);
        currentArray = newArray;
    }

    public boolean isEmpty(){return (numOfElements==0);}

    public boolean find(Person p){
        if(p == null)return false;
        for(int i = 0;i < numOfElements;i++){
            if(currentArray[i].equals(p))return true;
        }
       return false;
    }

    public static void main(String[] args) {
        MyPersonList person =  new MyPersonList();
        person.add(new Person("Sonia","Nasuuna",22));
        person.add(new Person("Sharon","Nasuuna",32));
        person.add(new Person("Sonia","Nasuuna",42));
        person.add(new Person("Sonia","Nasuuna",52));

        System.out.println(person.toString());
        System.out.println("Persons in the array:");
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).toString());
        }
    }

} // end class Person

