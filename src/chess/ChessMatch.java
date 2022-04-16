package chess;

import boardgame.Board;

public class ChessMatch {
	// Atributos
	private Board board;
	
	// Construtores
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	// Getters and Setters
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	// M�todos
}