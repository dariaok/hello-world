public class DestroyerShip{
	private int pos[] = new int[2];
	private int hp;
	private int damage;
	private int bonus;

	//rand
	DestroyerShip(){
		hp = 1;
		damage = 1;
		bonus = 10;
	}
	private static  void foo(){
	
	}
	public void HitByUCMShip() {
		this.hp -= 1;
	}
	
	public int[] getShipPos() {
		return pos;
	}
	
	public void setShipPos(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
	}
	
}