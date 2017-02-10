
public class Die {
public int currentSides;
public int number;
	public Die(int Sides){
		 currentSides = Sides;
		
		}
public void Roll(){
	 number = (int) (Math.random() * currentSides) + 1;
}
public int getValue(){
	return number;
}
	
	}

	
	

