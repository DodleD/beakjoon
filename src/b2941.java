import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arrStr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String str = bf.readLine();

        for (String s : arrStr) {
            if (str.contains(s)) {
              str = str.replace(s, "a");
            }
        }
        System.out.println(str.length());
    }
}
