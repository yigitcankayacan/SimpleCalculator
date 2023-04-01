import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number1;
        double number2;
        String operator;


        System.out.print("Please enter first number= ");
        number1 = scanner.nextInt();
        System.out.print("Please enter second number= ");
        number2 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Select a operator: +, -, /, x");
        operator = scanner.nextLine();

        if (operator.equals("+")) {
            System.out.println("result= " + (number1 + number2));
        } else if (operator.equals("-")) {
            System.out.println("result= " + (number1 - number2));
        } else if (operator.equals("/")) {
            if (number2 == 0) {
                System.out.println("number cannot be divided by zero!");
            } else {
                System.out.println("result= " + (number1 / number2));
            }
        } else if (operator.equals("x")) {
            System.out.println("result= " + (number1 * number2));
        } else {
            System.out.println("Plese enter one of the operators");
        }
    }
}
