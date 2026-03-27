/*public class SecondMostFrequency {

    static char SecondMostFrequent(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0, secmax = -1, secmaxidx = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                secmax = max;
                max = freq[i];
            }
        }

        if (max != 0) {
            secmaxidx = ;
        }

        return (char) (secmaxidx + 'a');
    }

    public static void main(String[] args) {
        String str = "aabbbc";
        System.out.println(SecondMostFrequent(str));
    }
}*/
public class SecondMostFrequency {

    static char SecondMostFrequency(String s) {
        int[] freq = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        int max = 0, secmax = 0;
        int maxIdx = -1, secIdx = -1;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                secmax = max;
                secIdx = maxIdx;

                max = freq[i];
                maxIdx = i;
            } else if (freq[i] > secmax && freq[i] != max) {
                secmax = freq[i];
                secIdx = i;
            }
        }

        return (char) (secIdx + 'a');
    }

    public static void main(String[] args) {
        String str = "aabbbc";
        System.out.println(SecondMostFrequency(str));
    }
}
