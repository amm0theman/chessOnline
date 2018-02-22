package ChessPieces;

public class King implements Pieces{
	
	private Boolean isWhite;
	
	//Constructor
	public King(Boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//Returns color
	public Boolean getColor() {
		return this.isWhite;
	}
	
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		
		//Can only move one spot in any direction, if anything else is tried, error
		if(prevRow - newRow <= 1 && prevRow - newRow >= -1) {
			if(prevCol - newCol <= 1 && prevCol - newCol >= -1) {
				return true;
			}
			else {
				System.out.println("You have tried to move to an invalid location, try again");
				return false;
			}
		}
		else {
			System.out.println("You have tried to move to an invalid location, try again");
			return false;
		}		
	}
	
	@Override
	public String toString() {
		return "K";}
}
