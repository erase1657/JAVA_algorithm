import java.io.*;
import java.util.StringTokenizer;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()); 
        
        int num[] = new int[2];
        int i = 0;
        
        while(st.hasMoreTokens()){
            num[i] = Integer.parseInt(st.nextToken());
            i++;
        }        
        
        System.out.println((double)num[0]/num[1]);
    }
}