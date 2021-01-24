import java.util.Scanner;
public class PlaceValue {

	public static void main(String[] args) {
		int temp,num,rem;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		temp=scan.nextInt();
		num=temp;
		System.out.println(num);
		rem=num%10;
		num=num/10;
		System.out.println("1 Rs note of "+rem);
		while(num != 0) {
			for(int i=10;i<=temp;i=i*10)
			{
				rem=num%10;
				num=num/10;
				System.out.println(+i+" Rs note of "+rem);
			}
		}
	}

}
