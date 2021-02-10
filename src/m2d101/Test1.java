package m2d101;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map以键值对（key和value）的方式存储数据，key和value都是引用数据类型，都存储对象的内存地址，key起主导作用
 *   常用方法   void clear()   						 清空Map集合
 *   			boolean containsKey(Object key)  	 判断Map中是否包含某个key
 *   			boolean containsValue(Object value)  判断Map中是否包含某个value
 *   			Value get (Object key) 				 通过key获取value					
 *   			Set<Key> keySet()					 获取Map中所有的key
 *   	        Value put(K key,V value) 			 向Map中添加键值对
 * 			    boolean isEmpty()					 判断Map元素个数是否为空
 * 				int size()							 获取Map中键值对的个数
 * 				V remove(Object key)				 通过key删除键值对
 *  			Collection<V> values()				 获取Map中所有的value
 *  			Set<Map.Entry<K,V>> entrySet()		 将Map集合转换成Set集合
 * @author yyds
 *
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "zhang");
		m.put(2, "wang");
		m.put(3, "li");
		
		
		String s1=m.get(2);
		System.out.println(s1);
		System.out.println(m.size());
		
		m.remove(1);
		System.out.println(m.size());
		
		System.out.println(m.containsValue("li"));
		System.out.println(m.containsKey(3));
		
		Collection<String> c=m.values();
		for(String s:c) {
			System.out.println(s);
		}
		
		m.clear();
		System.out.println(m.size());
		
		
		
	}

}
