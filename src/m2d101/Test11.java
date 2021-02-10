package m2d101;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "zhang");
		m.put(2, "wang");
		m.put(3, "li");
		//遍历Map  第一种
		Set<Integer> s=m.keySet();//获取所有的key
		Iterator<Integer> it=s.iterator();
		while(it.hasNext()) {
			Integer key=it.next();//获得一个key
			String str=m.get(key);//获得key对应的value
			System.out.println(key+"="+str);	
		}
		
		for(Integer key:s) {
			System.out.println(key+"="+m.get(key));
		}
		
		//遍历Map 第二种
		Set<Map.Entry<Integer, String>> sets=m.entrySet();
		Iterator<Map.Entry<Integer, String>> ite=sets.iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> node=ite.next();
			Integer in=node.getKey();
			String st=node.getValue();
			System.out.println(in+"="+st);
		}
	}

}
