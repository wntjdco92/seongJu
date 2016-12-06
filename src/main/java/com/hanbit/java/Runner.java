package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {
	public static void main(String[] args){
		
		//클래스의 첫글자는 무조건 대문자로 new는 키워드(보라색)
		/*FirstClass firstClass = new FirstClass(3);
		FirstClass secondClass = new FirstClass(4);
		
		System.out.println(firstClass.addNumber(5));
		System.out.println(firstClass.addNumber(5));
		
		System.out.println(secondClass.getNumber());
		System.out.println(secondClass.addNumber(5));*/
		
		
			Dog dog = new Dog( "도베르만", "검정");
			Dog dog2 = new Dog ("검둥이", "도베르만", "검정");
			Dog dog3 = new Dog ("바둑이", " 달마시안", "검정/쿠앤크");
			
			
			System.out.println(dog);
			System.out.println(dog2);
			System.out.println(dog3);
			
		}
}
