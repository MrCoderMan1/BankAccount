package BankPackage;

public class BankAccount{
    public String name;
    public double balance;

    public BankAccount(String namearg, double balancearg){
        name = namearg;
        balance = balancearg;
    }
    public BankAccount(BankAccount obj){
        name = obj.name;
        balance = obj.balance;
    }
    public BankAccount(double balancearg, String namearg){
        balance = balancearg;
        name = namearg;
    }
    public BankAccount(){

    }

    public void assignValues(String namearg, double balancearg){
        name = namearg;
        balance = balancearg;
    }
    public void assignValues(BankAccount obj){
        name = obj.name;
        balance = obj.balance;
    }
    public void assignValues(double balancearg, String namearg){
        name = namearg;
        balance = balancearg;
    }

    public double add(double num){
        return balance += num;
    }
    public double subtract(double num){
        if(balance - num >= 0){return balance -= num;}
        else{
            System.out.println("\n--Insufficent Balance--");
            return 0;
        }
    }

    public String printValues(boolean namePrint, boolean balPrint){
        if(namePrint == true && balPrint == true){
            return "Name: " + name + "\nBalance " + balance + "$\n";
        }
        else if(namePrint == true && balPrint == false){
            return name + "\n";
        }
        else if(namePrint == false && balPrint == true){
            return String.valueOf(balance) + "$\n";
        }
        else{
            return "";
        }
    }
}