// programa: Juego de Gomoku en tablero 19x19
// versión: 20240424
// autor: Carlos Grasa Lambea

public interface ControlGomoku19 {
	// campos final
	int numFilas=19; // número de filas
	int numColumnas=19; // número de columnas
	int numCasillas=numFilas*numColumnas; // número de casillas
	int marcaVacia=0; // valor de casilla vacía
	int marcaA=1; // valor de casilla A
	int marcaB=-1; // valor de casilla B


	// métodos a implementar
	void pulsandoRaton(java.awt.event.MouseEvent evt);
	void pulsandoBoton(java.awt.event.ActionEvent evt);
	void ejecutarControl(); // programa principal de control
	void setEstado(String estado); // actualiza campo de estado
	void borrarCasillas(); // borrar las marcas de las casillas
	void marcarCasilla(javax.swing.JLabel casilla); // marca una casilla para un jugador
	void pintarCasilla(javax.swing.JLabel casilla); // pinta una casilla en el tablero para un jugador
	int getMarcaCasilla(javax.swing.JLabel casilla); // devuelve la marca de una casilla
	boolean comprobarVictoria(int ordinal); // comprueba si se ha alcanzado victoria al jugar en casilla ordinal
	boolean comprobar5enLinea(int ordinal, int xDelta, int yDelta); // busca 5 en raya centrado en casilla ordinal en dirección (xDelta, yDelta)
	void reiniciar(); // reinicia una nueva partida
	void limpiarTablero(); // establece todas las casillas con imagen vacía

	// métodos	default
	default void avisarModal(String mensaje) {
		javax.swing.JOptionPane.showMessageDialog(
				null,
				"" + mensaje,
				"Mensaje informativo",
				javax.swing.JOptionPane.INFORMATION_MESSAGE
		);
		return;
	}
	default void avisarModal(String mensaje, String titulo) {
		javax.swing.JOptionPane.showMessageDialog(
				null,
				"" + mensaje,
				titulo,
				javax.swing.JOptionPane.INFORMATION_MESSAGE
		);
		return;
	}
	default int getOrdinalCasilla(javax.swing.JLabel casilla) {
		return casilla.getY()/21*numColumnas+casilla.getX()/21;
	}
	default int filaColumnaToOrdinal(int fila, int columna) {
		return fila*numColumnas+columna;
	}
	default int ordinalToFila(int ordinal) {
		return ordinal/numColumnas;
	}
	default int ordinalToColumna(int ordinal) {
		return ordinal%numColumnas;
	}
	default int limitarTablero(int posicion, int longitud) { // devuelve posición corregida no inferior a cero, inferior a longitud
		return posicion<0 ? 0 : posicion>longitud-1 ? longitud-1 : posicion;
	}
}
