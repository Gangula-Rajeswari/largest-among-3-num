import java.util.Scanner;
class large{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=s.nextInt();
		System.out.println("enter b value:");
		int b=s.nextInt();
		System.out.println("enter c value:");
		int c=s.nextInt();
		if(a>=b && a>=c){
			System.out.println("a is large");
		}
		else if(b>=c && b>=a){
			System.out.println("b is large");
		}
		else{
			System.out.println("c is large");
		}
		
		
	}
}