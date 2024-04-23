// programa: Juego de Gomoku en tablero 19x19
// versión: 20240424
// autor: Carlos Grasa Lambea

public interface ControlGomoku19 {
	// campos final

	// métodos a implementar
	void pulsandoRaton(java.awt.event.MouseEvent evt);
	void pulsandoBoton(java.awt.event.ActionEvent evt);
	void ejecutarControl(); // programa principal de control
	void setEstado(String estado); // actualiza campo de estado

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

}
