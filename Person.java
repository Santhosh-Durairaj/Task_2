package Task_2;

public class Person {
    static int age = 18;
    String name;
    Person(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("age = "+this.age+"\n"+"Name = "+this.name);
    }
}
