package ee.ivkhkdev;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double Fahrenheit, Celsius;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int number = scanner.nextInt();
        Fahrenheit = ((number*9)/5) + 32;
        System.out.print("The temperature in Fahrenheit is: " + Fahrenheit);
    }}