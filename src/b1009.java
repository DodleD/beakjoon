import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;

        int a, b, result=0;
        int testCase = Integer.parseInt(bf.readLine()); //반복횟수

        for(int i =0 ; i<testCase ; i++){
            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            result = a;
            b = b % 4 +4;

            for(int j=2 ; j<=b; j++){
                result = (result*a) % 10;
            }
            if(result ==0){
                result =10;
            }
            System.out.println(result);

        }

    }
}
