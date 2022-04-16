package boardgame;

public class Board {
	// Atributos
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	// Construtores
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	// Getters e Setters
	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	// M�todos
}