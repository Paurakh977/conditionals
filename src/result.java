import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        int maths,physics,chem;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter your obtained marks in  maths,physics,chem respectively ");
        maths= obj.nextInt();
        physics=obj.nextInt();
        chem=obj.nextInt();
        int  total=300;
        int total_obtained=maths+physics+chem;
        double percentage=  ((double) total_obtained/total)*100.00;
        System.out.println(percentage);
        if (percentage>=90)
        {
            System.out.println("You scored A and your precentage is :" + percentage);
        } else if (percentage<90 & percentage>=70) {
            System.out.println("You scored B and your precentage is :" + percentage);
        }
        else if (percentage<70 & percentage>=40) {
            System.out.println("You scored C and your precentage is :" + percentage);
        }
        else {
            System.out.println("Better luck next time. You failed. Your percentage is :" +percentage);
        }


    }
}
