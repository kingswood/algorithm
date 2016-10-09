package onlinetest;

public class LongestPalindrome {

	/*
	for example the string is 
	'acdefedacab' which has 'n' characters

	create a local variant 'maxLength' to store the max length 

	check each character from 0 to n-1

	n = 0 middle character is a
	left character is null then pass

	n=1 middle character is c
	left character a not equals right character c then pass

	n=2 middle character is d
	left character 'a' doesn't equals right character 'e' then pass

	...

	n=4 middle character is 'f'
	left character 'e' equals to right character 'e' 
	next left character 'd' equals to next right character 'd'
	then the palindrome word is 'defde' and length is 5
	store the value 5 into variant maxLength

	....
	continue to check the rest characters one by one until the end of the string
	if the next palindrome word's length is greater than maxLength then update the value in maxLength 

	The best the situation is no palidrome found then the time complexity is O(n)
	The worst situation is the entire string is a palidrome word then the time complexity is O(n * n/2) = O(n^2)
	So the evarage time complexity is O(n^2)
	the space complexity is O(1)

	*/
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
		
		for (int i = 1; i < n; i++) {

			int matchedCharacters = 0;

			while ((i - matchedCharacters) > 0 && (i + 1 + matchedCharacters) < n
					&& characters[i - matchedCharacters] == characters[i + 1 + matchedCharacters]) {
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
	
}
