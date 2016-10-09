
public class Solution {

	public static String longestPalindrome(String s) {
		
		if(null == s || s.length() == 0){
			return "";
		}
		if(s.length() == 1){
			return s;
		}
		
		String maxPalindrome = "";
		int maxMatchedLength = 0;

		char[] characters = s.toCharArray();				

		int n = characters.length;
		
		

		for (int i = 1; i < n; i++) {

			int matchedCharacters = 0;

			while ((i - 1 - matchedCharacters) > 0 && (i + 1 + matchedCharacters) < n
					&& characters[i - 1 - matchedCharacters] == characters[i + 1 + matchedCharacters]) {
				++matchedCharacters;
			}
			
			

			if (matchedCharacters > maxMatchedLength) {
				maxMatchedLength = matchedCharacters;
				// get the longestPalindrome string
				StringBuffer sb = new StringBuffer();
				for (int j = (i - matchedCharacters); j <= (i + matchedCharacters); j++) {
					sb.append(characters[j]);
				}
				
				maxPalindrome = sb.toString();
			}

		}

		return maxPalindrome;

	}

	public static void main(String[] args) {

		String str = "abcedbbac";

		System.out.println(longestPalindrome(str));
	}
}