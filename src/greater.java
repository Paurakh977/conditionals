import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        int x,y;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter 2 numbers X,Y");
        x=obj.nextInt();
        y=obj.nextInt();
        System.out.println("1st number is"+x);
        System.out.println("2nd number is"+y);
        if (x>y){
            System.out.println(x+"is greater");
        } else if (y>x) {
            System.out.println(y+"is greater");
        }
        else {
            System.out.println("equal");
        }
    }
}
