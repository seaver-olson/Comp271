public class week1 {
    public static void main(String[] args) {
        System.out.println(isLowerCase("abcde"));
    }
    /*
    input: String s
    Output: boolean result
        True: if all chars in String s are lowercase
        False: else
     */
    static boolean isLowerCase(String s) {
        boolean result = true;//result == true because if len == 0; then return true;
        for (int i = 0; i < s.length(); i++) {
            /*
            each letter has a different numeric code.  Lowercase letters have different
            numeric codes than the uppercase.
            The line below works as the < compares the numeric value of the letters
            so if the char is a lowercase letter between a and z however I think it needs to be
            result = result && ('a' <= s.charAt(i) && s.charAt(i) <= 'z');
             */
            result = result && ('a' <= s.charAt(i) && s.charAt(i) <= 'z');
        }
        return result;
    }
}
