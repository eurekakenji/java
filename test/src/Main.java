import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter 3-digit number: ");
    double number = scanner.nextInt();
    double sum = number/1000;
    double remainder = number%1;
    double left = sum - remainder;
    double lot = remainder *100;
    int start = 0;
    int pos = 1
    while (number > 0) {
        int num = left % 10
        start += num;
        int nums = lot % 10;
        lot -= nums;
    }
    System.out.println("Tens in number: " + (int) left);
    System.out.println("Elevens in number: " + (int) lot);
        }}