package algorithm;

public class Q1_6_D_Compression {
	public static String compress(String str) {
		StringBuilder result=new StringBuilder();
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
			if((i+1)>=str.length()||str.charAt(i)!=str.charAt(i+1)) {
				result.append(str.charAt(i));
				result.append(count);
				count=0;
			}
		}return result.toString();
	}
	public static void main(String args[]) {
		String str="aaabbbbba";
		String compressed=compress(str);
		if(str.length()>compressed.length()) {
			System.out.println(compressed);
		}else System.out.println(str);
	}

}
