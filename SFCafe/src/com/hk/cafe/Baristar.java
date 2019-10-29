package com.hk.cafe;

public class Baristar {
	public Coffee makeCoffee(MenuItem mi) {		
		switch(mi.getMenuName()) {		
		case "카라멜 마키아또":
			return new CaramelMakkiaTto(mi);
		case "아메리카노":
			return new Americano(mi);
		case "에스프레소":
			return new Espresso(mi);
		case "카푸치노":
			return new Cappuchino(mi);
		default:
			return null;
		}
	}
}
