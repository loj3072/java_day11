package edu.skku.util;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<>();//key와 value는 객체이기 때문에 Int가 아니라 Integer
		m.put(new Integer(10000), "서울시 중구"); // new Integer하지 않아도 기본형을 주면 오토박싱으로 자동으로 객체화가 됨.
		m.put(10010, "서울시 동대문구");
		m.put(10020, "서울시 종로구");
		
		System.out.println(m.get(10010)); // key값을 입력하면 value값이 나옴. 검색속도 향상
		for(Integer key :m.keySet()) {//전부 다 찍고 싶다면. //오토 언박싱도 가능하므로 Integer대신 Int써도 됨
			System.out.println(key+":"+m.get(key));//key나오고 그 key 에 맞는 value데이터값이 나옴
		}
		
	}

}
