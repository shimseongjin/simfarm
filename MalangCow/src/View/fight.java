package View;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Character.Cow;


public class fight extends JFrame {
   Cow test_cow;   //힘, 민첩 80으로 생성

   JScrollPane scrollPane;
   String badge[]=new String[9];
   Main main;
   
 // 멤버 필드에 ImageIcon 클래스 생성자
   ImageIcon icon;
   JLabel game_label[]=new JLabel[9];
   
    public fight(Main main_, Cow cow_) {
       
       test_cow = cow_;
       main=main_;

       for(int i=0;i<9;i++){
          game_label[i]=new JLabel("");
       }
       
  // 생성자에 ico 호출 하고 이미지 경로 지정...(상대경로로 안될경우 절대경로 지정)   
    icon = new ImageIcon("back.jpg");
    badge[0]=new String("bat\\뱃지1.png");
    badge[1]=new String("bat\\뱃지2.png");
    badge[2]=new String("bat\\뱃지3.png");
    badge[3]=new String("bat\\뱃지4.png");
    badge[4]=new String("bat\\뱃지5.png");
    badge[5]=new String("bat\\뱃지6.png");
    badge[6]=new String("bat\\뱃지7.png");
    badge[7]=new String("bat\\뱃지8.png");
    badge[8]=new String("말랑말랑카우.png");
   
  // 백그라운드 이미지 삽입할 메소드에 이름없는 클래스로 구현
  JPanel panel = new JPanel() {
   public void paintComponent(Graphics g) {
    g.drawImage(icon.getImage(), 0, 0, 670,355,null);
    setOpaque(false);
    super.paintComponent(g);
    }
   };

  scrollPane = new JScrollPane(panel);
  panel.setLayout(null);

  game_label[0].addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
        if(main.me.Badge[0]!=true){
           main.state.in();
           dispose();
           game frame = new game(0);
         frame.setVisible(true);
        }
        //}
     }
  });
  
  game_label[1].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[1]!=true&&main.me.Badge[0]==true){
              main.state.in();
              dispose();
              game frame = new game(1);      
              frame.setVisible(true);
         }


           //}
        }
     });
  game_label[2].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[2]!=true&&main.me.Badge[1]==true){
              main.state.in();
              dispose();
              game_hard frame = new game_hard(2);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[3].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[3]!=true&&main.me.Badge[2]==true){
              main.state.in();
              dispose();
              game_hard frame = new game_hard(3);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[4].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[4]!=true&&main.me.Badge[3]==true){
              main.state.in();
              dispose();
              game_hard frame = new game_hard(4);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[5].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[5]!=true&&main.me.Badge[4]==true){
              main.state.in();
              dispose();
              game_hard frame = new game_hard(5);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[6].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[6]!=true&&main.me.Badge[5]==true){
              main.state.in();
              dispose();
              game_crazy frame = new game_crazy(6);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[7].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[7]!=true&&main.me.Badge[6]==true){
              main.state.in();
              dispose();
              game_crazy frame = new game_crazy(7);
            frame.setVisible(true);
           }
           //}
        }
     });
  game_label[8].addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           // 소 선택 불러오기
           // 선택한 소의 정보(힘, 민첩) 받아오기
           // 뱃지의 유무
           //if((power+dex)>150){
           if(main.me.Badge[7]==true){
              int select=JOptionPane.showConfirmDialog(null, "말랑카우에게 도전 하시겠습니까? (10만원 차감)", "도전", JOptionPane.YES_NO_OPTION);
              if(select==0){
                 if(main.me.Money>=1000000){
                 main.state.in();
                 dispose();
              main.me.MakeMoney(-100000);
              game_crazy frame = new game_crazy(8);
            frame.setVisible(true);
                 }
                 else{
                    JOptionPane.showMessageDialog(null, "돈이 부족하여 도전하지 못했습니다.");
                      dispose();
                 }
                    
              }
           }
           //}
        }
     });

  if(main.me.Badge[0]==true){
     game_label[0].setBounds(60, 39, 70, 50);
        panel.add(game_label[0]);
     game_label[0].setIcon(new ImageIcon(badge[0]));}
  else{
     game_label[0].setBounds(60, 39, 70, 50);
     panel.add(game_label[0]);
     game_label[0].setIcon(new ImageIcon("a.png"));
  }
  
  if(main.me.Badge[1]==true){
     game_label[1].setBounds(279, 39, 65, 50);
        panel.add(game_label[1]);
     game_label[1].setIcon(new ImageIcon(badge[1]));}
  else{
     game_label[1].setBounds(279, 39, 65, 50);
  panel.add(game_label[1]);
  game_label[1].setIcon(new ImageIcon("a.png"));
  }
  
  if(main.me.Badge[2]==true){
     game_label[2].setBounds(511, 39, 65, 50);
        panel.add(game_label[2]);
     game_label[2].setIcon(new ImageIcon(badge[2]));}
  else{
     game_label[2].setBounds(511, 39, 65, 50);     
     panel.add(game_label[2]);
     game_label[2].setIcon(new ImageIcon("a.png"));
  }
  
  if(main.me.Badge[3]==true){
     game_label[3].setBounds(60, 139, 65, 50);
     panel.add(game_label[3]);
     game_label[3].setIcon(new ImageIcon(badge[3]));}
  else{
  game_label[3].setBounds(60, 139, 65, 50);
  panel.add(game_label[3]);
  game_label[3].setIcon(new ImageIcon("a.png"));
  }
  
  if(main.me.Badge[4]==true){
     game_label[4].setBounds(279, 139, 65, 50);
     panel.add(game_label[4]);
     game_label[4].setIcon(new ImageIcon(badge[4]));}
  else{
     game_label[4].setBounds(279, 139, 65, 50);
  panel.add(game_label[4]);
  game_label[4].setIcon(new ImageIcon("a.png"));
  }
  if(main.me.Badge[5]==true){
     game_label[5].setBounds(511, 139, 65, 50);
     panel.add(game_label[5]);
     game_label[5].setIcon(new ImageIcon(badge[5]));}
  else{
     game_label[5].setBounds(511, 139, 65, 50);
  panel.add(game_label[5]);
  game_label[5].setIcon(new ImageIcon("a.png"));
  }
  if(main.me.Badge[6]==true){
     game_label[6].setBounds(60, 243, 65, 50);
     panel.add(game_label[6]);
     game_label[6].setIcon(new ImageIcon(badge[6]));}
  else{
  game_label[6].setBounds(60, 243, 65, 50);
  panel.add(game_label[6]);
  game_label[6].setIcon(new ImageIcon("a.png"));
  }
  if(main.me.Badge[7]==true){
     game_label[7].setBounds(279, 243, 65, 50);
     panel.add(game_label[7]);
     game_label[7].setIcon(new ImageIcon(badge[7]));}
  else{
  game_label[7].setBounds(279, 243, 65, 50);
  panel.add(game_label[7]);
  game_label[7].setIcon(new ImageIcon("a.png"));
  }
  
  
  game_label[8].setBounds(511, 243, 65, 50);
  panel.add(game_label[8]);
  game_label[8].setIcon(new ImageIcon("a.png"));
  
  
  setContentPane(scrollPane);
  setSize(650, 380);
  setVisible(true);
  }

 public class game extends JFrame {

    int a;   // 스테이지 인자값 전달
      int rand_arrow[]=new int[6];
      int key=0;
      JLabel label[]=new JLabel[6];
      JPanel panel = new JPanel();
      JPanel panel_1 = new JPanel();
      JLabel succOrfail = new JLabel();
      JLabel timelabel = new JLabel("");
      
      timerRun runnable= new timerRun(timelabel,succOrfail,5);
      Thread th= new Thread(runnable);
      
      private JPanel contentPane;

      /**
       * Launch the application.
       */


      /**
       * Create the frame.
       */

      public game(int a) {
      this.a=a;
         for (int i =  0; i < 6; i++) {
                label[i] = new JLabel("");
          }
         for(int i=0;i<6;i++){
            rand_arrow[i]=(int)(Math.random()*3);
            if(rand_arrow[i]==0){
               label[i].setIcon(new ImageIcon("right.png"));
            }
            else if(rand_arrow[i]==1){
               label[i].setIcon(new ImageIcon("left.png"));
            }
            else if(rand_arrow[i]==2){
               label[i].setIcon(new ImageIcon("up.png"));
            }
            else{
               label[i].setIcon(new ImageIcon("down.png"));
            }
         }
         setTitle("Mini Game");
         //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 519, 326);
         contentPane = new JPanel();
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         
         
         panel.setBounds(38, 20, 414, 155);
         contentPane.add(panel);
         panel.setLayout(new GridLayout(1, 0, 0, 0));
         
         JPanel panel_2 = new JPanel();
         panel.add(panel_2);
         
      
         
         panel_2.add(label[0]);
         panel_2.setLayout(new GridLayout(1, 0, 0, 0));
         
         JPanel panel_3 = new JPanel();
         panel.add(panel_3);
         panel_3.setLayout(new GridLayout(1, 0, 0, 0));
         panel_3.add(label[1]);
         
         JPanel panel_4 = new JPanel();
         panel.add(panel_4);
         panel_4.setLayout(new GridLayout(1, 0, 0, 0));
         panel_4.add(label[2]);
         
         JPanel panel_5 = new JPanel();
         panel.add(panel_5);
         panel_5.setLayout(new GridLayout(1, 0, 0, 0));
         panel_5.add(label[3]);
         
         JPanel panel_6 = new JPanel();
         panel.add(panel_6);
         panel_6.setLayout(new GridLayout(1, 0, 0, 0));
         panel_6.add(label[4]);
         
         JPanel panel_7 = new JPanel();
         panel.add(panel_7);
         panel_7.setLayout(new GridLayout(1, 0, 0, 0));
         panel_7.add(label[5]);
         
         
         panel_1.setBounds(38, 185, 414, 73);
         contentPane.add(panel_1);
         panel_1.setLayout(new GridLayout(1, 0, 0, 0));
         timelabel.setHorizontalAlignment(SwingConstants.CENTER);
         
         panel_1.add(timelabel);
         
         succOrfail.setFont(new Font("돋움", Font.PLAIN, 40));
         succOrfail.setHorizontalAlignment(SwingConstants.CENTER);
         panel_1.add(succOrfail);
         
         addKeyListener(new MyKeyListener()); 
         timelabel.setFont(new Font("맑은 고딕", Font.ITALIC, 40));
      
         th.start();
      }
      class MyKeyListener extends KeyAdapter {
         public void keyPressed(KeyEvent e) {

            if(succOrfail.getText().equals("Fail !")){
               
            }
            else{
               if(key>=0){
                  if(e.getKeyCode() == KeyEvent.VK_UP){
                     if(rand_arrow[key]==2){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{   // 실패
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                     if(rand_arrow[key]==3){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                     if(rand_arrow[key]==0){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_LEFT){              
                     if(rand_arrow[key]==1){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  if(key==6&&(test_cow.quick<=100*(a+1)||test_cow.power<=100*(a+1))){   // 성공했지만 상대 소보다 능력치가 약한 경우
                     succOrfail.setText("Success !");
                     th.interrupt();
                     JOptionPane.showMessageDialog(null, "능력치를 올려 다시 도전하세요!");
                     dispose();
                     
                  }
                  if(key==6&&test_cow.quick>100*(a+1)&&test_cow.power>100*(a+1)){
                     succOrfail.setText("Success !");
                      th.interrupt();
                     main.me.MakeMoney(10000*(a+1));
                     game_label[a].setIcon(new ImageIcon(badge[a]));   // 다음 단계 열림 표시
                     key=-1;
                     main.me.Badge[a]=true;   // 뱃지 획득
                     JOptionPane.showMessageDialog(null, "상대 소에게 승리하여 "+ 10000*(a+1)+"원과 뱃지를 획득 하였습니다.");
                     dispose();
                  }
               }
               else
               {
               }
            }
         }
      }
   }
   class timerRun implements Runnable{
      JLabel timerLabel;
      JLabel resultLabel;
      int second;
      int ms=0;
      int key;
      
      public timerRun(JLabel timerLabel,JLabel resultLabel, int second){
         this.timerLabel=timerLabel; // 현재 시간이 출력된 레이블
         this.resultLabel=resultLabel;
         this.second=second;
         
      }
      public void run(){   // 스레드 코드로서 start() 메소드에 의해 스레드가 실행을 시작하는 코드
         while(true){
            
            StringBuffer clockText =new StringBuffer();
              
             clockText = clockText.append("0");
             // 값이 10보다 작을 경우 0을 먼저 붙여줌
             clockText = clockText.append(Integer.toString(second));
             clockText = clockText.append(":");
             if(ms<10) clockText = clockText.append("0");
             clockText = clockText.append(Integer.toString(ms));
             
             if(ms==0){
                second--;
                ms=99;
             }
             else{
                ms--;
             }
             
             
             if(second==0&ms==0)
             {
                StringBuffer clockText1 =new StringBuffer("00:00");
                timerLabel.setText(clockText1.toString());
                resultLabel.setText("Fail !");
                
                break;
             }
             
             timerLabel.setText(clockText.toString());
             
             
             try{   // 과도한 메모리 사용을 막기 위해 1초씩 잠들게 함
                Thread.sleep(10);
             }
             catch(InterruptedException e){
                return;
             }
         }
      }
   }
   public class game_hard extends JFrame {
      int a;
      int rand_arrow[]=new int[12];
      int key=0;
      JLabel label[]=new JLabel[12];
      JPanel panel = new JPanel();
      JPanel panel_1 = new JPanel();
      JLabel succOrfail = new JLabel();
      JLabel timelabel = new JLabel("");
      
      timerRun runnable= new timerRun(timelabel,succOrfail,6);
      Thread th= new Thread(runnable);
      
      private JPanel contentPane;

      /**
       * Launch the application.
       */


      /**
       * Create the frame.
       */
      public game_hard(int a) {
         this.a=a;
      
         for (int i =  0; i < 12; i++) {
                label[i] = new JLabel("");
          }
         for(int i=0;i<12;i++){
            rand_arrow[i]=(int)(Math.random()*3);
            if(rand_arrow[i]==0){
               label[i].setIcon(new ImageIcon("right.png"));
            }
            else if(rand_arrow[i]==1){
               label[i].setIcon(new ImageIcon("left.png"));
            }
            else if(rand_arrow[i]==2){
               label[i].setIcon(new ImageIcon("up.png"));
            }
            else{
               label[i].setIcon(new ImageIcon("down.png"));
            }
         }
         setTitle("Mini Game Hard");
         //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 519, 326);
         contentPane = new JPanel();
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         
         
         panel.setBounds(38, 20, 414, 155);
         contentPane.add(panel);
         panel.setLayout(new GridLayout(1, 0, 0, 0));
         
         JPanel panel_2 = new JPanel();
         panel.add(panel_2);
         
      
         //lblNewLabel.setIcon(new ImageIcon("C:\\Users\\\uC2EC\uC131\uC9C4\\Desktop\\right.png"));
         panel_2.add(label[0]);
         panel_2.add(label[6]);
         panel_2.setLayout(new GridLayout(2, 1, 0, 0));
         
         
         JPanel panel_3 = new JPanel();
         panel.add(panel_3);
         panel_3.setLayout(new GridLayout(2, 1, 0, 0));
         panel_3.add(label[1]);
         panel_3.add(label[7]);
         
         JPanel panel_4 = new JPanel();
         panel.add(panel_4);
         panel_4.setLayout(new GridLayout(2, 1, 0, 0));
         panel_4.add(label[2]);
         panel_4.add(label[8]);
         
         JPanel panel_5 = new JPanel();
         panel.add(panel_5);
         panel_5.setLayout(new GridLayout(2, 1, 0, 0));
         panel_5.add(label[3]);
         panel_5.add(label[9]);
         
         JPanel panel_6 = new JPanel();
         panel.add(panel_6);
         panel_6.setLayout(new GridLayout(2, 1, 0, 0));
         panel_6.add(label[4]);
         panel_6.add(label[10]);
         
         JPanel panel_7 = new JPanel();
         panel.add(panel_7);
         panel_7.setLayout(new GridLayout(2, 1, 0, 0));
         panel_7.add(label[5]);
         panel_7.add(label[11]);
         
         
         panel_1.setBounds(38, 185, 414, 73);
         contentPane.add(panel_1);
         panel_1.setLayout(new GridLayout(1, 0, 0, 0));
         timelabel.setHorizontalAlignment(SwingConstants.CENTER);
         
         panel_1.add(timelabel);
         
         succOrfail.setFont(new Font("돋움", Font.PLAIN, 40));
         succOrfail.setHorizontalAlignment(SwingConstants.CENTER);
         panel_1.add(succOrfail);
         
         addKeyListener(new MyKeyListener()); 
         timelabel.setFont(new Font("맑은 고딕", Font.ITALIC, 40));
      
         th.start();
      }
      class MyKeyListener extends KeyAdapter {
         public void keyPressed(KeyEvent e) {
            if(succOrfail.getText().equals("Fail !")){
               JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
            }
            else{
               if(key>=0){
                  if(e.getKeyCode() == KeyEvent.VK_UP){
                     if(rand_arrow[key]==2){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{   // 실패
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                     if(rand_arrow[key]==3){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                     if(rand_arrow[key]==0){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_LEFT){              
                     if(rand_arrow[key]==1){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                     }
                  }
                  
                  if(key==12&&(test_cow.quick<=105*(a+1)||test_cow.power<=105*(a+1))){   // 성공   
                     succOrfail.setText("Success !");
                     th.interrupt();
                     JOptionPane.showMessageDialog(null, "능력치를 올려 다시 도전하세요!");
                     dispose();
                  }
                  if(key==12&&test_cow.quick>105*(a+1)&&test_cow.power>105*(a+1)){
                     succOrfail.setText("Success !");
                      th.interrupt();
                     game_label[a].setIcon(new ImageIcon(badge[a]));   // 다음 단계 열림 표시
                     key=-1;
                     main.me.MakeMoney(10000*(a+1));
                     main.me.Badge[a]=true;   // 뱃지 획득
                     JOptionPane.showMessageDialog(null, "상대 소에게 승리하여 "+ 10000*(a+1)+"원과 뱃지를 획득 하였습니다.");
                     dispose();
                  }
               }

               else{
                  
               }
            }
         }
      }
   }

   public class game_crazy extends JFrame {

      int a;
      int rand_arrow[]=new int[18];
      int key=0;
      JLabel label[]=new JLabel[18];
      JPanel panel = new JPanel();
      JPanel panel_1 = new JPanel();
      JLabel succOrfail = new JLabel();
      JLabel timelabel = new JLabel("");
      
      timerRun runnable= new timerRun(timelabel,succOrfail,7);
      Thread th= new Thread(runnable);
      
      private JPanel contentPane;

      /**
       * Launch the application.
       */

      /**
       * Create the frame.
       */
      public game_crazy(int a) {
         this.a=a;
      
         for(int i=0;i<18;i++){
            label[i] = new JLabel("");
            rand_arrow[i]=(int)(Math.random()*3);
            if(rand_arrow[i]==0){
               label[i].setIcon(new ImageIcon("right.png"));
            }
            else if(rand_arrow[i]==1){
               label[i].setIcon(new ImageIcon("left.png"));
            }
            else if(rand_arrow[i]==2){
               label[i].setIcon(new ImageIcon("up.png"));
            }
            else{
               label[i].setIcon(new ImageIcon("down.png"));
            }
         }
         setTitle("Mini Game Crazy");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(100, 100, 519, 361);
         contentPane = new JPanel();
         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
         setContentPane(contentPane);
         contentPane.setLayout(null);
         
         
         panel.setBounds(38, 0, 414, 216);
         contentPane.add(panel);
         panel.setLayout(new GridLayout(1, 0, 0, 0));
         
         JPanel panel_2 = new JPanel();
         panel.add(panel_2);
         
      
   
         panel_2.add(label[0]);
         panel_2.add(label[6]);
         panel_2.add(label[12]);
         panel_2.setLayout(new GridLayout(3, 1, 0, 0));
         
         
         JPanel panel_3 = new JPanel();
         panel.add(panel_3);
         panel_3.setLayout(new GridLayout(3, 1, 0, 0));
         panel_3.add(label[1]);
         panel_3.add(label[7]);
         panel_3.add(label[13]);
         
         JPanel panel_4 = new JPanel();
         panel.add(panel_4);
         panel_4.setLayout(new GridLayout(3, 1, 0, 0));
         panel_4.add(label[2]);
         panel_4.add(label[8]);
         panel_4.add(label[14]);
         
         JPanel panel_5 = new JPanel();
         panel.add(panel_5);
         panel_5.setLayout(new GridLayout(3, 1, 0, 0));
         panel_5.add(label[3]);
         panel_5.add(label[9]);
         panel_5.add(label[15]);
         
         JPanel panel_6 = new JPanel();
         panel.add(panel_6);
         panel_6.setLayout(new GridLayout(3, 1, 0, 0));
         panel_6.add(label[4]);
         panel_6.add(label[10]);
         panel_6.add(label[16]);
         
         JPanel panel_7 = new JPanel();
         panel.add(panel_7);
         panel_7.setLayout(new GridLayout(3, 1, 0, 0));
         panel_7.add(label[5]);
         panel_7.add(label[11]);
         panel_7.add(label[17]);
         
         panel_1.setBounds(38, 226, 414, 72);
         contentPane.add(panel_1);
         panel_1.setLayout(new GridLayout(1, 0, 0, 0));
         timelabel.setHorizontalAlignment(SwingConstants.CENTER);
         
         panel_1.add(timelabel);
         
         succOrfail.setFont(new Font("돋움", Font.PLAIN, 40));
         succOrfail.setHorizontalAlignment(SwingConstants.CENTER);
         panel_1.add(succOrfail);
         
         addKeyListener(new MyKeyListener()); 
         timelabel.setFont(new Font("맑은 고딕", Font.ITALIC, 40));
      
         th.start();
      }
      class MyKeyListener extends KeyAdapter {
         public void keyPressed(KeyEvent e) {
            if(succOrfail.getText().equals("Fail !")){
               JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
            }
            else{
               if(key>=0){
                  if(e.getKeyCode() == KeyEvent.VK_UP){
                     if(rand_arrow[key]==2){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{   // 실패
                        if(a<8){
                             succOrfail.setText("Fail !");
                             th.interrupt();
                             key=-1;
                             JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                             dispose();
                             }
                             else if(a==8){
                                succOrfail.setText("Fail !");
                                  th.interrupt();
                                  key=-1;
                                  new Fail();
                                  main.setVisible(false);
                             }
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                     if(rand_arrow[key]==3){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        if(a<8){
                                succOrfail.setText("Fail !");
                                th.interrupt();
                                key=-1;
                                JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                                dispose();
                             }
                             else if(a==8){
                                succOrfail.setText("Fail !");
                                  th.interrupt();
                                  key=-1;
                                  new Fail();
                                  main.setVisible(false);
                             }
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                     if(rand_arrow[key]==0){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        if(a<8){
                             succOrfail.setText("Fail !");
                             th.interrupt();
                             key=-1;
                             JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                             dispose();
                             }
                             else if(a==8){
                                succOrfail.setText("Fail !");
                                  th.interrupt();
                                  key=-1;
                                  new Fail();
                                  main.setVisible(false);
                             }
                     }
                  }
                  else if(e.getKeyCode() == KeyEvent.VK_LEFT){              
                     if(rand_arrow[key]==1){
                        label[key].setIcon(new ImageIcon(""));
                        key++;
                     }
                     else{
                        if(a<8){
                        succOrfail.setText("Fail !");
                        th.interrupt();
                        key=-1;
                        JOptionPane.showMessageDialog(null, "상대 소에게 패배하였습니다.");
                        dispose();
                        }
                        else if(a==8){
                           succOrfail.setText("Fail !");
                             th.interrupt();
                             key=-1;
                             new Fail();
                             main.setVisible(false);
                        }
                     }
                  }                  
                  if(key==18&&(test_cow.quick<=111*(a+1)||test_cow.power<=111*(a+1))){   // 성공
                     succOrfail.setText("Success !");
                     th.interrupt();
                     JOptionPane.showMessageDialog(null, "능력치를 올려 다시 도전하세요!");
                  }
                  if(key==18&&test_cow.quick>111*(a+1)&&test_cow.power>111*(a+1)){
                     key=-1;
                     if(a<8){
                        succOrfail.setText("Success !");
                         th.interrupt();
                        main.me.MakeMoney(10000*(a+1));
                        game_label[a].setIcon(new ImageIcon(badge[a]));   // 다음 단계 열림 표시
                        main.me.Badge[a]=true;   // 뱃지 획득
                        JOptionPane.showMessageDialog(null, "상대 소에게 승리하여 "+ 10000*(a+1)+"원과 뱃지를 획득 하였습니다.");
                        dispose();
                     }
                     else if(a==8){
                        succOrfail.setText("Success !");
                        th.interrupt();
                        JOptionPane.showMessageDialog(null, "말랑카우를 획득하였습니다!");   // 말랑카우 이김 표시
                        dispose();
                        new Last();
                        main.setVisible(false);
                        
                     }
                     else{
                     }
                  
               }
               else
               {
               }
            }
         }
      }
   }
   }
}