package edu.skku.java.cms2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ICarMgr mgr=new CarMgrImpl(); // �������̽��� new�ȵ�! ���۷� ������ �� ����
		mgr.add(new Car("11��1234",5000));
		mgr.add(new Bus("22��1234",5000,45));
		mgr.add(new Car("44��1234",5000));
		mgr.add(new Truck("55��1234",5000,4));
		mgr.add(new Truck("66��1234",5000,3));
		mgr.add(new Car("77��1234",5000));
		mgr.add(new Car("88��1234",5000));
		mgr.update("44��1234", 7000);
		mgr.delete("55��1234");
		
		List<Car> cars=mgr.search();
		System.out.println(cars);//cars.toString
		for(Car c: cars) {
			System.out.println(c);
		}

	}

}
