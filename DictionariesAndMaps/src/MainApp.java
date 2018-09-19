import java.util.*;
import java.io.*;

class MainApp{
    public static void main(String []argh){
    	Map<String, String> phoneBook = new HashMap<String, String>() ;
    	
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i = 0; i < n; i++){
        	String[] arrItems = in.nextLine().split(" ");
        	in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String name = arrItems[0].toString();
            String phone = arrItems[1].toString();
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.get(s) != null) {
            	System.out.println(s + "=" + phoneBook.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();
    }
}