import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> t = new LinkedList<Integer>();
		
		st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		
		int result = 0;
		int bw =0;
		
		for(int i = 0; i < n ; i++) {
			t.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int i =0; i < w ; i++) {
			q.add(0);
		}
		
		while(!q.isEmpty()) {
			result++;
			bw-=q.remove();
			if(!t.isEmpty()) {
				if(t.peek()+bw<=l) {
					bw+=t.peek();
					q.add(t.remove());
				}else {
					q.add(0);
				}
			}			
		}
		System.out.println(result);
	}

}
