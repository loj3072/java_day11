package edu.skku.util;

import java.util.ArrayList;
import java.util.List;

import edu.skku.java.cms.Bus;
import edu.skku.java.cms.Car;
import edu.skku.java.cms.Truck;

public class ListTest {

	public static void main(String[] args) {
		List<Car> c=new ArrayList<Car>(); //����Ÿ���� �´ٸ�
		c.add(new Car("11��1111",5000));
		c.add(new Bus("34ȣ2342",8000,45)); //����Ŭ����
		c.add(new Bus("63ȣ2342",8000,45)); //�ƹ��ų�

		c.add(new Truck("64��2782",8700,3)); //����
		c.add(new Truck("94��2782",8700,1.5)); //��
		c.add(new Truck("27��2782",8700,3)); //�ִ�
		
		for(Car cc: c) {
			System.out.println(cc);//cc.toString�� �θ� ��.
		}
		System.out.println("======Bus List======");
		int sum=0;
		for(Car cc: c) {
			if(cc instanceof Bus) { //������ ���
				System.out.println(cc);
				//sum=sum+cc.getSeat(); //����Ÿ�Կ��� ����Ŭ���� �ٷ� ���� �� ����
				Bus b = (Bus)cc;
				sum=sum+b.getSeat();
			}
		}
		System.out.println("������ �� �¼���:"+sum);
		
		System.out.println(c.remove(0));//������ ���� ���Ͻ�����
		System.out.println(c.get(0));//�������� �����鼭 ����
		c.remove(0);
		
	}

}
