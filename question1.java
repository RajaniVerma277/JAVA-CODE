import java.util.Scanner;
public class question1 {
    public static void main(String args[]){
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>18)
        {
            System.out.println("you are eligible for driving");
        }
        else{
            System.out.println("you are not eligible");
        }


    }
}
