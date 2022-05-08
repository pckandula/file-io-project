import java.util.Scanner;
import java.util.*;
import java.io.*;
public class vertuvalkey {
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	public static void assendingorder() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		File u = new File("My project files");
	
		String s[] =u.list();
		Arrays.sort(s);
		for(String si:s) {
			System.out.println(si);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	public static void businesslevelOperations() throws IOException{
		Scanner t = new Scanner(System.in);
		int  operator=0;
	
		System.out.println("Enter your option:"+"\r\n1.Get file Names in ascending order."
											+"\r\n2.Business Level Operations."
											+"\r\n3.Close the Application.");
	
		operator = t.nextInt();
		
		if(operator ==1) {
			assendingorder();
		}
		if(operator == 2) {
			while(true) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("enter your option:"+"\nenter 1 : add file\r\n"
				+ "		enter 2:  delete file\r\n"
				+ "		enter 3:  search file\r\n"
				+ "		enter 4:  go back");
		int operation = t.nextInt();
	
		switch(operation) {
		case(1):
		  {
			
			add();
			break;
			
		  }
		case(3):
		  {
			search();
			break;
		  }
		case(2):
		  {
			delete();
			break;
		  }
		  case(4):
		  {
			 //clearScreen();
			return;
		  }
		  
		}
		
		       // break;
		}
		}
		else if(operator == 3) {
		System.exit(0);
	}
}
    public static void search() {
    	Scanner ss = new Scanner(System.in);
    	System.out.println("enter the element to search:");
    	String key = ss.nextLine();
    	File su = new File("My project files");
    	String[] arr = su.list();
    	Arrays.sort(arr);
    	int result = Arrays.binarySearch(arr, key);
    	if (result<0) {
    		System.out.println("element not found.");
    	}
    	else{
    		System.out.println("element found at index " + result);
    	}
    }
	public static void add() throws IOException{
		Scanner z = new Scanner(System.in);
		System.out.println("enter the file to add");
		String file = z.nextLine();
		File k = new File("My project files",file);
		k.createNewFile();
		if(k.exists())
			System.out.println("file addeded sussfully.");
		
	}
	public static void delete() throws IOException {
		Scanner y = new Scanner(System.in);
		System.out.println("enter the file to delete");
		String file1 = y.nextLine();
		File q = new File("My project files",file1);
		q.delete();
	}
	public static void main(String[] args)  throws IOException {
		 Scanner sc = new Scanner(System.in);
		
		
		System.out.println();
		System.out.println("             *******************WELCOME TO LOCKEDME.COM********************");
		System.out.println();
		System.out.println("Application Name: Virtual Key Repository");
		System.out.println();
		System.out.println("DEVELOPER DETAILS:");
		System.out.println("Name: PRADEEP CHANDRA KANDULA\r\n"
				+ "Designation: Software Developer\r\n"
				+ "Date: 05-05-2022");
		System.out.println();
		System.out.println();
		System.out.println();
		 File f = new File("My project files");
			f.mkdir();
		while(true) {
			businesslevelOperations();
}
}
}