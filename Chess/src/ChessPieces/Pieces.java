package ChessPieces;

public interface Pieces {
	
	public Boolean getColor();
	
	public Boolean isValid(int prevRow, int prevCol , int newRow, int newCol);
	
	@Override
	public String toString();
}
