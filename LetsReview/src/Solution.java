import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numTestCases = Integer.parseInt(sc.nextLine());
        
        String[] inputs = new String[numTestCases];
        
        for (int i = 0; i < numTestCases; i++) {
        	inputs[i] = sc.nextLine();
        }
        
        for (int i = 0; i < inputs.length; i++) {
        	char[] inputArray = inputs[i].toCharArray();
        	String one = "";
        	String two = "";
        	
        	for (int j = 0; j < inputArray.length; j++) {
        		if(j % 2 == 0) {
        			one += inputArray[j];
        		} else {
        			two += inputArray[j];
        		}
        	}
        	System.out.println(one + " " +two);
        }
    }
}
