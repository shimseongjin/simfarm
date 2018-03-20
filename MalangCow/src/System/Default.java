package System;

import java.awt.Dimension;

public class Default{
	static public int TILE_X = 32; //타일 하나당 크기
	static public int TILE_Y = 32;
	
	static public int WINDOW_X = TILE_X * 20; // 가로 800   배경 타일 사이즈
	static public int WINDOW_Y = TILE_Y * 15;  // 세로 640
	
	
	static public Dimension getWindowSize(){
		return new Dimension(975,800); //게임창 기본 크기
	}
}
