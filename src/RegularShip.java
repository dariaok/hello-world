public class RegularShip{
	private int pos[] = new int[2];
	private int hp;
	private int bonus;

	//rand
	RegularShip(){
		hp = 2;
		bonus = 5;
	}
	public static  void foo(){
	
	}
	public void HitByUCMship() {
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
	