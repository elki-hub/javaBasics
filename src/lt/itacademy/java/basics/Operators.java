package lt.itacademy.java.basics;
import java.util.Scanner;

public class Operators {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task5();
        task6();
    }

    public static void task5() {
        System.out.println("---ENTER 'stop' TO END TASK 5! ---");

        while(true){
            System.out.print("Enter triangle sides: ");
            String[] output = sc.nextLine().split(" ");

            if(output[0].equals("stop")){
                break;
            }

            if(output.length <3){
                System.out.println("!Enter all 3 sides of the triangle!");
            }
            else if(output[0].equals(output[1]) && output[0].equals(output[2])) {
                printTriangleResult("Equilateral", output);
            } else if (output[0].equals(output[1]) || output[0].equals(output[2])) {
                printTriangleResult("Isosceles", output);
            } else if ((Integer.parseInt(output[0]) + Integer.parseInt(output[1])) > Integer.parseInt(output[2])) {
                printTriangleResult("Scalene", output);
            } else {
                printTriangleResult("invalid", output);
            }
        }
    }

    public static void printTriangleResult(String str, String[] triangle) {
        System.out.printf("Triangle is %s. Sides: %s %s %s \n", str, triangle[0], triangle[1], triangle[2]);
    }

    public static void task6() {
        System.out.println("---ENTER 'stop' TO END TASK 6! ---");

        while(true){
            System.out.print("Enter distance, fuel in the car, car fuel usage, fuel price: ");
            String[] output = sc.nextLine().split(" ");

            if(output[0].equals("stop")){
                break;
            }

            double distance = Double.parseDouble(output[0]);
            double fuel = Double.parseDouble(output[1]);
            double usage = Double.parseDouble(output[2]);
            double price = Double.parseDouble(output[3]);

            double fuelLastFor = 100*fuel/usage; //How many km you can drive without filling in the tank
            System.out.printf("Destination is in %s km. ", prettyPrint(distance));


            if( fuelLastFor < distance){
                double liters = (distance - fuelLastFor) * usage / 100; //Liters needed to finish the trip successfully
                System.out.print("Car is not able to reach the destination. ");
                System.out.println("It needs " + prettyPrint(liters) + " liters of fuel more. It will cost " + prettyPrint(liters*price) + ".");
            }
            else if(fuelLastFor >= distance){
                double liters = (fuelLastFor - distance) * usage / 100;
                System.out.print("Car is able to reach the destination. ");
                System.out.println("It will have " + prettyPrint(liters) + " liters of fuel left.");
            }

        }
    }

    public static String prettyPrint(double d){
        if (d == Math.floor(d)) {
            System.out.print("true: "+d);
            return String.format("%.0f", d); //Format is: 0 places after decimal point
        } else {
            System.out.print("false: " + d);
            return String.format("%.2f", d);
        }
    }



}