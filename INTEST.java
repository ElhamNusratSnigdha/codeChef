import java.io.*;
import java.util.*;

public class INTEST {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        try{
            int n = in.nextInt();
            int k = in.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                int x = in.nextInt();

                if (x % k == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }catch(Exception e){
            return;
        }
    }
}
