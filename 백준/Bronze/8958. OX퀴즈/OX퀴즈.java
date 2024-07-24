
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.InputStreamReader;



public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //팩토리얼 함수 만들자

        //테스트 케이스 입력 받기
        int Case = Integer.parseInt(br.readLine());
        String[] word  = new String[Case]; 
        int score = 0;


        
        for(int i=0;i<Case;i++){
          //테스트 케이스 횟수 만큼 OX문장 입력 받기
          word[i] = br.readLine();
           
          //각 문장을 X기준으로 나누기
          String[] s = word[i].split("X+");

          //나눠진 문장 스코어 구하기
          for(int j=0;j<s.length;j++){
            if(s[j] == "O"){//O가 하나라면 +1
              score++;
            }else{//O가 여러개라면 O의 길이만큼 하나씩 증가하며 더 함
              for(int k =0;k<=s[j].length();k++){
                score += k;
              }
            }
          }  
          //총 스코어 점수 저장  
          bw.write(String.valueOf(score));
          bw.newLine();
          
          //다음 테스트 케이스를 위해 다시 0으로 저장
          score = 0; 
        }
        //총 스코어 점수 출력
        bw.flush();
        bw.close();   
  }
}