import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int newID=0;
        int j=0;
        double newbalance =0;
        double newintrest=0;
        double withdraw=0;
        double deposit=0;
        double newdate=0;
        int jh = 0;
        int y = 1;
        while (y > 0) {
            System.out.println("Enter ID");
            newID = input.nextInt();
            System.out.println("Enter which account you will be using: 1 Checking or 2 Savings");
            j = input.nextInt();
            if (j == 1) {
                System.out.println("Enter what you will be doing today: 1 deposit, 2 withdraw, 3 exit");
                int kj = input.nextInt();
                    if (kj == 1) {
                    System.out.println("Enter deposit amount:");
                    deposit = input.nextDouble();
                    CheckingAccount cAccount = new CheckingAccount(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
                    
                
                    System.out.println("Your new ballance is " + cAccount.Deposit1());
                
                    
                
                } else if (kj == 2) {
                    System.out.println("Enter Withdraw amount:");
                    withdraw = input.nextDouble();
                    CheckingAccount cAccount = new CheckingAccount(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
                    if (cAccount.Withdraw1() == -101) {
                        System.out.println("you have reached your overdraft limit, Please withdraw less");
                        deposit = input.nextDouble();
                    }
                    System.out.println("Your new balance is " + cAccount.Withdraw1());
                }else if (kj == 3) {
                    break;
                }

            } else if (j == 2) {
                System.out.println("Enter what you will be doing today: 1 deposit, 2 withdraw, 3 exit");
                int kj = input.nextInt();
                    if (kj == 1) {
                    System.out.println("Enter deposit amount:");
                    deposit = input.nextDouble();
                    SavingsAccount sAccount = new SavingsAccount(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
                    System.out.println("Your new ballance is " + sAccount.Deposit1());
                } else if (kj == 2) {
                    System.out.println("Enter Withdraw amount:");
                    withdraw = input.nextDouble();
                    SavingsAccount sAccount = new SavingsAccount(newID, newbalance, newintrest, withdraw, deposit, newdate, jh);
                if (sAccount.Withdraw1() == -101) {
                        System.out.println("you cant overdraft a saveings account, Please withdraw less");
                        deposit = input.nextDouble();
                }
                System.out.println("Your new ballance is " + sAccount.Withdraw1());
                }else if (kj == 3) {
                    break;
                }
            } else {
            break;
            }
        }
    }
}
