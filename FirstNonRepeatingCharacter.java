
public class FirstNonRepeatingCharacter {
    static void main() {
        String s="gjkjknh";
        int idx=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
}
