package com.hk.cafe;

import java.util.*;

public class MenuTable {
	//MenuItem 객체 주소값을 최소 4개 이상 저장할 수 있는 객체 생성!!!
	//private MenuItem[] menus = new MenuItem[4];
	private List<MenuItem> menus = new ArrayList();
	
	public MenuTable() {
		MenuItem mi = new MenuItem("아메리카노", 1500);
		menus.add(mi);
		menus.add(new MenuItem("카푸치노", 2000));
		menus.add(new MenuItem("카라멜 마키아또", 2500));
		menus.add(new MenuItem("에스프레소", 2500));		
	}
	
	public ______ showMenus(      ) {
		
	}
}
