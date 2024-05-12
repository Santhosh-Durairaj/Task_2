package Task_2;

public class Account {

    int A_no;
    int balance;
    Account(){

    }
Account(int A_no, int balance){
    this.A_no = A_no;
    this.balance = balance;

}   

public boolean deposit(int amount){

if (amount >0){
    this.balance += amount;
    return true;
}
else{
    return false;
}

}
public boolean withdraw(int amount){
    if (amount<this.balance){
        this.balance -= amount;
        return true;
    }
    else {
        return false;
    }

}
public void display(){
    System.out.println("Balance for this A_no is " + "Account no:" + this.A_no + "Balance" + this.balance);
}
}
