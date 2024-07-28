import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] size = new int[6];
        int i =0;

        //사이즈별 티셔츠 수 받기
        while(st.hasMoreTokens()){
            size[i] = Integer.parseInt(st.nextToken());
            i++;
        }



        st = new StringTokenizer(br.readLine());
        //T,P값 받기
        int T = Integer.parseInt(st.nextToken()); 
        int P = Integer.parseInt(st.nextToken());

        int count=0;
        for(int j=0;j<size.length;j++){
            if(size[j] != 0){//티셔츠 신청 수량이 없다면 패스
                
                if(size[j]/T < 1){// 주문한 티셔츠 수가 T장 보다 적을때
                    count++;
                }
                else if(size[j]%T == 0){//주문한 티셔츠 수가 T장의 배수 일때
                    count += size[j]/T; 
                }
                else{//주문한 티셔츠 수가 T장 으로 나눌때 몫이 1이상이고 나머지가 있을때
                    count += size[j]/T+1;
                }

            }
           
            
        }
        bw.write(String.valueOf(count));
        bw.newLine();
        bw.write(String.valueOf(N/P)+" ");//펜의 묶음 수
        bw.write(String.valueOf(N%P));//나머지 사야하는 펜의 수

        bw.flush();
        bw.close();

    }
}