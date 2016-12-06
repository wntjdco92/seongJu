package com.hanbit.java;

public class FirstClass {

	
	
	int number;//멤버변수
	int sum;//멤버변수
	
	FirstClass(int number){//생성자
		this.number = number;
	}
	
	
	
	int getNumber(){ //매서드
		
		return number;
	}
	int addNumber(int add){ // 매서드
		number += add;//number멤버변수
		
		int sum = number; //sum을 지역변수로 다시선언, 색이 틀린것으로도 표현됨
		this.sum = sum;
		
		return number;
	}
	
	
}
