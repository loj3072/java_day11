package edu.skku.util;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();//key�� value�� ��ü�̱� ������ Int�� �ƴ϶� Integer
		m.put(new Integer(10000), "����� �߱�"); // new Integer���� �ʾƵ� �⺻���� �ָ� ����ڽ����� �ڵ����� ��üȭ�� ��.
		m.put(10010, "����� ���빮��");
		m.put(10020, "����� ���α�");
		
		System.out.println(m.get(10010)); // key���� �Է��ϸ� value���� ����. �˻��ӵ� ���
		for(Integer key :m.keySet()) {//���� �� ��� �ʹٸ�. //���� ��ڽ̵� �����ϹǷ� Integer��� Int�ᵵ ��
			System.out.println(key+":"+m.get(key));//key������ �� key �� �´� value�����Ͱ��� ����
		}
		
	}

}
