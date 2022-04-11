package Java_Book_Ex;


public class ArrayEx12 {

	public static void main(String[] args) {
		String[]name = {"Kim", "Park", "Yi"};
		
		for (int i=0; i<name.length; i++)
			System.out.println("names[" + i + "]: "+ name[i]);
		String tmp = name[2];
		System.out.println("tmp: "+tmp);
		name[0] = "Yu";
		
		for(String str : name)
			System.out.println(str);
			
	}

}
