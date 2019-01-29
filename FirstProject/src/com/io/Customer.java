package com.io;

import java.io.Serializable;

//객체가 스트림을 통해 이동될 때 필요조건 : 직렬화(Serialization)
//Serializable 인터페이스 구현해 주면 됨
//직렬화 : 객체안의 모든 데이터를 바이트 배열로 변환시켜 이동이 가능하게 해주는 기능
public class Customer implements Serializable{ // Customer는 직렬화 객체로 됨
	private int num;
	private String name;
	private String address;
	
	public Customer(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [num=" + num + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
