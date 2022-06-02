package lecture_08;

public class leetcode {
    public static void main(String[] args) {
        
    }

    // https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            
            String[] str = s.split(" ");
            
            ans = Math.max(ans, str.length);
        }
        return ans;
    }

    // https://leetcode.com/problems/remove-vowels-from-a-string/
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)) == false) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public boolean isVowel(char c) {
        if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            return true;
        else
            return false;

        // return ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' );
    }

    // https://leetcode.com/problems/defanging-an-ip-address/
    public String defangIPaddr(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    // https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
    public int finalValueAfterOperations(String[] arr) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            if ( s.charAt(1) == '+' ) {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
