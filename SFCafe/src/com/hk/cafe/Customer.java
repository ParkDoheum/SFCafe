package com.hk.cafe;

import java.util.Scanner;

public class Customer {
	private Scanner scan = new Scanner(System.in); 
	
	public MenuItem order(MenuTable mt) {		
		mt.showMenus();
		System.out.print("메뉴를 선택해 주세요 : ");
		int selectedIdx = scan.nextInt();
		return mt.choiceMenu(selectedIdx);
	}

}
