import java.util.Scanner;
public class BIENVENUE{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enrez votre prenom");
		String prenom=sc.nextLine();
		System.out.println("Enrez votre age");
		int age=sc.nextInt();
		System.out.print("Bienvenue \s" +prenom+ " \s vous avez" ); 
		System.out.print("\n"+age+ "\s ans");
	}	
	}
	