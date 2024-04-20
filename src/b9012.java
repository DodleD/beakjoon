import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bf.readLine());

        for(int i =0 ; i<t; i++){
            int result =0;
            int a = 0;
            int b = 0;
            String str = bf.readLine();
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(j)=='('){
                    result++;
                    a++;
                } else {
                    if (result!=0){
                        result--;
                    }
                    b++;
                }
            }
            if(result ==0 && a==b){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
