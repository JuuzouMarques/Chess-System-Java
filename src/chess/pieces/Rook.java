package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	// Construtores
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	// Métodos
	@Override
	public String toString() {
		return "R";
	}
}
