package boardgame;

public class Piece {
	// Atributos
	protected Position position;
	private Board board;
	
	// Construtores
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	// Getters e Setters
	protected Board getBoard() {
		return board;
	}
	
	// Métodos
}
