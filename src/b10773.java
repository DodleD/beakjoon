import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class b10773 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> s = new Stack<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int result = 0;
        for(int i = 0; i < n ; i++){
            int a = Integer.parseInt(bf.readLine());
            if(a!=0){
                s.push(a);
                result +=s.peek();
            } else{
                result -=s.peek();
                s.pop();

            }
        }
        System.out.println(result+"");
    }
}
