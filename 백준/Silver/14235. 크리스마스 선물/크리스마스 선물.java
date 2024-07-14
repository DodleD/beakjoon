import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i < n ; i++) {
			st = new StringTokenizer(bf.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			
			if(a==0 && pQ.isEmpty()) {
				System.out.println(-1);
			}else if(a==0 && !pQ.isEmpty()) {
				System.out.println(pQ.poll());
			}else {
				while(st.hasMoreElements()) {
					pQ.add(Integer.parseInt(st.nextToken()));
				}
			}
		}
	}
}
