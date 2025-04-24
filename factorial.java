import java.util.*;
class factorial{
	public static void fac(int num){
		int i;
		int res=1;
		for(i=num; i>=1; i--)
		{
			res=res*i;
		}
		System.out.println(res);
		return;
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		fac(number);
		
	}
}