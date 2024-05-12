import java.util.*;
public class Product {
    
    int pid;
    int price;
    int quantity;
    Product(int pid , int price ,int quantity){

        this.pid = pid;
        this.price=price;
        this.quantity=quantity;
    } 
    public static int findTheMaxValue(Product[] arr){
        int sum = 0;
        for (int i = 0; i<5; i++){
            sum += (arr [i].price * arr [i].quantity);
        }
        return sum;
    }



    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        Product [] arr = new Product[5];
        for(int i=0; i<5; i++){
            int pid = s.nextInt();
            int price = s.nextInt();
            int quantity = s.nextInt();
            arr[i]=new Product(pid, price, quantity);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<5; i++){
            if (arr [i].price >= max){
                max = arr [i].price;
            }
        }
        System.out.println("max value of the objects"+max);
        int sum = findTheMaxValue(arr);
        System.out.println("sum of the elements is " + sum);    
}
   
}
