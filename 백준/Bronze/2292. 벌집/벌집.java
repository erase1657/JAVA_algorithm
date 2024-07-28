import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //처음은 방 1이 주어졌을때
        //1 주변의 방 갯수는 6개(2~7) 
        //그 다음 주변의 방은 12개(8~19)
        //그 다음 주변의 방은 18개(20~37) 
        //6의 배수로 주변의 방의 수가 증가


        int room = 1;
        int N = Integer.parseInt(br.readLine());
        int i = 1;
        
        while(true){
    
            room += (6*i); //6의 배수로 주변 방 증가
            
            //입력 방번호가 1이라면 1출력
            if(N == 1){
                bw.write(String.valueOf(1));
                break;
            }
            //만약 입력된 방번호가 방의수보다 작거나 같다면
            //현재까지 증가한 i(배)의 값을 출력
            //+1은 초기 방 1을 추가해야하므로 작성함 
            if(room >= N){
                bw.write(String.valueOf(i+1));
                break;
            }
         
            i++;
        }
        bw.flush();
        bw.close();
        

    }
}