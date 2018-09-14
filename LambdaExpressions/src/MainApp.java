import java.io.*;
import java.util.*;

interface PerformOperation {
	
	boolean check(int a);
 
}
class MyMath {
	
	public boolean checker(PerformOperation p, int num) {
		 
		return p.check(num);
	  
	}
	
	public PerformOperation isOdd() {
		
		return (int num) -> {
			
			return num % 2 != 0;
			
		};
		
	}
	
	public PerformOperation isPrime() {
		
		return (int num) -> {
			boolean isPrime = true;
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
			
			return isPrime;
		};
		
	}
	
	public PerformOperation isPalindrome() {
		
		return (int num) -> {
			
			return Integer.toString(num).equals(new StringBuilder(Integer.toString(num)).reverse().toString());
			
		};
		
	}
 
}
public class MainApp {
	
	public static void main(String[] args) throws IOException {
		
		MyMath ob = new MyMath();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		PerformOperation op;
		
		boolean ret = false;
		String ans = null;
		
		while (T--> 0) {
			
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int choice = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			
			if (choice == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, number);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (choice == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, number);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (choice == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, number);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
			}
			
			System.out.println(ans);
			
		}
		
	}
	
}