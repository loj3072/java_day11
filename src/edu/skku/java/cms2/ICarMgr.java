package edu.skku.java.cms2;

import java.util.List;

public interface ICarMgr {
	public void add(Car c);
	public Car search(String num);
	public List<Car> search();//등록된 모든 클래스(차량) 검색...하고 화면으로 찍어 보내기...차량이 총 몇 대인지 모르니까 List
	public void update(String num, int price);
	public void delete(String num);

}
