package calcu_app;
import java.util.Scanner;

public class JavaExample {

	public static void main(String[] args) {
		double num1, num2;
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            default:
                System.out.print("You have entered wrong operator");
                return;
        }

        System.out.print(num1+" "+operator+" "+num2+": "+output);
    }
		
}


