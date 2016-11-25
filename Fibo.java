import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibo {
	
	private static Scanner scanner;

	public static void main(String[] args) throws IOException{
		List<Integer> fiboList = new ArrayList<Integer>();
		
		fiboList.add(new Integer(1));
		fiboList.add(new Integer(1));
		
		System.out.println("length:_");
		scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		System.out.println("result:");
		
		for(int n=0; n<length; n++){
			if(n!=0){
		    int sum = fiboList.get(n)+fiboList.get(n-1);
			fiboList.add(new Integer(sum));
			}
			System.out.println(fiboList.get(n));
		}
	}
}
