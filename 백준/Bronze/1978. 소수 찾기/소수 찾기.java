import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int num;
        int count=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //입력 받은 수 만큼의 수 받기
        for(int i=0;i<N;i++){
           num = Integer.parseInt(st.nextToken());
           //자신의 수보다 작거나 같은 범위에서연산
           for(int j=2;j<=num;j++){
            //약수가 자신 밖에 없다면 count증가
            if(j == num){
                count++;
            }

            //중간에 자신보다 작은 약수 가 있다면(1제외) 반복문 탈출     
            if(num%j == 0){
                break;
            }
          }
        }

        bw.write(String.valueOf(count));

        bw.flush();
        bw.close();
    }
}