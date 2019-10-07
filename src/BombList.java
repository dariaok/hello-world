public class BombList{
	private int damage;
	private int pos[] = new int[2];
	
	
	
	public void setDamage(int x) {
		this.damage = x;
	}
	
	public int[] getDamagePos() {
		return pos;
	}
	
	public void setShipPos(int x, int y) {
		this.pos[0] = x;
		this.pos[1] = y;
	}
	//Hay que hacer un array de posiciones de las bombas




}