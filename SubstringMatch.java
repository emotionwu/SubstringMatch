//暴力字符串匹配问题
public class SubstringMatch {

    private SubstringMatch(){}

    //在S中寻找t，并返回匹配的第一个索引i，如果没有找到，返回-1
    public  static int bruteforce(String s, String t){

        if(s.length()<t.length()) return -1;

        //s[i,i+t.length-1] ==t?
        for(int i=0;i<s.length()-t.length()+1;i++) {

            int j = 0;
            for (; j < t.length(); j++)
                //匹配
                if (s.charAt(i + j) != t.charAt(j))
                    break;

            if(j == t.length()) return i;
        }
        return -1;
    }

    public static void main(String[]args){

        String s1="hello,this is miss wu.";
        String t1="wu";
        System.out.println(SubstringMatch.bruteforce(s1,t1));
    }
}
