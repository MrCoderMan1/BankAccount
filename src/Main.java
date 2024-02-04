import BankPackage.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        var scanner = new Scanner(System.in);

        System.out.println("\nHello! Welcome to the bank, please enter your name: ");
        String name = scanner.nextLine();

        //Capitalize first letter of name if not already done
        var first = Character.toUpperCase(name.charAt(0));
        var rem = name.substring(1);
        name = first + rem;

        System.out.println("Thanks, now enter your balance: ");
        double bankBalance = scanner.nextDouble();
        scanner.nextLine();

        var bankAcct = new BankAccount(name, bankBalance);

        System.out.println("\n" + bankAcct.printValues(true, true));
        System.out.println("Type '1' to add/subtract from balance; Type '2' to exit.");

        int input = scanner.nextInt();

        if(input == 1){
            System.out.println("Type '1' to add or '2' to subtract to your balance: ");
            int newinput = scanner.nextInt();
            if(newinput == 1){
                System.out.println("Type how much you want to add: ");
                double D = scanner.nextDouble();
                scanner.close();

                bankAcct.add(D);

                System.out.println("\n" + 
                bankAcct.printValues(false, true));
            }
            else if(newinput == 2){
                System.out.println("Type how much you want to subtract: ");
                double D = scanner.nextDouble();
                scanner.close();

                if(bankAcct.subtract(D) > -1){
                    System.out.println("\nBalance: " + 
                    bankAcct.printValues(false, true));
                }
            }
            else{
                System.out.println("Invalid Input");
                scanner.close();
                return;
            }
        }
        else if(input != 1 ){
            System.out.println("Bye!");
            scanner.close();
            return;
        }
    }
}
