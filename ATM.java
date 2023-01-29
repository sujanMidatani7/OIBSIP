import java.util.*;

public class ATM {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("<---Welcome to ATM interface by Sujan Midatani--->");
        Account a=new Account();
        System.out.println("please enter your UserName : \n");
        if(a.checkUserName(sc.next())==false){System.out.println("please enter valid username!!");}
        else{
        System.out.println("enter your pin to verify its you!!");
        if(sc.nextInt()!=a.getpin()){
            System.out.println("please try again!! You entered wrong pin...");

        }
        else{
        System.out.println("Pin chesk Succesfull");
        
        
        while(true){
            System.out.println("\n\nwhat type of operation you wanna do...\nenter a number based on your selection..\n");
            System.out.println("{1:Transaction history 2:Withdraw 3:Deposit 4:Transfer 5:balance 6:Quit}");
        switch(sc.nextInt()){
            case 1:
                if(a.getBalance()<100000) System.out.println("\nyou have withdrawn "+(100000-a.getBalance())+" from your account!!");
                else System.out.println("\nYou have deposited "+(a.getBalance()-100000)+" to your account");
                break;
            case 2:
                System.out.println("\nenter amount to withdraw from your account!!");
                int am=sc.nextInt();
                if(am>a.getBalance()){
                    System.out.println("please check your balance, its unsufficient");

                }
                else{
                    System.out.println("\nyour balance now is "+a.withdraw(am));
                }
                break;
            case 3:
                System.out.println("\nenter amount to deposit into your account");
                int am1=sc.nextInt();
                System.out.println("your balance is updated to "+a.credit(am1));
                break;
            case 4:
                System.out.println("\nenter an username to transfer the amount to his account");
                String s=sc.next();
                System.out.println("enter the amount to transfer..");
                int am2=sc.nextInt();
                if(am2>a.getBalance()){
                    System.out.println("please check your balance, its unsufficient");

                }
                else{
                    System.out.println("\nyour amount is tranfered!!\n to "+s);
                    System.out.println("your balance now is "+a.withdraw(am2));
                }
                break;
            case 5:
                System.out.println("\nyour balance is "+a.getBalance());
                break;
            case 6:
                System.out.println("\nprogram terminated");
                System.exit(0);
            default:
                System.out.println("\nplease check the number you have entered");

        }
        
    }}}
    sc.close();
    }

}
class Account{
    private int pin=9271;
    private int balance=100000;
    private String username="sujan";
    boolean checkUserName(String s){
        return this.username==s;

    }
    int getBalance(){
        return this.balance;
    }
    int getpin(){
        return this.pin;
    }
    int withdraw(int am){
        this.balance=this.balance-am;
        return this.balance;

    }
    int credit(int am){
        this.balance=this.balance+am;
        return this.balance;
    }
    
}
