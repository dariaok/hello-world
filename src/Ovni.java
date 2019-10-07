
public class Ovni {

	private int pos[] = new int[2];
	private int hp;
	private int bonus;
	//private int shockWave;

		//rand
	Ovni(){
		hp = 1;
		bonus = 25;
		}
		private static  void foo(){
		
		}
		public void HitByUCMShip() {
			this.hp -= 1;
		}
		
		public int[] getOvniPos() {
			return pos;
		}
		
		public void setOvniPos(int x, int y) {
			this.pos[0] = x;
			this.pos[1] = y;
		}
		
	}