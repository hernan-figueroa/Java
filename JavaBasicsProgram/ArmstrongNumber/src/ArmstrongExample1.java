import java.util.Scanner;

public class ArmstrongExample1 {

	
	static boolean isArmstrong(int n) {
		int digits=0,last=0, sum=0,temp;
		temp=n;
		while (temp>0) {
			temp=temp/10;
			digits++;
		}
		temp=n;
		while (temp>0) {
			last=temp%10;
			sum+=(Math.pow(last, digits));
			temp=temp/10;
		}
		if(n==sum) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the limit: ");
		num=s.nextInt();
		
		System.out.println("Armstrong number up to "+num+ " are");
		
		for (int i = 0; i < num; i++) {
			if(isArmstrong(i)) {
				System.out.print(" "+i);
			}
			
		}
		
	}

}
