import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {
            final byte NUMBER_OF_MONTHS = 12;
            final byte PERCENT = 100;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal: ");
            int principal = scanner.nextInt();

            System.out.print("Annual Interest Rate: ");
            Float annualInterest = scanner.nextFloat();
            Float monthlyInterest = annualInterest / PERCENT / NUMBER_OF_MONTHS;

            System.out.print("Period (Years): ");
            byte period = scanner.nextByte();

            Double mortgage = principal *
                    (monthlyInterest * Math.pow(1 + monthlyInterest, period)) /
                    (Math.pow(1 + monthlyInterest, period) - 1);
            String mortgageModified = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("Mortgage: " + mortgageModified);
    }

}
