import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int count  = st.countTokens();
        String[] word = new String[count];
        int i = 0;
        
        while(st.hasMoreTokens()){
            word[i] = st.nextToken();
            i++;
        }
        
        System.out.println(i);
    }
}
    
