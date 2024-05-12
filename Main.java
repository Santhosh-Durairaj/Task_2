package Task_2;

public class Main {
    public static void main (String args []){
        Person p = new Person("Santhosh");
        Person s = new Person ("Varun");
        p.display();
        s.display();



        Account a = new Account (123, 658);
        System.out.println(a.deposit(1000));
        System.out.println(a.withdraw(300));
        a.display();
        

    }
    
}
