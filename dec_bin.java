public class dec_bin{
    public static void decBin(int n){
        int rem = 0;
        int p = 0;
        int num=0;
        while(n>0){
            rem=n%2;
            num =num + (rem *(int) Math.pow(10,p));
            p++;
            n=n/2;

        }
        System.out.println("the number of binary is"+ num);

    }
    public static void main(String args[]){
    decBin(7);

}
