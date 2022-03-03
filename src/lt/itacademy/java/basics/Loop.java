package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loop {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task9();
        task7();
        task8();
    }

    public static void task7() {
        Messages.startTask("7", false);
        System.out.print("Enter days per year: ");
        int days = sc.nextInt();
        int hours = 0;
        int min = 0;
        for(int i=0; i<days; i++){
            hours += 24;
            for(int j=0; j<24; j++){
                min += 60;
            }
        }
        System.out.printf("There are %d hours or %d minutes in one year.\n", hours, min);
    }
    public static void task8() {
        Messages.startTask("8", false);
        System.out.print("Enter days per year: ");
        int days = sc.nextInt();
        int i = 0;
        int hours = 0;
        int min = 0;
        while(i<days){
            hours += 24;
            int j=0;
            while(j<24){
                min += 60;
                j++;
            }
           i++;
        }
        System.out.printf("There are %d hours or %d minutes in one year.\n", hours, min);
    }
    public static void task9() {
        Messages.startTask("9", true);

        while (true) {
            System.out.print("Enter number to calculate factorial: ");
            String output = sc.nextLine();

            if (output.equals("stop")) {
                break;
            }
            int number = Integer.parseInt(output);
            float fact = 1;

            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }

            System.out.printf("Factorial of number %d is %.0f\n", number, fact);

        }
    }
}
