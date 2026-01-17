import java.util.Scanner;

public class App {

//Main method to get user input
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("What is the employee's name? ");
    String inputName = input.nextLine();

    System.out.print("What is their hourly rate? ");
    int inputHourlyRate = input.nextInt(); 

    System.out.print("How many hours did they work this month? ");
    int inputHours = input.nextInt();

    PaymentSlip slip = new PaymentSlip(inputName, inputHours, inputHourlyRate);
        new App().displaySlip(slip);
        input.close();
    }

//Presentation of information about an employee's payment slip
    public void displaySlip(PaymentSlip slip) {
        System.out.println("---------------");
        System.out.println("## PAYMENT INFORMATION ##\n");
        System.out.println("Name:\t\t" + slip.getName());
        System.out.println("Hourly rate:\t$" + slip.gethourlyRate());
        System.out.println("Hours worked:\t" + slip.gethours());
        System.out.println();
        System.out.println("Salary before tax:\t$" + slip.CalculateSalary());
        System.out.println("Salary after tax:\t$" + slip.CalculateNetSalary());
        System.out.println();
        System.out.println("If you have any questions regarding your salary, contact Bob");
        System.out.println("---------------");
    }

}
