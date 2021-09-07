import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where are you live" + name + " ?");
        String address = scanner.nextLine();
        System.out.println("Nice to meet to you, " + name + " from " +address);
    }
}
