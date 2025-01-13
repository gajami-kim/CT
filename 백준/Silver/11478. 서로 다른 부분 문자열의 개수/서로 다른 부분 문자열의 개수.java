import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String str = st.nextToken();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<str.length(); i++) {
            int start = 0;
            int end = i+1;
            while(end<=str.length()) {
                set.add(str.substring(start, end));
                start++;
                end++;
            }
        }

        bw.write(String.valueOf(set.size()));

        bw.flush();
        bw.close();
        
    }


}
