public class hollowrhombus {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("_");
            }
            for(int j=(n-i+1);j<=(n+(n-i));j++){
                if(i==1||i==5||(i+j)==6||(i+j)==9){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
    
}
