import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String something = scanner.nextLine();
        while (true) {
        String result = reverseString(something);
        System.out.println(result);
        something = scanner.nextLine();}
    }

    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
        }

}