static String WavePattern(String s)
{
    int n=s.length();
    char[] arr=new char[n];
    int idx=0;
    for(int i=0;i<n;i++)
    {
        if(i%2==0)
        {
            arr[idx++] = s.charAt(i);
        }
    }
    for(int i=0;i<n;i++)
    {
        if(i%2!=0)
        {
            arr[idx++] = s.charAt(i);
        }
    }
    return new String(arr);

}
public class WavePattern {
    public static void main(String[] args) {
        String s="VIRATKOHLI";
        System.out.println(WavePattern(s));
    }
}

void main() {
    String s="VIRATKOHLI";
    System.out.println(WavePattern(s));
}

