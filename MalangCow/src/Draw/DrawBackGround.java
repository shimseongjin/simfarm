package Draw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import System.Default;

public class DrawBackGround extends JPanel{
	private int [][] map;// 맵 정보 받아서 저장해두는 곳
	private BufferedImage tileSheet; //사용할 이미지 파일
	public DrawBackGround(){
		
	}
	// 생성자는 없다
	
	
	public DrawBackGround(int [][]mapSet, String image){
		map = new int [mapSet.length][mapSet[0].length];
		for(int y=0; y<mapSet.length;y++)
			for(int x=0; x<mapSet[0].length;x++){
				map[y][x] = mapSet[y][x]; //입력받은 맵으로 map 을 초기화
			}
		
		try {
			tileSheet = ImageIO.read(new File(image)); // 파일읽어서 이미지 사용
		} catch (IOException e) {
			e.printStackTrace();
		}		
	} // 맵정보를 받고
	
	
	public void paintComponent(Graphics g){//배경 화면을 출력하기 위한 것
		super.paintComponent(g);	
		for(int y=0;y<map.length;y++)
			for(int x=0;x<map[0].length;x++){
				if(map[y][x]!=-1){
					int index =map[y][x];//맵타일에 있는 숫자를 이용해 어디 에 몇번째 이미지를 쓸지 결정
					int yOffset=0;//그 이미지 타일이 어느 줄에 있는지
					
					while(index > (tileSheet.getWidth()/Default.TILE_X)-1){
						yOffset++; //이미지 위치 찾을때까지 반복
						index = index - (tileSheet.getWidth()/Default.TILE_X);
					}
					g.drawImage(tileSheet,x*Default.TILE_X,
							y*Default.TILE_Y,
							(x*Default.TILE_X)+Default.TILE_X,
							(y*Default.TILE_Y)+Default.TILE_Y,
							index * Default.TILE_X,
							yOffset * Default.TILE_Y,
							(index *Default.TILE_X)+Default.TILE_X,
							(yOffset * Default.TILE_Y) +Default.TILE_Y,null);
			}
			}
	}
}
