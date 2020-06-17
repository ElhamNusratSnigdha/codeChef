import java.io.*;
import java.util.*;
public class LifeTheUniverseAndEverything {
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        try{
            int a;
            while(true){
                a = s.nextInt();
                if(a==42){
                    break;
                }
                System.out.println(a);
            }
        }catch(Exception e){
            return;
        }
        s.close();
    }
}
