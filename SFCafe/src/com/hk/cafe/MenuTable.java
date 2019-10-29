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
	
	public void showMenus() {
		int no = 1;
		for(MenuItem mi : menus) {
			System.out.printf("%d. %s - (%,d원)\n"
					, no++, mi.getMenuName(), mi.getMenuPrice());
		}
	}
	
	//메뉴 선택
	public MenuItem choiceMenu(int idx) {
		int targetIdx = idx - 1;
		if(targetIdx < 0 || targetIdx >= menus.size()) {
			return null;
		}		
		return menus.get(idx - 1);
	}
}
















