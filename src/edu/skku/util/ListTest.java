package edu.skku.util;

import java.util.ArrayList;
import java.util.List;

import edu.skku.java.cms.Bus;
import edu.skku.java.cms.Car;
import edu.skku.java.cms.Truck;

public class ListTest {

	public static void main(String[] args) {
		List<Car> c=new ArrayList<Car>(); //슈퍼타입이 온다면
		c.add(new Car("11가1111",5000));
		c.add(new Bus("34호2342",8000,45)); //서브클래스
		c.add(new Bus("63호2342",8000,45)); //아무거나

		c.add(new Truck("64소2782",8700,3)); //담을
		c.add(new Truck("94소2782",8700,1.5)); //수
		c.add(new Truck("27소2782",8700,3)); //있다
		
		for(Car cc: c) {
			System.out.println(cc);//cc.toString을 부를 것.
		}
		System.out.println("======Bus List======");
		int sum=0;
		for(Car cc: c) {
			if(cc instanceof Bus) { //버스만 찍기
				System.out.println(cc);
				//sum=sum+cc.getSeat(); //슈퍼타입에서 서브클래스 바로 꺼낼 수 없음
				Bus b = (Bus)cc;
				sum=sum+b.getSeat();
			}
		}
		System.out.println("버스의 총 좌석수:"+sum);
		
		System.out.println(c.remove(0));//지워진 것을 리턴시켜줌
		System.out.println(c.get(0));//리턴하지 않으면서 꺼냄
		c.remove(0);
		
	}

}
