import java.util.Scanner;
public class factoriel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Veillez entrer un entier:");
		int a=sc.nextInt();
		long fact=1;
		for(int i=1;i<=a;i++){
			fact*=i;
		}
		System.out.println(a+ "!=" +fact);
	}
}