import java.util.Scanner;

public class HelloAge {
    public static void main(String[] args) {
        int age;
        int my_age=17;
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter Your age");
        age= abc.nextInt();
       if (age==my_age){
           System.out.println("hello");
       }
       else {
           System.out.println("not of my age");
       }
    }
}
