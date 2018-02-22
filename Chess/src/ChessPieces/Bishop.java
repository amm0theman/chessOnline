package ChessPieces;

//Bishop Object Class
public class Bishop implements Pieces {

	private Boolean isWhite;
	
	//Constructor for bishop
	public Bishop(Boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//returns color of piece
	public Boolean getColor() {
		return this.isWhite;
	}
	
	//checks if move made by player is valid for this piece
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		if((prevRow != newRow) ^ (prevCol != newCol)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "B";}

}
