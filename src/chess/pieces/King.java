package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {
	// Construtores
	public King(Board board, Color color) {
		super(board, color);
	}
	
	// Métodos
	@Override
	public String toString() {
		return "K";
	}
}
