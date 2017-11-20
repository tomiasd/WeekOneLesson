import java.util.Scanner;

public class FinalPrimeNumbers {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				int fNum, sNum, i, temp, flag;
				
				System.out.println("Enter Any Number:");
				fNum = input.nextInt();
				
				System.out.println("Enter Any Number: ");
				sNum = input.nextInt();
				
				if (fNum > sNum) {
					temp = fNum;
					fNum = sNum;
					sNum = temp;
				}
				System.out.println("The Prime Numbers Between: " +fNum+ " " + sNum);
				while(fNum < sNum) {
					flag = 0;
					for (i = 2; i <= fNum /2; i++) {
						if (fNum % i == 0) {
							flag = 1;
							break;
							
						}
					}
					if (flag ==0)
						System.out.println("\t" +fNum);
					fNum++;
				}
				
			}
}
	
		



