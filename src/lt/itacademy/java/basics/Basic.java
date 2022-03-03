package lt.itacademy.java.basics;
import java.util.*;

public class Basic {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1(){
        Messages.startTask("1", false);
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter your name: ");
        String name= sc.nextLine();
        System.out.print("Enter your surname: ");
        String surname= sc.nextLine();
        System.out.print("Enter yor age: ");
        int age= sc.nextInt();
        System.out.printf("Hello I am %s %s. I am attending IT Academy 2020! \n", name, surname);
    }
    public static void task2(){
        Messages.startTask("2", false);
        char value1 = 'H';
        short value2 = 3110;
        char value4 = 'w';
        byte value5 = 0;
        char value6 = 'r';
        int value7 = 1;
        char value8 = 'd';
        char empty = ' ';
        float fl = 2.0F;
        boolean bool = true;

        String string = String.valueOf(value1) + value2 + empty + value4 + value5 + value6 + value7 + value8 + empty + fl + empty + bool;
        System.out.println(string);
    }
}
