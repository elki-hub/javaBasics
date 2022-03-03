package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {
        Messages.startTask("bonus", false);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the height of the tree: ");
        int height= sc.nextInt();
        art(height);
    }

    public static void art(int height){
        for(int i=0; i<height*2; i += 2){
            for(int spaces = (height*2 - i)/2; spaces >=0; spaces--){
                System.out.print(" ");
            }
            for(int leaf = 0; leaf <= i; leaf++){
                System.out.print("#");
            }
            System.out.println(" ");
        }
        for(int i=0; i <height+1; i++){
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
