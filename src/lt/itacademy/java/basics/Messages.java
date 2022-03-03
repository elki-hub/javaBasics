package lt.itacademy.java.basics;

public class Messages {
    public static void startTask(String task, boolean stopMssg){
        System.out.println("------------------------------");
        System.out.printf("----------- TASK %s ----------\n", task);
        if(stopMssg){
            System.out.println("!ENTER 'stop' to end the task!");
        }
        System.out.println("------------------------------");
    }
}
