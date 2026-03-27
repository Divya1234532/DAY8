/*public class ShorestWord {

    static int min = Integer.MAX_VALUE;
    static int start = 0, end = 0;

    static String shortestWord(String s, int st, int ed) {
        char[] str = new char[(ed - st) + 1];
        for (int i = 0; i < (ed - st) + 1; i++) {
            str[i] = s.charAt(i);
        }
        return new String(str);
    }

    static void WordsAndItsLength(String s) {
        for (int i = 0; i < s.length(); i++) {
            int length = 0;

            if (s.charAt(i) != ' ') {
                int st = i;

                while (i < s.length() && s.charAt(i) != ' ') {
                    i++;
                    length++;
                }

                int ed = i;

                FindMinLength(st, ed, length, s);
            }
        }
    }

    static void FindMinLength(int st, int ed, int len, String s) {
        if (min > len) {
            start = st;
            end = ed;
            min = len;
        }
        shortestWord(s, start, end);
    }

    public static void main(String[] args) {
        String s = "I like Java programming";
        WordsAndItsLength(s);
    }
}*/
public class ShorestWord {

    static int min = Integer.MAX_VALUE;
    static int start = 0, end = 0;

    static String shortestWord(String s, int st, int ed) {
        char[] str = new char[(ed - st) + 1];
        for (int i = 0; i < (ed - st) + 1; i++) {
            str[i] = s.charAt(st + i); // FIXED
        }
        return new String(str);
    }

    static void WordsAndItsLength(String s) {
        for (int i = 0; i < s.length(); i++) {
            int length = 0;

            if (s.charAt(i) != ' ') {
                int st = i;

                while (i < s.length() && s.charAt(i) != ' ') {
                    i++;
                    length++;
                }

                int ed = i - 1; // FIXED

                FindMinLength(st, ed, length, s);
            }
        }
    }

    static void FindMinLength(int st, int ed, int len, String s) {
        if (min > len) {
            start = st;
            end = ed;
            min = len;
        }
    }

    public static void main(String[] args) {
        String s = "I like Java programming";
        WordsAndItsLength(s);

        System.out.println(shortestWord(s, start, end)); // FIXED
    }
}
