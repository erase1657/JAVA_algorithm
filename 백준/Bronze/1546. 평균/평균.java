import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

//1. 점수 중 최대값 M 고르기
//2. 모든 점수를 점수/M*100으로 고치기
//3. 고친 점수들의 평균 구하기

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

    
        //시험 본 과목 수 N 입력 받기
        int N = Integer.parseInt(br.readLine());


        //과목 점수 입력 받기
        float[] score = new float[N];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){

            score[i] = Float.valueOf(st.nextToken());
            
            if(100 < score[i] && score[i] < 0){

                break;
            
            }
            
        }

        //입력받은 값 중 최대값 찾기
        int M = 0;
        for(int  i= 0; i<N; i++){
            
            if(M < score[i]){

                M =(int)score[i]; 
           
            }
        }
        //모든 점수를 점수/M*100으로 고치기
        for(int i=0; i<N; i++){

            score[i] = (float)score[i]/M*100;
           

        }
        
        //평균 구하기
        float sum = 0;
        float average =0;
        for(int i=0; i<N; i++){

            sum +=(float)score[i];
        
        }
        average  = sum / N;
    
        bw.write(String.valueOf(average));


        bw.flush();
        bw.close();


        
    }
}