
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.math.*;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    

        
        
        //0 0 0이 입력될때 까지 입력받기
        while(true){
          StringTokenizer st = new StringTokenizer(br.readLine());

          int num1 = Integer.parseInt(st.nextToken());
          int num2 = Integer.parseInt(st.nextToken());
          int num3 = Integer.parseInt(st.nextToken());
          

          if(num1 == 0 && num2 == 0 && num3 == 0){
            break;
          }       
          if(num1*num1 == num2*num2 + num3*num3){
            bw.write("right");
            bw.newLine();
          }else if(num2*num2 == num1*num1 + num3*num3){
            bw.write("right");
            bw.newLine();
          }else if(num3*num3 == num2*num2 + num1*num1){
            bw.write("right");
            bw.newLine();
          }else{
            bw.write("wrong");
            bw.newLine();
          }
      }
      
      bw.flush();
      bw.close();
  }
}