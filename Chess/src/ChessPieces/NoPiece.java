package ChessPieces;

public class NoPiece implements Pieces {
	
	private Boolean isWhite;
	
	//Constructor
	public NoPiece() {
		this.isWhite = null;
	}
	
	//Returns color
	public Boolean getColor() {
		return this.isWhite;
	}
	
	public Boolean isValid(int a, int b, int c, int d) {
		return null;
	}
	
	@Override
	public String toString() {
		return "#";}
}
