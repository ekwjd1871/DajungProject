package Java.Eighth;

public class IgnoreCasePalindrom {

	public static void main(String[] args) {
		String str = "OtTo";
		String change;
		change = str.toLowerCase();
		
		System.out.println(str + " : " + isPalindrom(change));

	}
	
	static boolean isPalindrom(String s){
		int left = 0;
		int right = s.length() - 1;
		
		while(left <= right){
			if(s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

}
