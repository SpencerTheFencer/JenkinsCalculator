import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String commandLine = scanner.nextLine();
        String command;
        int num1, num2;

        while (!"".equals(commandLine) && !"q".equals(commandLine)) {
            String[] arguments = commandLine.split(" ");
            command = arguments[0];
            switch (command) {
                case "add":
                    num1 = Integer.parseInt(arguments[1]);
                    num2 = Integer.parseInt(arguments[2]);
                    System.out.println(calculator.add(num1, num2));
                    break;
                case "subtract":
                    num1 = Integer.parseInt(arguments[1]);
                    num2 = Integer.parseInt(arguments[2]);
                    System.out.println(calculator.subtract(num1, num2));
                    break;
                case "divide":
                    num1 = Integer.parseInt(arguments[1]);
                    num2 = Integer.parseInt(arguments[2]);
                    System.out.println(calculator.divide(num1, num2));
                    break;
                case "multiply":
                    num1 = Integer.parseInt(arguments[1]);
                    num2 = Integer.parseInt(arguments[2]);
                    System.out.println(calculator.multiply(num1, num2));
                    break;
                case "fib":
                    num1 = Integer.parseInt(arguments[1]);
                    System.out.println(calculator.fibonacciNumberFinder(num1));
                    break;
                case "binary":
                    num1 = Integer.parseInt(arguments[1]);
                    System.out.println(calculator.intToBinaryNumber(num1));
                    break;
                default:
                    break;
            }
            commandLine = scanner.nextLine();
        }
    }
}
