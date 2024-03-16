package pastPapers;

public class Test {
    public static void main(String[] args) {
        Task[] arr = new Task[2];
        arr[0] = new WorkTask("Work task",1,1);
        arr[1] = new HomeWorkTask("Homewwork","FPP",2);

        for(Task t:arr){
          t.completeTask();
        }
        Company c = new Company("MIU",2);
        System.out.println(c.toString());
        System.out.println(c.hashCode());
        System.out.println(c.equals(c));


    }
}
