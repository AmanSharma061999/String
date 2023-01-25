public class reverseWord {
    public static void main(String args[])
    {
        String S="This is the Best Journey ";
        char[] p= reverseAll(S.toCharArray());

        System.out.print(p);
    }

    static char[] reverseAll(char[] s)
    {
        int start=0;
        for(int end=0;end<s.length;end++)
        {
            if(s[end] == ' ')
            {
                reverse(s,start,end);
                start=end+1;
            }
        }

        reverse(s,start,s.length-1);

        reverse(s,0,s.length-1);

        return s;
    }

    static void reverse(char[] str,int start,int end)
    {
        char temp;

        while(start <= end)
        {
            temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }
    
}
