import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //분해합 N이 주어질때 생성자 M을 구하라.
        
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        
       
        for(int M=1; M<N; M++){
            
            int sum = M;
            int temp = M;

            //M의 각자리 수를 분해하여 더한다.
            while(temp >0){
                
                sum += temp % 10; 
                temp /= 10;
            }
            //생성자 발견
            if(sum == N){

               result = M;
               break;
            }
        }
        //결과 값이 N과 같다면 그때의 M값이 생성자다
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}