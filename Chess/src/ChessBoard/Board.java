package ChessBoard;

import ChessPieces.*;

public class Board {
	
	private static Pieces mapArray[][];
	private Boolean isWhite = false;
	
	//Initialize Board Pieces
	public Board(Pieces mapArray[][]) {
		
		//Black Pieces get initialized
		if(isWhite == false) {
			
			Board.mapArray[0][0] = new Rook(isWhite);
			Board.mapArray[0][1] = new Bishop(isWhite);
			Board.mapArray[0][2] = new Knight(isWhite);
			Board.mapArray[0][3] = new Queen(isWhite);
			Board.mapArray[0][4] = new King(isWhite);
			Board.mapArray[0][5] = new Knight(isWhite);
			Board.mapArray[0][6] = new Bishop(isWhite);
			Board.mapArray[0][7] = new Rook(isWhite);
		
			for(int i = 0; i <= 7; i++) {
				Board.mapArray[1][i] = new Pawn(isWhite);
			}
		}
		
		//Initialized spaces with no pieces
		for(int i = 2; i <= 5; i ++)
			for (int j = 0; i <= 7; j ++) 
				Board.mapArray[i][j] =  new NoPiece();
		
		isWhite = true;
		//If white pieces
		if(isWhite == true) {
			Board.mapArray[7][0] = new Rook(isWhite);
			Board.mapArray[7][1] = new Bishop(isWhite);
			Board.mapArray[7][2] = new Knight(isWhite);
			Board.mapArray[7][3] = new Queen(isWhite);
			Board.mapArray[7][4] = new King(isWhite);
			Board.mapArray[7][5] = new Knight(isWhite);
			Board.mapArray[7][6] = new Bishop(isWhite);
			Board.mapArray[7][7] = new Rook(isWhite);
			
			for(int i = 0; i <= 7; i++) {
				Board.mapArray[6][i] = new Pawn(isWhite);
			}
		}
	}
	
	//Controls Moving each piece
	public static void movePiece(String coordinate) {
		
		//Changes string to characters
		char tempRow = coordinate.toLowerCase().charAt(0);
		int prevRow = ((int) tempRow) - 97;
		char prevCol = coordinate.charAt(1);
		char tempRow1 = coordinate.charAt(3);
		int newRow = ((int) tempRow1) - 97;
		char newCol = coordinate.charAt(4);
			
		//If the Color of the previous coordinate doesn't match color of new coordinate, go ahead and
		//Try to see if the move is valid
		if(mapArray[prevRow][prevCol].getColor() != mapArray[newRow][newCol].getColor()){
			//If the piece you are trying to move has a valid move given to them, move them.
			if(Board.mapArray[prevRow][prevCol].isValid(prevRow,prevCol,newRow,newCol)) {	
				switch(Board.mapArray[prevRow][prevCol].toString()){
					//Case of empty space
					case "#":
						System.out.println("Error, no piece here to move!");
						break;
					//Case of King
					case "K":
						//Creates a new king object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new King(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();
						break;
					//Case of Pawn
					case "P":
						//Creates a new pawn object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new Pawn(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();	
						break;
					//Case of Queen
					case "Q":
						//Creates a new queen object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new Queen(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();	
						break;
					//Case of Knight
					case "H":
						//Creates a new knight object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new Knight(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();	
						break;
					//Case of Rook
					case "R":
						//Creates a new rook object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new Rook(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();	
						break;
					//Case of Bishop
					case "B":
						//Creates a new bishop object and places it onto new spot, then places an empty spot onto previous spot.
						Board.mapArray[newRow][newCol] = new Bishop(Board.mapArray[prevRow][prevCol].getColor());
						Board.mapArray[prevRow][prevCol] = new NoPiece();	
						break;
				}	
			}
			else {
				System.out.println("Your move is not valid, please try a different move.");
			}
		}
		else {
			System.out.println("Error, you have tried to move a piece that you own onto another piece you own.");
		}
	}
}
