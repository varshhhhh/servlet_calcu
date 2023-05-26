package calculator;

public class reverseParticularString {

	public static void main(String[] args) {
		String str="goodjob";
		String str1=str.substring(0,2);
		String str2=str.substring(2,4);
		String srtr3=str.substring(4,6);
		System.out.println(str1);
		char ch; 
		char ch2;
		for (int i =str1.length()-1; i>=0;i--){
			 ch=str1.charAt(i);
			System.out.print(ch);
		}
//		for (int j = str2.length(); j >0; j--) {
//			ch2=str2.charAt(j);
//			System.out.println(ch2);
//		}
	}
}
