import java.util.Scanner;

public class String_demo {

	String arr[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String  line;// = "Hadoop is open source frame work ,Hadoop is good framework for handling big data" ;
		line = sc.nextLine();
		String_demo sd = new String_demo();
		
		//System.out.println(line);
		line = line.replace(',', ' ');
		//System.out.println(line);
		sd.arr = line.split("\\s+");
		
		for(String s : sd.arr)
		{
			System.out.println(s);
		}
		
		sc.close();
		
	}

}