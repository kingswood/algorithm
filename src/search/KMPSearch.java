package search;

public class KMPSearch {

	public static int[] getNext(char[] key) {
		int length = key.length;
		int[] a = new int[length];
		int i, j;
		a[0] = -1;
		i = 0;
		for (j = 1; j < length; j++) {
			i = a[j - 1];
			while (i >= 0 && key[j] != key[i + 1]) {
				i = a[i];
			}
			if (key[j] == key[i + 1]) {
				a[j] = i + 1;
			} else {
				a[j] = -1;
			}
		}
		return a;

	}
	
	public static int matchString(char[] s, char[] t) {
        int[] next = getNext(t);
        int i = 0;
        int j = 0;
        while (i <= s.length - 1 && j <= t.length - 1) {
            if (j == -1 || s[i] == t[j]) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }
        if (j < t.length) {
            return -1;
        } else
            return i - t.length;
    }

	public static void main(String[] args) {

		String a = "abcab";
		String b = "adfkedabcababcad";
		
		int index = matchString(b.toCharArray(), a.toCharArray());
		
		System.out.println(index);
		//int[] next = getNext(a.toCharArray());
		
		
		
		/*for(int i = 0;i<next.length;i++){
			System.out.print(next[i]);
		}*/
		

	}

}
