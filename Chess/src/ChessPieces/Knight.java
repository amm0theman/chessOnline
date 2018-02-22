package ChessPieces;

public class Knight implements Pieces {
	
	private Boolean isWhite;
	
	//Constructor
	public Knight(Boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//Returns color of piece
	public Boolean getColor() {
		return this.isWhite;
	}
	
	//Checks to see if move by knight is valid
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		if(prevRow == newRow + 1 && prevCol == newCol + 2 ||
		   prevRow == newRow + 1 && prevCol == newCol - 2 ||
		   prevRow == newRow - 1 && prevCol == newCol + 2 ||
		   prevRow == newRow - 1 && prevCol == newCol - 2 ||			   
		   prevRow == newRow + 2 && prevCol == newCol + 1 ||
		   prevRow == newRow + 2 && prevCol == newCol - 1 ||
		   prevRow == newRow - 2 && prevCol == newCol + 1 ||
		   prevRow == newRow - 2 && prevCol == newCol - 1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "H";}
}
