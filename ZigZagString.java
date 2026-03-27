/*public class ZigZagString {

    static String ZigZagPattern(String s) {
        int n = s.length();
        String str = new String();
        char[] arr = new char[n];

        int i = 0, j = 0, idx = 0;

        while (i < 3) {
            while (j < n) {

                if (i == 0 || i == 2) {
                    int k = 0;
                    str = str + arr[k];
                    k += 3;
                }

                if (i == 1) {
                    int k = 0;
                    str = str + arr[k];
                    k += 1;
                }

                j++;
            }
            i++;
        }

        return str;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(ZigZagPattern(s));
    }
}*/
public class ZigZagString {

    static String ZigZagPattern(String s) {
        int n = s.length();

        String[] rows = new String[3];
        for (int i = 0; i < 3; i++) rows[i] = "";

        int row = 0;
        boolean down = true;

        for (int i = 0; i < n; i++) {
            rows[row] += s.charAt(i);

            if (row == 0) down = true;
            else if (row == 2) down = false;

            if (down) row++;
            else row--;
        }

        return rows[0] + rows[1] + rows[2];
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(ZigZagPattern(s));
    }
}
