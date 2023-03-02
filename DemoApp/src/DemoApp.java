
public class DemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,20,30,40,50};
		for(int ele:a) {
			System.out.println(ele);
		}
		String name = "sachin";
		int count = name.toUpperCase().length();
		System.out.println("The lenght of string is "+ count);
	
		StringBuffer sb = new StringBuffer("Sachin");
		int length = sb.append("tendulkar").reverse().length();
		System.out.println(length);
	}

}
