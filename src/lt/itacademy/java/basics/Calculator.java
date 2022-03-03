package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task10();
    }

    public static void task10() {
        Messages.startTask("10", false);

        while (true) {
            System.out.print("Enter figure name (Rectangle/Triangle/Square) and the size of edge(s): ");
            String[] output = sc.nextLine().split(" ");
            switch (output[0]) {
                case "Square" -> {
                    if (output.length < 2 || output[1].equals("0")) {
                        printError(output[0]);
                        break;
                    }
                    double aS = Double.parseDouble(output[1]);
                    printOutput(output[0], aS * 4, aS * aS);
                }
                case "Rectangle" -> {
                    if (output.length < 3 || output[1].equals("0") || output[2].equals("0")) {
                        printError(output[0]);
                        break;
                    }
                    double aR = Double.parseDouble(output[1]);
                    double bR = Double.parseDouble(output[2]);
                    printOutput(output[0], (aR + bR) * 2, aR * bR);
                }
                case "Triangle" -> {
                    if (output.length < 4 || output[1].equals("0") || output[2].equals("0") || output[3].equals("0")) {
                        printError(output[0]);
                        break;
                    }
                    double aT = Double.parseDouble(output[1]);
                    double bT = Double.parseDouble(output[2]);
                    double cT = Double.parseDouble(output[3]);
                    if (aT + bT < cT || bT + cT < aT || aT + cT < bT) {
                        System.out.printf("%s is invalid! ", output[0]);
                        break;
                    }
                    printOutput(
                            output[0],
                            aT + bT + cT,
                            0.25 * Math.sqrt((aT + bT + cT) * (-aT + bT + cT) * (aT - bT + cT) * (aT + bT - cT)));
                }
                default -> System.out.println("Wrong figure name!");
            }


            System.out.print("Do you want to continue? y/n: ");
            String stop = sc.nextLine();
            if (stop.equals("n")) {
                break;
            }
        }
    }

    public static void printError(String str) {
        System.out.printf("%s edge is can't be 0 \n", str);
    }

    public static String prettyPrint(double d) {
        if (d == Math.floor(d)) {
            return String.format("%.0f", d); //Format is: 0 places after decimal point
        } else {
            return String.format("%.2f", d);
        }
    }

    public static void printOutput(String figure, double perimeter, double area) {
        System.out.printf("%s perimeter is %s and area is %s. \n", figure, prettyPrint(perimeter), prettyPrint(area));
    }

}
