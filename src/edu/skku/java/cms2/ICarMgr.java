package edu.skku.java.cms2;

import java.util.List;

public interface ICarMgr {
	public void add(Car c);
	public Car search(String num);
	public List<Car> search();//��ϵ� ��� Ŭ����(����) �˻�...�ϰ� ȭ������ ��� ������...������ �� �� ������ �𸣴ϱ� List
	public void update(String num, int price);
	public void delete(String num);

}
