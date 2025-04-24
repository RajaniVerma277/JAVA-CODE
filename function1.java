public class function1 {
    public static double average(double a,double b,double c){
        return (a+b+c)/3;

    }
    public static void main(String args[]){
        scanner sc= new scanner(System.in);
        System.out.println("input the first number");
        int x = sc.nextDouble();
        System.out.println("input the first number");
        int y = sc.nextDouble();
        System.out.println("input the first number");
        int z = sc.nextDouble();
        System.out.println("The average of number is"+average(x,y,z));

    }
    
}
