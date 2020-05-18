package algorithm;
//1.1중복이 없는가?
//대소문자 따로 인식
//비트벡터로 구현하는 방법이 훨씬 코드가 짧고 간결함(아직 안함 ㅎ;)
public class UniqueChar_1_1 {
	
	public static boolean uniqueChar(String str) {
		//아스키코드의 문자 128개만큼의 크기를 가진 배열 생성
		boolean arraychar[]=new boolean[128];
		if(str.length()>128) return false;
		
		for(int i=0;i<str.length();i++) {
			//char를 int로 저장함으로써 아스키코드 값으로 저장, 배열의 각 인덱스로 연결됨.
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
