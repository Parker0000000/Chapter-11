import java.util.Date;
import java.time.LocalDate;

public class CheckingAccount extends Account{
    private int ID;
    private double balance;
    private double annualinterestrate;
    private Date datecreated;
    double days;
    double newamount;
    double newasdf;
    double newbalance;
    Date currentDate = new Date();
    LocalDate date = LocalDate.now();
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    int answer = 0;
    double d = 0;
    Double nfg = 0.0;
    
    


    CheckingAccount() {
        ID = 0;
        balance =0;
        annualinterestrate = 0;
        datecreated = currentDate;
        
    }

    CheckingAccount(int newID, double newbalance, double newintrest, double withdraw, double deposit, double newdate, int jh) {
        this.ID = newID;
        this.newamount = 0;
        this.balance = newbalance;
        this.annualinterestrate = newintrest;
        this.newamount = withdraw;
        this.newasdf = deposit;
        this.days = newdate;
        this.answer = jh;
        double[] idbalance = new double[100];
        for (int q = 0; q < 100; q++) {
            idbalance[q] = 100;
        }
        this.d = idbalance[ID];
        
        
        
        
    }
    double normal1() {
        return Deposit1();
    }

    String notice1() {
        return "you are overdrafted and have a limit of 100";
    }

    int ID1() {
        return ID;
    }
    double getmonthlyintrestrate1() {
        return (annualinterestrate / 100); 
    }
    double monthlyintrest1() {
        return balance * (days * getmonthlyintrestrate1());
    }
    double Withdraw1() {
        if (newasdf - d != -100) {
            return d - newamount;
        } else {
            return -101;
        }
        
    }
    double Deposit1() {
        return d + newasdf;
    }
    String datecreated1() {
        return day + "/" + month + "/" + year;
    }
}