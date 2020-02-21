import java.util.HashMap;
import java.util.Map;

public class PRACTICE {
	public static void main(String[] args) {
Map<String,Integer> map=new HashMap<String,Integer>();
map.put("pallavi",1);
map.put("hi", 2);
map.put("rajan",3);
map.remove("hi");
System.out.println(map);
System.out.println(map.values());
for(Integer val:map.values())
{
	System.out.println("rank"+val);
}
for(String name:map.keySet())
{
	System.out.println("name:"+name);
}
	}
}
