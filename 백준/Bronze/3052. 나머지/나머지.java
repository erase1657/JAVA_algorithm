
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] nums = new int[10];
        int[] remainder = new int[nums.length];
        
        
        for(int i=0;i<nums.length;i++){
          //10개의 입력 배열
          nums[i] = Integer.parseInt(br.readLine());
          //42로 나눈 나머지 배열
          remainder[i] = nums[i] % 42;
        }
        //배열의 중복 값 제거
        remainder = Arrays.stream(remainder).distinct().toArray();
        
        System.out.println(remainder.length);
        

        

        
    }
}