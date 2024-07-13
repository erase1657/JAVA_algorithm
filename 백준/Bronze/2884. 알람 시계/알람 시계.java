import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //M에 따라서 바뀔 H를 계산할 변수
        int alram_Minute= 0; 

        
        if(M>=45){//M이 45이상일땐 M-45를 해도 H가 변하지 않음
            alram_Minute = M - 45;
            bw.write(String.valueOf(H)+" ");
            bw.write(String.valueOf(alram_Minute));

        }else{//M이 45 이하일땐 입력 M에따라서 H가 1 줄어듦 
            alram_Minute = M + 15;
            H--;
            
            //만약 줄어든 H가 음수(전날)이 되면 
            //전 날 H로 바꿔줌

            if(H<0){
                H += 24;
            }
        

            bw.write(String.valueOf(H)+" ");
            bw.write(String.valueOf(alram_Minute));
        }
        

        bw.flush();
        bw.close();

        
    }
}
    
