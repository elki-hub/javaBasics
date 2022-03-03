package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetics {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        task3();
        task4();
    }

    public static void task3(){
        Messages.startTask("3", true);
        while(true){
            System.out.print("Enter cube's edge size: ");
            String output = sc.nextLine();

            if(output.equals("stop")){
                break;
            }

            int a = Integer.parseInt(output);

            System.out.println("Cube's volume: "+ a*a*a + "cm3");
            System.out.println("Cube's perimeter: "+ a*4 + "cm");
            System.out.println("...........");
        }
    }

    public static void task4(){
        Messages.startTask("4", true);
        while(true){
            System.out.print("Enter feet and inches separated by space: ");
            String[] a = sc.nextLine().split(" ");

            if(a[0].equals("stop")){
                break;
            }
            else if(!a[0].trim().equals("")){
                double cm = (Double.parseDouble(a[0]) * 12 + Double.parseDouble(a[1])) * 2.54;
                System.out.printf( "%s feet and %s inches = %.2f cm \n", a[0], a[1], cm);
            }
            else System.out.println("Values can't be empty");
        }

    }
}
