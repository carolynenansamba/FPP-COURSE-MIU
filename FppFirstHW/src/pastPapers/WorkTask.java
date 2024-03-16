package pastPapers;

public class WorkTask extends Task {
    int deadline;
    WorkTask(String title,int priority,int deadline){
        super(title,priority);
        this.deadline= deadline;
    }

    @Override
    void completeTask(){
        System.out.println(title + priority +deadline);
    }
}
