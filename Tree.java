import java.util.*;
import java.util.Map;
public class Tree{
public static void main(String[] args)
{
	NavigableMap<Integer,String> map = new TreeMap<Integer,String>();
	map.put(101,"Argha");
	map.put(105,"Roy");
	map.put(103,"Mango");
	map.put(102,"Apple");
map.put(104,"Orange");
	System.out.println(map);
	System.out.println(map.descendingMap());
	System.out.println(map.headMap(102,true));
	System.out.println(map.tailMap(103,true));
System.out.println(map.tailMap(103,false));
}
}
