import java.util.*;
/*
AACTGTGCACGACCTGA
5

GCACG
DNA序列
 */
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
            String s=in.nextLine();
            int len=in.nextInt();
            int sz=s.length();
            int count=0;
            int max=0;
            int j=0;
            String result="";
            for(int i=0;i<=sz-len;i++){
                count=0;
                for(j=i;j<i+len;j++){
                    if (s.charAt(j) == 'G' || s.charAt(j) == 'C') {
                        count++;
                    }
                }
                if(max==0){
                    max=count;
                    result=s.substring(j-len,j);
                }else{
                    if(max<count){
                        max=count;
                        result=s.substring(j-len,j);
                    }
                }
            }
            System.out.println(result);
    }

}