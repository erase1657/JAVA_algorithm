import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력받을 수의 개수 N
        int N = Integer.parseInt(br.readLine());
        
        
        //입력 받은 수들을 ArrayList에 삽입 
        ArrayList<Integer> nums = new ArrayList<>();
        int input;
        for(int i=0; i<N; i++){
            
            input = Integer.parseInt(br.readLine());
            nums.add(input);

        }

        //sort를 사용해서 수 정렬
        Collections.sort(nums);
        
        
        //한줄씩 출력버퍼에 삽입
        int i=0;
        while(true){    
            bw.write(String.valueOf(nums.get(i)));
            bw.newLine();
            i++;

            if(i==N){
                break;
            }
        }


        //출력
        bw.flush();
        bw.close();
        
    }
}
