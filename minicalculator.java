import java.util.Scanner;
public class minicalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("nombre 1:");
		Double a=sc.nextDouble();
		System.out.println("Nombre2:");
		Double b=sc.nextDouble();
		System.out.println("Les opperations disponible sont:");
		System.out.println("1.Adittion");
		System.out.println("2.Soustration");
		System.out.println("3.Division");
		System.out.println("Faites votre choix");
		int choix=sc.nextInt();
		switch(choix){
			case 1->System.out.println(a+ "+" +b+ "=" +(a+b));
			case 2->System.out.println(a+ "-" +b+ "=" +(a-b));
			case 3->{
				if(b!=0){
					System.out.println(a+ "/" +b+ "=" +(a/b));	
				}
				else
				{
					System.out.println("Division par 0 impossible");
				}
			}
			default ->System.out.println("Choix invalide");
		}
		
		
	}
}
