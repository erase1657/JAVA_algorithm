
import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int[] num = new int[2];
       int i=0;


       while(st.hasMoreTokens()){
        num[i] = Integer.parseInt(st.nextToken());
        i++;
       }

       
       if(num[0] == num[1]){

        System.out.println("==");
    
        }
       else if(num[0] > num[1]){

        System.out.println(">");

       }else{

        System.out.println("<");

       }
       
    }
}