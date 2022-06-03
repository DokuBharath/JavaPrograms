
public class StringExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bharath";
		String s2="Bharath";
		String s3="bharath";
		String s4=new String("bharath");
		String s5="doku";
		
		//1.equals()
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equalsIgnoreCase(s2));//true
		
		//2.==
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//true
		System.out.println(s1==s4);//false
		
		//3.compareTo
		System.out.println(s1.compareTo(s2));//32
		System.out.println(s1.compareTo(s3));//0
		System.out.println(s1.compareTo(s4));//0
		System.out.println(s1.compareTo(s5));//-2
		System.out.println(s5.compareTo(s1));//2
		

	}

}
