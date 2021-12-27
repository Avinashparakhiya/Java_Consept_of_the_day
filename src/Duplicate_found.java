import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicate_found {
    public static void main(String[] args) {
        String result = "";
        System.out.println("Please Enter The Word");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[]ch=a.toCharArray();
        Map<Character,Integer>map=new HashMap<>();
        for (int i=0;i<ch.length;i++)
        {
            map.put(ch[i], map.getOrDefault(ch[i],0)+1);
        }
        for (Map.Entry<Character,Integer>entry:map.entrySet())
        {
            if (entry.getValue()==1)
            {
                result=result+entry.getKey();
            }
        }
        System.out.println(result);
    }
}
