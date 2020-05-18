package algorithm;
//1.1중복이 없는가?
//대소문자 따로 인식
public class UniqueChar_1_1 {
	
	public static boolean uniqueChar(String str) {
		boolean arraychar[]=new boolean[128];
		if(str.length()>128) return false;
		
		for(int i=0;i<str.length();i++) {
			int val=str.charAt(i);
			if(arraychar[val])return false;
			arraychar[val]=true;
		}
		return true;
	}
	public static void main(String args[]) {
		String[] names= {"apple","abcde","banana","fruit","AaBbCc"};
		for(String s:names) {
			System.out.println("<"+s+">이라는 단어에 중복이 없는가?: "+uniqueChar(s));
		}
	}

}
