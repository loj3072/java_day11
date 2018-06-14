package edu.skku.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.skku.java.cms.Car;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); //�� ���� ��� ����. ���� ������ �� ��. �Ȱ��� �����ʹ� �����Ѵ�.
		//���� ��� ���� �ߴ� ����: ���� Ÿ�Ե��� ���� ���� ���� ����. �ϳ��� Ÿ�Ը� ����. Ÿ���� ��Ȯ�ϰ� �϶�� �ǹ�.
		//Set<String> s = new HashSet<>(); //�ڹ� 7.0���ʹ� �ڿ� Ÿ���� ������ �� �ִ�. ����� �Ȱܵ־� ��.
		s.add("abc");
		//s.add(new Car().toString());
		s.add("seoul");
		s.add("busan");
		s.add("busan");
		//object�� ����ϱ� ������ �ƹ��ų� ��Ƶ� ��
		s.add(new Integer(30).toString());
		s.add(30+"");//�̷��� �ص� ���ڿ���!
		//s.iterator() iterator�� ���ϰ� ������ ���� ���� for��
		//s.toArray(a)// Set�� �ִ� �����͸� Array�� �ٲ㼭 ���
		//s.forEach(action); // ���� ó��
		//s.parallelStream() //���� ó��
		s.remove("abc"); //index�� ������ ��ü�� ��Ȯ�� ��Ÿ���� ��.
		
		//for(int i=0; i<s.size(); i++) ������ ���⿡ �ε����� �ϳ��� �̾ƿ��� �� for���� �� �� ����
		for(Object ob :s) { //�ڵ����� String�� �Ǿ ���´�.
			System.out.println(ob);//ob.toString()
		}
		//Set: ���� ����, �ߺ� ���� �����͸� �����ϴ� ����.
		
		Set<String> ss=new TreeSet<>(); //���ĺ� ������ �����Ǿ ����
		s.add("abc");
		s.add("seoul");
		s.add("busan");
		s.add("busan");
		s.add(30+"");
		for(Object ob :s) { 
			System.out.println(ob);
		}
	}

}
