package algorithm;

import java.util.Arrays;

public class PermutationCheck_1_2 {
	//순열 확인 문제
	//두 문자열이 순열 관계에 있는가?(=문자열의 구성요소가 순서 상관없이 같은가?)
	public static boolean IsPermutation(String a,String b) {
		if(a.length()!=b.length())return false;
		String[] one=a.split("");
		String[] two=b.split("");
		Arrays.sort(one);
		Arrays.sort(two);
		String r1=String.join("", one);
		String r2=String.join("", two);
		if(r1==r2)return true;
		return true;
	}
	public static void main(String args[]) {
		System.out.println("abcd,dcba는 순열 관계인가? :"+IsPermutation("abcd","dcba"));
		System.out.println("apple,banana는 순열 관계인가? :"+IsPermutation("apple","banana"));
		System.out.println("canada,aaacnd는 순열 관계인가? :"+IsPermutation("canada","aaacnd"));
	}
}
