package ChessPieces;

//Pawn Object
public class Pawn implements Pieces{

	private Boolean isWhite;
	
	//Constructor
	public Pawn(Boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//Returns color
	public Boolean getColor() {
		return this.isWhite;
	}
	
	//Checks to see if move for this piece is valid
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		
		if(prevRow - newRow >= -1 && prevRow - newRow <= 1) {
		//If color is white
			if(getColor() == true) {
				//If the move is only 1 space away
				if(prevRow - newRow >= -1) {
					
					//If there is a piece in the way, you can't move
					if(toString() == "#") {
						return true;
					}
					else {
						System.out.println("There is a piece in the way, you cannot move there");
						return false;
					}
				}
				else {
					System.out.println("You have tried to move to an invalid location, try again");
					return false;
				}
			}
			else {
				//If move is only 1 space away
				if(prevRow - newRow <= 1) {
					return true;
				}
				else {
					System.out.println("You have tried to move to an invalid location, try again");
					return false;
				}			
			}
		}else{
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "P";}
}
