package Character;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import Draw.Map;
import Draw.SpriteImage;

public class Cow{
	final static int MOVE_DOWN = 0;
	final static int MOVE_LEFT = 1;
	final static int MOVE_RIGHT = 2;
	final static int MOVE_UP = 3;
	
	int lastmoveState = 0;
	int moveState = 0;
	int step =0;
	int imageNo = 12;   	// 주인공의 이미지 번호. 우리에게 보여줄 이미지 인덱스를 나타낸다.
	int x_pos=5,y_pos=5;	//주인공의 좌표.
	int moveSpeed = 2;   // 움직임 속도
	
	public BufferedImage[] CowImg;    //  소 이미지
	BufferedImage Flag;			// 소가 없을때 이미지
				
	public int kind=0; // 소의 품종
	public int strength; // 체력 : 병, 대회우승 확률에 관여
	public int power; // 건강 : 병에 걸릴 확률에 관여
	public int quick; // 민첩 : 대회 우승 확률에 관여
	
	public boolean live;
	
	public Cow(){
		live = false;      // 처음에는 죽어있다.
		try {
			Flag =  ImageIO.read(new File("cow/Flag.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void move(){      
        if(step < 3){
        	if((lastmoveState == MOVE_DOWN)&&(y_pos<91)){
                y_pos += moveSpeed;
                step++;
        	}
        	else if((lastmoveState == MOVE_LEFT)&&(x_pos>5)){
                x_pos-=moveSpeed;
                step++;
        	}
        	else if((lastmoveState == MOVE_RIGHT)&&(x_pos<123)){
                x_pos+=moveSpeed;
                step++;
        	}
        	else if((lastmoveState == MOVE_UP)&&(y_pos>5)){
                y_pos-=moveSpeed;
                step++;
        	}
        	else step = 3;

        }
        else if(step == 3){
           step = 0;
           int ran = (int)(Math.random()*10);   
           if((ran==0)&&(y_pos<91)){
                moveState=MOVE_DOWN;
              y_pos += moveSpeed;
              lastmoveState = MOVE_DOWN;
           }   
           if((ran==1)&&(x_pos>5)){
                moveState=MOVE_LEFT;
                x_pos-=moveSpeed;
                lastmoveState=MOVE_LEFT;
           }
           if((ran==2)&&(x_pos<123)){
                moveState=MOVE_RIGHT;
                x_pos+=moveSpeed;
                lastmoveState=MOVE_RIGHT;
           }  
           if((ran==3)&&(y_pos>5)){
                moveState=MOVE_UP;
              y_pos+=moveSpeed;
              lastmoveState=MOVE_UP;
           }
        }
        
          imageNo = moveState*4 + step;
  }
	
	//출생
	public void born(int i){
		live = true;
		kind = i;
		if(i == 1){
			SpriteImage sp = new SpriteImage(4,4,64,64,"cow/젖소.png");
			CowImg = sp.getSpliteImage();
			strength = 100;
			power =100;
			quick = 100;
		}
		else if(i ==2){
			SpriteImage sp = new SpriteImage(4,4,64,64,"cow/황소.png");
			CowImg = sp.getSpliteImage();
			strength = 100;
			power =150;
			quick = 150;
		}
		else if(i == 3){
			SpriteImage sp = new SpriteImage(4,4,64,64,"cow/물소.png");
			CowImg = sp.getSpliteImage();
			strength = 100;
			power =200;
			quick = 200;
		}
		else if(i == 4){
			SpriteImage sp = new SpriteImage(4,4,64,64,"cow/버팔로.png");
			CowImg = sp.getSpliteImage();
			strength = 100;
			power =300;
			quick = 300;
		}
	}
	
	
	public int xpos(){return x_pos;}
	public int ypos(){return y_pos;}
	
	// 죽을 경우
	public void Dead(){
		live = false;
	}
	
	public boolean DoB(){
		return live;
	}
	
	public BufferedImage getBufferedImage(){
    	return CowImg[imageNo];
    }
	
	public BufferedImage DeadImage(){
		return Flag;
	}
	
	
	public void paint(Graphics g){
		if(this.DoB() == true)
			g.drawImage(getBufferedImage(), x_pos, y_pos, null);
		else
			g.drawImage(Flag, 50, 50, 67, 82, null);
	}
	
	String name(int i){
	if(i == 1)
		return "젖소";
	else if(i == 2)
		return "황소";
	else if(i == 3)
		return "물소";
	else
		return "버팔로";

	}

	
}