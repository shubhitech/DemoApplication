package in.ineuron.cl;

public class DemoApplication {

	public static void main(String[] args) {
		
		int [] a= {10,20,30,40};
		for(int ele:a) {
			System.out.println(ele);
		}
		String str = "China";
	int count	=str.toUpperCase().length();
	System.out.println("the length of the string ::" +count);
	System.out.println("done");
	System.out.println("all");
	
	StringBuffer sb = new StringBuffer();
	 int ct =sb.append("plz").reverse().length();
	 System.out.println(ct);
	 System.out.println("printed");
		
		

	}

}
