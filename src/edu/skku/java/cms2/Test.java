package edu.skku.java.cms2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		ICarMgr mgr=new CarMgrImpl(); // 인터페이스는 new안됨! 슈퍼로 가져올 수 있음
		mgr.add(new Car("11소1234",5000));
		mgr.add(new Bus("22소1234",5000,45));
		mgr.add(new Car("44소1234",5000));
		mgr.add(new Truck("55소1234",5000,4));
		mgr.add(new Truck("66소1234",5000,3));
		mgr.add(new Car("77소1234",5000));
		mgr.add(new Car("88소1234",5000));
		mgr.update("44소1234", 7000);
		mgr.delete("55소1234");
		
		List<Car> cars=mgr.search();
		System.out.println(cars);//cars.toString
		for(Car c: cars) {
			System.out.println(c);
		}

	}

}
