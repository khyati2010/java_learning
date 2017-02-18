package pratise.test;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class CountChar 
{

    public static void main(String[] args) throws IOException
    {
      String ch;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the Statement:");
      ch=br.readLine();
      int count=0,len=0;
        do
        {  
          try
          {
          char name[]=ch.toCharArray();
              len=name.length;
              count=0;
              for(int j=0;j<len;j++)
               {
                  if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91)||(name[0]>=97&&name[0]<=123))) 
                      count++;
               }
              if(count!=0)
                System.out.println(name[0]+" "+count+" Times");
              ch=ch.replace(""+name[0],"");          
          }
          catch(Exception ex){}
        }
        while(len!=1);
   }

    void test(){
    	   String ch;
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	for (int i = 0; i < s.length(); i++) {
    	  char c = s.charAt(i);
    	  if (map.containsKey(c)) {
    	    int cnt = map.get(c);
    	    map.put(c, ++cnt);
    	  } else {
    	    map.put(c, 1);
    	  }
    	}
    }
}