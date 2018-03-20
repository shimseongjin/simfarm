package Draw;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import System.Default;

public class DrawBackGround extends JPanel{
	private int [][] map;// �� ���� �޾Ƽ� �����صδ� ��
	private BufferedImage tileSheet; //����� �̹��� ����
	public DrawBackGround(){
		
	}
	// �����ڴ� ����
	
	
	public DrawBackGround(int [][]mapSet, String image){
		map = new int [mapSet.length][mapSet[0].length];
		for(int y=0; y<mapSet.length;y++)
			for(int x=0; x<mapSet[0].length;x++){
				map[y][x] = mapSet[y][x]; //�Է¹��� ������ map �� �ʱ�ȭ
			}
		
		try {
			tileSheet = ImageIO.read(new File(image)); // �����о �̹��� ���
		} catch (IOException e) {
			e.printStackTrace();
		}		
	} // �������� �ް�
	
	
	public void paintComponent(Graphics g){//��� ȭ���� ����ϱ� ���� ��
		super.paintComponent(g);	
		for(int y=0;y<map.length;y++)
			for(int x=0;x<map[0].length;x++){
				if(map[y][x]!=-1){
					int index =map[y][x];//��Ÿ�Ͽ� �ִ� ���ڸ� �̿��� ��� �� ���° �̹����� ���� ����
					int yOffset=0;//�� �̹��� Ÿ���� ��� �ٿ� �ִ���
					
					while(index > (tileSheet.getWidth()/Default.TILE_X)-1){
						yOffset++; //�̹��� ��ġ ã�������� �ݺ�
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
