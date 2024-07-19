
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        int i = 0;
        int count_A = 0;
        int count_D = 0;

        while (st.hasMoreTokens()) {
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }


        for(int j=0; j<=7; j++){
          if(arr[j] == j+1){
            count_A++;
          }
        }
        
        for(int j=0; j<=7; j++){
            if(arr[j] == 8-j){
              count_D++;
            }
          }

        if(count_A == 8){
            bw.write("ascending");
        }else if(count_D == 8){
            bw.write("descending");
        }else{
            bw.write("mixed");
        }

        bw.flush();
        bw.close();

    }
}