package edu.skku.java.cms2;

import java.util.ArrayList;
import java.util.List;

public class CarMgrImpl implements ICarMgr {
	List<Car> cars=new ArrayList<Car>();

	public void add(Car c) {
		cars.add(c); // 인덱스 관리 필요없음!
	}

	public Car search(String num) { //이 num을 가진 차량이 있는지
		for(Car c :cars) { //인덱스 관리를 안하니 코드가 깔끔하네. 
			if(c.getNum().equals(num)) { //문자열이 똑같은지 확인할 때는 equals
				return c;
			}
		}
		return null;
	}

	public List<Car> search() { //모든 차량을 출력
		return cars;
	}

	public void update(String num, int price) {
		Car c=search(num);//위에 있는 search를 이용해서 그 차량번호를 가진 차량의 주소값을 c에 가져온다
		if(c!=null) {
			c.setPrice(price);
		}else {
			System.out.println("차량 번호 오류");
		}

	}

	public void delete(String num) {
		Car c=search(num);
		if(c!=null) {
			cars.remove(c); // 인덱스 관리를 안해도 됨! Cars가 알아서 지우고 땡기고~~
		}else {
			System.out.println("차량 번호 오류");
		}

	}

}
