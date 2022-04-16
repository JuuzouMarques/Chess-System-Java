package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	// Atributos
	private Color color;
	
	// Construtor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
	// Getters and Setters
	public Color getColor() {
		return color;
	}
	
}
