package algorithm;

public class Q1_3_URL {
	
	public static void findSpace(char[] arr,int length) {
		int count=0,index;int i=0;
		for(i=0;i<length;i++) {
			if(arr[i]==' ')
				count++;
		}
		index=length+count*2;
		if (length < arr.length) arr[length] = '\0';
		for(i=length-1;i>=0;i--) {
			if(arr[i]==' ') {
				arr[index-1]='0';
				arr[index-2]='2';
				arr[index-3]='%';
				index=index-3;
			}else {
				arr[index-1]=arr[i];
				index--;
			}
		}
	}
	
	public static int findLastCharacter(char[] str) {
		for (int i = str.length - 1; i >= 0; i--) {
			if (str[i] != ' ') {
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		//"Hello World"는 안되고 "Hello World   "는 되는 이유를 모르겠다. 문자변환시 필요한 자릿수만큼 공백이 필요한데 그 이유가 뭐지???
		//필요한건 알겠는데 문제상에서 주어지는 입력에는 공백이 없음!! 문제 오류인지? 그렇다면 입력에서 공백없이 받으려면 어째야하는가??
		//그리고 findLastCharacter메소드는 교재답지에는 안써있는데 왜 이걸 안쓰고 그냥 length()하면 에러가 날까??
		//애초에 이 문제에서 replace쓰면 안되는 이유를 모르겠어 ..ㅋㅋ
		String str="Hello World  ";
		char[] arr=str.toCharArray();
		int length=findLastCharacter(arr)+1;
		findSpace(arr,length);
		String rstr=String.copyValueOf(arr);
		System.out.println(rstr);
		
	}
}
