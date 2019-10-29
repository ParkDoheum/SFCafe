package com.hk.cafe;

public class Coffee {
	private final String name;
	
	//생성자
	//기본X
	//MenuItem객체 주소값을 받는 생성자 만든다
	//MenuItem에 들어있는 메뉴명값을 name에 복사해주는 기능이 있는 생성자!	
	
	public Coffee(MenuItem mi) {		
		name = mi.getMenuName();
	}
	
}
