package Character;

import View.Farm;
import View.Main;

public class Me {
	public int Money;
	public boolean Badge[];
	public boolean Jobcho[];
	public Main main;
	Thread 	thread;
 	public Me(Main main_){
		Money = 500000;
		Jobcho = new boolean[4];
		for(int i = 0 ; i < 4 ; i++)
			Jobcho[i] = false;
		Jobcho[0] = true;
		
		Badge = new boolean[8];
		for(int i = 0 ; i < 8 ; i++)
			Badge[i] = false;

		main = main_;
		
		
		thread = new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					// TODO Auto-generated method stub
					try {
						Thread.currentThread().sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Jobchor(main.farm);    
				}	
				
			}
		});
		thread.start();
	}
		
		

	
	public void MakeMoney(int mo){
		Money += mo;
	}
	
	public boolean UseMoney(int mo){
		if(mo > Money)
			return false;
		Money -= mo;
		return true;
	}
	
	public int GetMoney(){
		return Money;
	}
	
	public void Jobchor(Farm farm){
		int i=0;
		for(i = 0 ; i <4; i++){
			if(Jobcho[3-i] == true) break;	}
		
		for(int k = 0 ; k < 6 ; k++){
			switch(3-i){
			case 3:
				farm.cowpanel[k].cow.strength += 4;
				break;
			case 2:
				farm.cowpanel[k].cow.strength += 3;
				break;
			case 1:
				farm.cowpanel[k].cow.strength += 2;
				break;
			case 0:
				farm.cowpanel[k].cow.strength += 1;
				break;
			}
			if(farm.cowpanel[k].cow.strength > 100)
				farm.cowpanel[k].cow.strength = 100;
		}
	}

}