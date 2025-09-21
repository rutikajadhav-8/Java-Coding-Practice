package Questions;


import static java.util.Collections.reverse;

public class Q13_ReverseWords {
    public static String reverseWord(String str){
        int n = str.length();
        StringBuilder ans = new StringBuilder();

        // reverse string
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        for(int i =0; i<n; i++){
            StringBuilder word =new StringBuilder();
            while(i<n && sb.charAt(i) != ' '){
                word.append(sb.charAt(i));
                i++;
            }

            //reverse the word
            word.reverse();

            //add each word into ans
            if(word.length() > 0){
                if(ans.length() >0){
                    ans.append(" ");

                }
                ans.append(word);
            }
        }


       return  ans.toString();
    }
    public static void main(String []args){
        String str = "The Sky is Blue";
        System.out.println(reverseWord(str));
    }
}
