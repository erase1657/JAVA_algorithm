import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        int a = Integer.parseInt(strs[0]);
        int b = Integer.parseInt(strs[1]);
        System.out.println(a-b);
    }
}