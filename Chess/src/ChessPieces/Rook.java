//Rook Class implements Pieces interface
package ChessPieces;

//Class rook object contains behaviors of rook class
public class Rook implements Pieces {
	
	private boolean isWhite;
	
	//Constructor
	public Rook(boolean isWhite) {
		this.isWhite = isWhite;
	}
	
	//Returns color
	public Boolean getColor() {
		return this.isWhite;
	}
	
	//Checks if the move is valid, if not valid, returns false
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol) {
		if((prevRow == newRow) ^ (prevCol == newCol)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "R";}

}
