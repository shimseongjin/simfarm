package Draw;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
import javax.imageio.ImageIO;
public class SpriteImage {
    int row,col,width,height; //이미지의 행값,열값,가로,세로
    String fileName;
    BufferedImage bigImg;     //자를 이미지
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
            //ImageIO 클래스를 이용하여 이미지를 불러온다.
            bigImg = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        //자른 이미지를 담을수 있는 배열 생성[행 * 열] = 갯수
        BufferedImage splitImages[] = new BufferedImage[row * col];
        for(int i = 0 ; i < row ; i++){ 
            for(int j = 0 ; j < col ; j++){
                //getSubimage 메소드를 이용하여 자른다.
                //앞파라미터 부터 시작 x,y ,가로,세로
                splitImages[i*col + j] = bigImg.getSubimage(j* width, i * height, width, height);
            }
        }
        //잘라진 이미지 배열을 반환.
        return splitImages;
    }
     
 
}
