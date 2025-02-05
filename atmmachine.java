import java.util.Scanner;

class ATMinterface{
    float Balance;
    int PIN=3754;

    public void checkpin(){
        System.out.println("Enter your pin");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Please Enter a Valid PIN");
        }
    }

    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        
        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        } 
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a Valid Choice");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successful");
        }
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc= new Scanner(System.in);
        float amount=sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully!!");

    }
}


public class atmmachine {
    public static void main(String[] args){
        ATMinterface obj= new ATMinterface();
        obj.checkpin();
    }
}
