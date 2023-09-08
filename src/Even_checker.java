import java.util.Scanner;

public class Even_checker {
    public static void main(String[] args) {
        int number;
        Scanner obj=new Scanner(System.in);
        System.out.println("NUmber hal");
        number= obj.nextInt();
        if (number%2==0){
            System.out.println("Even ho");
        }
        else {
            System.out.println("even haina");
        }
    }
}
