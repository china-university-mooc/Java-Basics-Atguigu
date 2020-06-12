package com.itutry.demo.demo2;

public class AccessModifierTest {

	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		
		accessModifier.accessDefault = 1;
		accessModifier.accessPublic = 2;
//		accessModifier.accessPrivate = 3;
		
		accessModifier.methodDefault();
		accessModifier.methodPublic();
//		accessModifier.methodPrivate();
	}
}
