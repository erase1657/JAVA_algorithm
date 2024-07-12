import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count  = st.countTokens(); // 토큰의 갯수를 카운트
        String[] word = new String[count]; //카운트 한 수만큼의 배열 선언 
        int i = 0;
        
        //토큰이 존재하지 않을 때 까지
        //토큰을 배열에 하나씩 넣어가며 i(단어의 수)를 하나씩 증가
        while(st.hasMoreTokens()){
            word[i] = st.nextToken();
            i++;
        }
         
        System.out.println(i);
    }
}
    
