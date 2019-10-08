// Es un clase enumerada con la que se encapsulan los tres niveles de juego.

public class Level{
	difficulty diff;
	
	private enum difficulty{
		easy, normal, hard
		}
	
	public enum setDifficulty(int dif) {
		if(dif == 1){
			diff = easy;	
		}
		else if(dif == 2){
			diff = normal;
		}
		else if(dif == 3){
			diff = hard;
		}
		
		//or in that case when the argument is ENUM
		// diff = diff
	}
	
	public enum getDifficulty() {
		return difficult;
	}
}
