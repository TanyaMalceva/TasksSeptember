import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorSwitch {
    public static boolean isNumeric(String strNum) {
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Character> operations = Arrays.asList('+', '-', '/', 'x', '%');
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Operator: ");
        String in = sc.next();

        while (operations.contains(in.charAt(0)) == false) {
            System.out.print("Entered operation is not supported. Please insert correct operation: ");
            in = sc.next();
        }
        char oper = in.charAt(0);


        System.out.print("Enter a number: ");
        in = sc.next();
        while (isNumeric(in) == false) {
            System.out.print("Entered value is not a number. Please insert correct value: ");
            in = sc.next();
        }
        double num1 = Double.parseDouble(in);


        System.out.print("Enter another number: ");
        in = sc.next();
        while (isNumeric(in) == false) {
            System.out.print("Entered value is not a number. Please insert correct value: ");
            in = sc.next();
        }
        double num2 = Double.parseDouble(in);


        switch (oper) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Not supported operation");
        }
    }
}
