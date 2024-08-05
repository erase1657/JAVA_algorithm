import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        
        while(true){
            String num = br.readLine();
           
            if(num.charAt(0) == '0'){
                break;
            }
            
            //0을 입력받는 다면 종료
            if(num.equals("0")){
                break;
            }
                 
            int correct = 1;
          
          
            //숫자의 길이를 2로 나누고 양 끝에서부터 비교
            for(int i=0; i<num.length()/2; i++){
                
                //한자리 숫자라면 펠린드롬수
                if(num.length() == 0 && num != "0"){
                    correct = 1;
                    break;
                }


                if(num.charAt(i) == num.charAt(num.length()-1-i)){
                    correct = 1;
                }
                else{
                    correct = 0;
                    break;
                }

            }


            //팰린드롬수가 맞다면 yes 아니라면 no
            if(correct == 1){
                bw.write("yes");
                bw.newLine();
            }else{
                bw.write("no");
                bw.newLine();
            }
            
        }

        bw.flush();
        bw.close();

    }
}