package algorithm;

import java.util.Arrays;

public class Q1_2_PermutationCheck {
	//순열 확인 문제
	//두 문자열이 순열 관계에 있는가?(=문자열의 구성요소가 순서 상관없이 같은가?)
	//대소문자 구별 안됌, 공백도 하나의 문자로 취급
	//문자 출현 횟수로 구별하는 방법도 있다. 다른 문제에서 구현하기로,,
	public static boolean IsPermutation(String a,String b) {
		//두 문자열의 길이가 다르다면 당연히 순열관계가 아니므로 false
		if(a.length()!=b.length())return false;
		//자바는 문자열을 sort처리하기 위해서는 문자하나하나를 배열로 만든뒤 다시 문자열 처리해야함,,;;; 따로 함수를 파는게 더 깔끔했을 듯
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
		System.out.println("abcd,DC BA는 순열 관계인가? :"+IsPermutation("abcd","DC BA"));
		System.out.println("apple,banana는 순열 관계인가? :"+IsPermutation("apple","banana"));
		System.out.println("canada,aaacnd는 순열 관계인가? :"+IsPermutation("canada","aaacnd"));
		System.out.println("canada,aaAcnd는 순열 관계인가? :"+IsPermutation("canada","aaAcnd"));
	}
}
