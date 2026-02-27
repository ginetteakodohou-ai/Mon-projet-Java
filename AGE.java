import java.util.Scanner;
public class AGE{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Veillez entrer votre age:");
	int age=sc.nextInt();
	if(age>=18){
		System.out.println("Vous etes majeur");
	}
	else {
		System.out.println("Vous etes mineur");
	}
}
}