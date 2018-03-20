package Draw;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
public class SpriteImage {
    int row,col,width,height; //�̹����� �ప,����,����,����
    String fileName;
    BufferedImage bigImg;     //�ڸ� �̹���
    public SpriteImage(int row,int col,int width,int height,
            String fileName) {
        this.row = row;
        this.col = col;
        this.width = width;
        this.height = height;
        this.fileName = fileName;
    }
    public BufferedImage[] getSpliteImage(){
        try {
            //ImageIO Ŭ������ �̿��Ͽ� �̹����� �ҷ��´�.
            bigImg = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //�ڸ� �̹����� ������ �ִ� �迭 ����[�� * ��] = ����
        BufferedImage splitImages[] = new BufferedImage[row * col];
        for(int i = 0 ; i < row ; i++){ 
            for(int j = 0 ; j < col ; j++){
                //getSubimage �޼ҵ带 �̿��Ͽ� �ڸ���.
                //���Ķ���� ���� ���� x,y ,����,����
                splitImages[i*col + j] = bigImg.getSubimage(j* width, i * height, width, height);
            }
        }
        //�߶��� �̹��� �迭�� ��ȯ.
        return splitImages;
    }
     
 
}
