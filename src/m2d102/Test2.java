package m2d102;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * HashMap�ĵײ��ǹ�ϣ��/ɢ�б�����ݽṹ
 * ����ϣ����һ������͵�������Ľ���壬��������͵���������ŵ�
 * Ĭ�ϳ�ʼ��������������2�ı�������16��Ĭ�ϼ�������(�������ﵽ������75%���鿪ʼ����)��0.75
 * ��ϣ��/ɢ�б���һ��һά���飬�����ÿһ��Ԫ����һ������������ѯЧ��û�д�����ߣ������ɾЧ��û�е��������
 * 
 * map.put(k,v) 	ԭ��  1.��k,v��װ��Node������
 * 						  2.�ײ����k��hashCode()�����ó���ϣֵ����ͨ����ϣ�㷨ת���������±꣬�������ԣ�
 * 							    �����±괦������Ԫ�أ��������k������ÿһ��Node��k����equals��
 * 									�����Ϊfalse�����½ڵ�����������ĩβ
 * 									�����һ��Ϊtrue��������µ�v�滻����Node��v�������ظ��ԣ�
 * 
 * v=map.get(k) 	ԭ��  ����k��hashCode()�����ó���ϣֵ����ͨ����ϣ�㷨���ٶ�λ��ĳ�������±괦��
 * 							 ����λ����ʲô��û�У�����null
 * 							 ���е������������k������ÿһ��Node��k����equals
 * 								 �������equals����false����get��������null
 * 								 �����equals��������true�����Node��value���ձ�get��������
 * 
 * ��������HashMap����key���ֵ�Ԫ�غͷ���HashSet�����е�Ԫ�أ�hashCode()��equals()������Ҫ��д
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
