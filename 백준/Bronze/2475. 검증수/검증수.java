import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st  = new StringTokenizer(br.readLine());

        double[] num = new double[5];
        int i=0;
        double a = 0;

        while(st.hasMoreTokens()){
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        for(i=0; i<num.length;i++){
            a += Math.pow(num[i],2);
        }

        int b = (int)a%10 ;
        
        System.out.println(b);
    }
}
