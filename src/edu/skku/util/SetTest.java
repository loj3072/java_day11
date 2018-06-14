package edu.skku.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import edu.skku.java.cms.Car;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>(); //들어간 순서 기억 못함. 순서 보장이 안 됨. 똑같은 데이터는 무시한다.
		//전부 노란 줄이 뜨는 이유: 여러 타입들을 쓰는 경우는 별로 없다. 하나의 타입만 쓰지. 타입을 명확하게 하라는 의미.
		//Set<String> s = new HashSet<>(); //자바 7.0부터는 뒤에 타입을 생략할 수 있다. 꺽쇠는 냠겨둬야 함.
		s.add("abc");
		//s.add(new Car().toString());
		s.add("seoul");
		s.add("busan");
		s.add("busan");
		//object를 취급하기 때문에 아무거나 담아도 됨
		s.add(new Integer(30).toString());
		s.add(30+"");//이렇게 해도 문자열임!
		//s.iterator() iterator를 편하게 쓰려고 만든 것이 for문
		//s.toArray(a)// Set에 있는 데이터를 Array로 바꿔서 출력
		//s.forEach(action); // 병렬 처리
		//s.parallelStream() //병렬 처리
		s.remove("abc"); //index가 없으니 객체를 정확히 나타내야 함.
		
		//for(int i=0; i<s.size(); i++) 순서가 없기에 인덱스로 하나씩 뽑아오는 이 for문은 쓸 수 없음
		for(Object ob :s) { //자동으로 String이 되어서 나온다.
			System.out.println(ob);//ob.toString()
		}
		//Set: 순서 없이, 중복 없이 데이터를 관리하는 구조.
		
		Set<String> ss=new TreeSet<>(); //알파벳 순으로 정리되어서 나옴
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
