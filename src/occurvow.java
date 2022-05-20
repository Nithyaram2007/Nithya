import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;

public class occurvow {
	static Map<Character,Integer>occurance(String s)
	{
		Map<Character,Integer> m = new LinkedHashMap();
		char[]c=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(m.containsKey(c[i]))
			{
				Integer d=m.get(c[i]);
				m.put(c[i], d + 1);
				
			}else
			{
				m.put(c[i],1);
			}
			
		}return m;
	}
	public static void main(String[] args) {
		 Map<Character,Integer>occurance=occurance("javaApplication");
		 System.out.println(occurance);
	}
	

}
