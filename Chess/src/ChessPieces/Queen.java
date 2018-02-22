package ChessPieces;

public class Queen implements Pieces{
	
	private Boolean isWhite;
	
	//Constructor
	public Queen(Boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//Returns color
	public Boolean getColor() {
		return this.isWhite;
	}
	
	//Checks to see if move for ths piece is valid
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		if((prevRow == newRow) ^ (prevCol == newCol) || (prevRow != newRow) ^ (prevCol != newCol) ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Q";}
}
