import com.sidharth.AtmOperationImpl;
import com.sidharth.AtmOperationInterface;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AtmOperationInterface op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 1234;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your ATM number : ");
        int atmNumber = sc.nextInt();
        System.out.print("enter your ATM PIN : ");
        int atmPin = sc.nextInt();
        if ((atmNumber == atmnumber) &&(atmPin==atmpin)) {

            while(true){
                System.out.println("1. Available the Balance. \n 2. Withdraw the Amount. \n 3. Deposit the amount. \n 4. View Mini Statement. \n 5. EXIT the program");
                System.out.println("Enter the choice: ");
                int ch = sc.nextInt();
                if(ch ==1){
                    op.viewBalance();
                }
                 else if(ch ==2){
                    System.out.println("Enter the Amount u want to withdraw...\n");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch ==3){
                    System.out.println("Enter the amount you want to deposit: ");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch ==4){

                }
                else if(ch ==5){
                    System.out.println("Please collect your ATM card.\n Thank you for using the ATM...");
                    System.exit(0);
                }else{
                    System.out.println("Incorrect choice");
                }
            }
        }else{
            System.out.println("Incorrct ATM pin or Number..");
            System.exit(0);
        }
    }
}