package pastPapers;

import java.sql.SQLOutput;

public class HomeWorkTask extends Task{
    String subject;

    HomeWorkTask(String subject,String title,int priority){
        super(title,priority);
        this.subject = subject;
    }
    @Override
    void completeTask(){
        System.out.println(subject + title + priority);
    }
}
