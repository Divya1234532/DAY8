public class EvenLengthWords {
    static void Words(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            int length=0;
            if(s.charAt(i)!= ' ')
            {
                int start=i;
                while(i<s.length() && s.charAt(i)!=' ')
                {
                    i++;
                    length++;
                }
                if(length%2==0)
                {
                    System.out.print(s.substring(start,i)+" ");
                }
            }
            /*else
            {
                i++;
            }*/
        }
    }
    public static void main() {
        String s=" words   with  even  length  ";
        Words(s);
    }
}
