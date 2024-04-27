import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        int n = Integer.parseInt(bf.readLine());

        for(int i =1 ; i<=n ; i++){
                q.add(i);
        }

        while(q.size()!=1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.peek());

    }
}