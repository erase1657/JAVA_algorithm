import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 번째 입력 값 N을 정수로 변환
        int N = Integer.parseInt(br.readLine());

        // ArrayList 객체 생성
        ArrayList<String> word = new ArrayList<>();

        // N번 반복하며 입력된 문자열을 ArrayList에 추가
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (!word.contains(input)) {
                word.add(input);  // ArrayList에 문자열 추가 (중복 제거)
            }
        }

        // 문자열을 사전순으로 정렬
        Collections.sort(word);

        // 문자열 길이에 따라 정렬
        Collections.sort(word, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                if (lengthCompare != 0) {
                    return lengthCompare;
                } else {
                    return s1.compareTo(s2);
                }
            }
        });

        // 정렬된 단어들 출력
        for (String w : word) {
            bw.write(w);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
