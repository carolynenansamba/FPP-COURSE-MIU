package inclassExerciseDay5;
/*
Rules of singleton class
1.private static instance variable
2. private constructor
3. Non-private static getInstance() method

 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){

    }
     static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
