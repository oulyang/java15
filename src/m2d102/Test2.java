package m2d102;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * HashMap的底层是哈希表/散列表的数据结构
 * 而哈希表是一个数组和单向链表的结合体，具有数组和单向链表的优点
 * 默认初始化容量（必须是2的倍数）是16，默认加载因子(当数量达到容量的75%数组开始扩容)是0.75
 * 哈希表/散列表是一个一维数组，数组的每一个元素是一个单向链表，查询效率没有纯数组高，随机增删效率没有单向链表高
 * 
 * map.put(k,v) 	原理  1.将k,v封装到Node对象中
 * 						  2.底层调用k的hashCode()方法得出哈希值，再通过哈希算法转化成数组下标，（无序性）
 * 							    若该下标处有链表（元素），则会用k与链表每一个Node的k进行equals，
 * 									如果都为false，则新节点会添加在链表末尾
 * 									如果有一个为true，则会用新的v替换掉该Node的v（不可重复性）
 * 
 * v=map.get(k) 	原理  调用k的hashCode()方法得出哈希值，再通过哈希算法快速定位到某个数组下标处，
 * 							 若该位置上什么都没有，返回null
 * 							 若有单向链表，则会用k与链表每一个Node的k进行equals
 * 								 如果所有equals返回false，则get方法返回null
 * 								 如果有equals方法返回true，则该Node的value最终被get方法返回
 * 
 * 【】放在HashMap集合key部分的元素和放在HashSet集合中的元素，hashCode()和equals()方法需要重写
 * @author yyds
 *
 */
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Map<Integer,String> map=new HashMap<>();
		map.put(11, "123");
		map.put(12, "wang");
		map.put(13, "li");
		map.put(11, "zhang");
		System.out.println(map.size());
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		for(Map.Entry<Integer,String> s:set) {
			System.out.println(s.getKey()+"="+s.getValue());
		}
		*/
		User u1=new User("li");
		User u2=new User("li");
		System.out.println(u1.equals(u2));
		
		Set<User> users=new HashSet<>();
		users.add(u2);
		users.add(u1);
		System.out.println(users.size());
		
	}

}
