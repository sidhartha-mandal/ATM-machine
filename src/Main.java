import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
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
            }
        }else{
            System.out.println("Incorrct ATM pin or Number..");
            System.exit(0);
        }
    }
}