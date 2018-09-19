import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MainApp {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            int arrItem = Integer.parseInt(arrItems[j]);
            arr[i] = arrItem;
            
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}