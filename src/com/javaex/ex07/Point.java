package com.javaex.ex07;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// equals() 메소드를 작성하세요.
	public boolean equals(Object obj) {
		if(this.x == ((Point)obj).x) {
			return true;
		}else if(this.y != ((Point)obj).y)
		return false;
		return false;
	}

}
