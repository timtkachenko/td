package tim.towerdefence;

public class User {
	Screen screen;

	Player player;
	int startingMoney=300;
	int startingHealth=100;
	
	public User(Screen screen){
		this.screen = screen;
		this.screen.scene =0;
	}
	
	public void createPlayer(){
		this.player = new Player(this);
	}
}
