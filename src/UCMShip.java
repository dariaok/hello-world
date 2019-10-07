

public class UCMShip{
	private int pos[] = new int[2];
	private int hp;
	private int damage;
	private boolean shockWave;
	private int points;

	//rand
	UCMShip(){
		hp = 3;
		damage = 1;
		shockWave = false;
		points = 0;
	}
	
	public void HitByAlien() {
		this.hp -= 1;
	}
	
	public int[] getShipPos() {
		return pos;
	}
	
	public void setShipPos(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
	}
	public int getPoint() {
		return points;
	}
	
	public void setPoints(int bonus) {
		points += bonus;
	}
	
	
	
	

	

	
	
}