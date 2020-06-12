package com.itutry.demo.demo2;

public class AccessModifier {

	private int accessPrivate;
	int accessDefault;
	public int accessPublic;
	
	private void methodPrivate() {
		accessPrivate = 1;
		accessDefault = 2;
		accessPublic = 3;
	}
	
	void methodDefault() {
		accessPrivate = 1;
		accessDefault = 2;
		accessPublic = 3;
	}
	
	public void methodPublic() {
		accessPrivate = 1;
		accessDefault = 2;
		accessPublic = 3;
	}
}
