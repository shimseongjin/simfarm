package System;

import java.awt.Dimension;

public class Default{
	static public int TILE_X = 32; //Ÿ�� �ϳ��� ũ��
	static public int TILE_Y = 32;
	
	static public int WINDOW_X = TILE_X * 20; // ���� 800   ��� Ÿ�� ������
	static public int WINDOW_Y = TILE_Y * 15;  // ���� 640
	
	
	static public Dimension getWindowSize(){
		return new Dimension(975,800); //����â �⺻ ũ��
	}
}
