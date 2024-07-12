import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
       int[] num = new int[9];

       //한줄에 하나씩 배열 원소 넣기
       for(int i=0;i<9;i++){
            num[i] =  Integer.parseInt(br.readLine());
       }

       //배열을 첫번째 원소부터 하나씩 순회하기
       //선택 한 원소를 다음 원소를 하나씩 비교하며,
       //만약 선택한 원소보다 큰 값이 있다면 선택한 원소를 0으로 설정
       //결
       for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length;j++){
                if(num[i]<num[j]){
                    num[i]=0;
                }
            }
       }
       
       /*
       최대값만 남은 원소의 상태 확인 
       for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
       } 
        */
       
       
       for(int i=0;i<num.length;i++){
            if(num[i]!=0){
                System.out.println(num[i]);
                System.out.println(i+1);//배열은 0부터 시작하기에 
                                        //최대값의 원소 번호를 1추가해줌
            }
       }
    }
}
