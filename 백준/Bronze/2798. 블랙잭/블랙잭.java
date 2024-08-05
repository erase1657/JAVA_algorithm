import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //카드의 장 수 N 입력받기
        int N = Integer.parseInt(st.nextToken());
        
        //목표 값 M 입력받기
        int M = Integer.parseInt(st.nextToken());
        
        
        //N 만큼 주어진 수 입력받기
        st = new StringTokenizer(br.readLine());
        int[] num  = new int[N];
        int i=0;
        while(st.hasMoreTokens()){
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        
        //카드를 한장씩 탐색
        int sum = 0;
        int result = 0;
        //총 3개의 카드를 고르므로  첫번 째 한장을 고를 때 다음,다다음 카드는
        //다음 반복에서 알아서 탐색하므로 N-2
        for(int j=0; j<N-2;j++){ 
            for(int k=j+1; k<N-1; k++){
                for(int l=k+1; l<N; l++){
                    sum = num[j] + num[k] + num[l];
                    
                    
                    if(sum == M){
                        result = M;
                        break;
                    }
                    if(result<sum && sum<M){
                        result = sum;
                    }
                }
            }
            
        }
        
        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();

    }
}