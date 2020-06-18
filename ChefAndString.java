import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class ChefAndString {
    public static void main(String[] args)throws IOException {

        Scanner s = new Scanner(System.in);
        try{
            int T = s.nextInt();
            s.nextLine();

            while (T>0){
                int n = 0;
                int boy=0;
                int girl = 0;

                String st = s.nextLine();
                String[] sa = st.split("");
                for (int i=0;i<sa.length;i++){
                    if(sa[i].equals("x")){
                        boy++;
                    }else girl++;
                }
                if(sa.length/2==girl){
                    n=n+girl;
                }
                System.out.println(n);
                T--;
            }
        }
        catch (Exception e){
            return;
        }
        s.close();
    }
}
