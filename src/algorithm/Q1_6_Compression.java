package algorithm;

public class Q1_6_Compression {
	//그럴듯하게 구현만 됌ㅋㅋ 길이 비교가 안되서 조건 불충족 
	public static void compress(String str) {
		char[] arr=str.toCharArray();
		int[] count=new int[128];
		for(char c:arr) {
			int a=c;
			count[a]++;
		}
		for(int i=0;i<128;i++) {
			if(count[i]>0) {
				System.out.printf("%c%d",i,count[i]);
			}
		}
	}
	public static void main(String args[]) {
		compress("aaabbccbbaazcc");
	}

}
