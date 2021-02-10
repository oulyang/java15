package m2d101;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Map�Լ�ֵ�ԣ�key��value���ķ�ʽ�洢���ݣ�key��value���������������ͣ����洢������ڴ��ַ��key����������
 *   ���÷���   void clear()   						 ���Map����
 *   			boolean containsKey(Object key)  	 �ж�Map���Ƿ����ĳ��key
 *   			boolean containsValue(Object value)  �ж�Map���Ƿ����ĳ��value
 *   			Value get (Object key) 				 ͨ��key��ȡvalue					
 *   			Set<Key> keySet()					 ��ȡMap�����е�key
 *   	        Value put(K key,V value) 			 ��Map����Ӽ�ֵ��
 * 			    boolean isEmpty()					 �ж�MapԪ�ظ����Ƿ�Ϊ��
 * 				int size()							 ��ȡMap�м�ֵ�Եĸ���
 * 				V remove(Object key)				 ͨ��keyɾ����ֵ��
 *  			Collection<V> values()				 ��ȡMap�����е�value
 *  			Set<Map.Entry<K,V>> entrySet()		 ��Map����ת����Set����
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
