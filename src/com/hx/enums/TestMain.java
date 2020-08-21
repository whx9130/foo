package com.hx.enums;

public class TestMain {

	public static void main(String[] args) {
		for(StateEnum state:StateEnum.values()) {
	        System.out.println(state+",ordinal:"+state.ordinal()+",name:"+state.name());
			System.err.println(state.toString());
		}
		String name ="¹ÒÆð";
		StateEnum state =StateEnum.fromTypeName(name);
		System.err.println(state.getName()+"-"+state.getCode());
	}

}
