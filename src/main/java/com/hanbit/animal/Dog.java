package com.hanbit.animal;

import org.apache.commons.lang3.StringUtils;

public class Dog {
	
	public static final String DEFAULT_NAME = "멍멍이";
	//클래스 내에서 하나만 존재하게 하는 static과 변할수 없게 하는 final을 같이 써서 유일하게 만듬
	private String name;// 다른곳에서도 쓸수 있게해줌
	private final String kind;// 다른곳에서 이름 변환 불가
	private String color;
	//final도 변경 불가.
	
	
	
	public Dog(String kind, String color){
		this(DEFAULT_NAME, kind, color);

	}
	
	public Dog(String name, String kind, String color){
		this.name= name;
		this.kind = kind;
		this.color = color;
	}	
	
	@Override
	public String toString(){
		return name + ":" +kind + ":" + color;
	}

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		if(StringUtils.isBlank(name)){
			name =DEFAULT_NAME;
		}
		
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color){
		if(StringUtils.isBlank(color)){
			color = "기본색";
		}
		this.color = color;
	}
}
