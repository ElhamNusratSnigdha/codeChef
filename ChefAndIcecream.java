import java.util.Arrays;
import java.util.Scanner;
public class ChefAndIcecream {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        //number of phrases
        int t = e.nextInt();


        //Selling begins
        while(t>0){

            //number of coins
            int[] coin = new int[3];
            coin[0]=0; coin[1]=0; coin[2]=0;

            //number of people
            int n = e.nextInt();

            //coin from n people
            e.nextLine();
            String s = e.nextLine();
            String[] s1 = s.split(" ");

            boolean flag=false;
            int total=0;
            for (int i=0;i<s1.length;i++){
                int z = Integer.parseInt(s1[i]);
                if (z==5){
                    coin[0]++;
                }else if(z==10&&coin[0]>0){
                    coin[1]++;
                    flag=true;
                }else if(z==15&&coin[0]>0&&coin[1]>0){
                    coin[2]++;
                    flag = true;
                }
            }
            System.out.println((flag)? "YES":"No");
            t--;
        }
    }
}
