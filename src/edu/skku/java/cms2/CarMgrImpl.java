package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpl implements ICarMgr {
	List<Car> cars=new ArrayList<Car>();

	public void add(Car c) {
		cars.add(c); // �ε��� ���� �ʿ����!
	}

	public Car search(String num) { //�� num�� ���� ������ �ִ���
		for(Car c :cars) { //�ε��� ������ ���ϴ� �ڵ尡 ����ϳ�. 
			if(c.getNum().equals(num)) { //���ڿ��� �Ȱ����� Ȯ���� ���� equals
				return c;
			}
		}
		return null;
	}

	public List<Car> search() { //��� ������ ���
		return cars;
	}

	public void update(String num, int price) {
		Car c=search(num);//���� �ִ� search�� �̿��ؼ� �� ������ȣ�� ���� ������ �ּҰ��� c�� �����´�
		if(c!=null) {
			c.setPrice(price);
		}else {
			System.out.println("���� ��ȣ ����");
		}

	}

	public void delete(String num) {
		Car c=search(num);
		if(c!=null) {
			cars.remove(c); // �ε��� ������ ���ص� ��! Cars�� �˾Ƽ� ����� �����~~
		}else {
			System.out.println("���� ��ȣ ����");
		}

	}

}
