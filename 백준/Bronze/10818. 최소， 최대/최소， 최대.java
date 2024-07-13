import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //입력 받을 수의 개수 만큼 N을 입력받기(N의 크기를 가진 배열 생성)
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        int i = 0;
       
        //한줄에 최대 최소를 구할 수 입력하기(배열 원소 입력)
        st = new StringTokenizer(br.readLine());
        
        while(st.hasMoreTokens()){
            nums[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        //최대 최소를 구할 변수 선언
        int max = nums[0];
        int min = nums[0]; 

        //첫번째 값부터 다음 원소를 하나씩 비교하며
        //비교대상이 크거나 작다면 최대 최소를 다시 초기화 
        for(int j=0;j<N;j++){   
            if(nums[j]>max){//최대
                max = nums[j];
            }
            if(nums[j]<min){//최소
                min = nums[j];
            }
        }

        //버퍼에 출력할 '문자'를 넣음(int형일 경우 다른게 출력 됨)
        bw.write(String.valueOf(min));
        bw.newLine();
        bw.write(String.valueOf(max));

        bw.flush();//버퍼에 남은 내용을 모두 출력
        bw.close();//버퍼 종료

    }
}
    
