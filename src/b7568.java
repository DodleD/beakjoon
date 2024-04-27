import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[2][n];
        int[] result = new int[n];

        for(int i =0 ; i < n ; i++){
            st = new StringTokenizer(bf.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
        }

        for(int i =0 ; i < n ; i++) {
           for(int j = 0 ; j < n ; j ++){
               if(i!=j){
                   if(arr[0][i] <arr[0][j] && arr[1][i] < arr[1][j]){
                       result[i]++;
                   }
               }
           }
            System.out.print((result[i]+1)+" ");
        }
    }
}
