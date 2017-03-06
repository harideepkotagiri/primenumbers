package javaprimenumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("number is even");
			
		}
		if(n%2!=0){
			System.out.println("number is not a odd");

	}

}
