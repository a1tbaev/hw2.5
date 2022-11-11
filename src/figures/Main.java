package figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please write radius: ");
        double radius = input.nextDouble();
        Circle.getArea(radius);
        Circle.getCircumference(radius);
    }
}