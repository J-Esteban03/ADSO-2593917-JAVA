import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Triki extends JFrame {

    private char[][] tablero = new char[3][3];
    private JLabel[][] etiqueta = new JLabel[3][3];
    private boolean turnojugar = true;

    public Triki() {
        setTitle("Triqui");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel boardPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;

        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = '-';
                etiqueta[fila][col] = new JLabel("", SwingConstants.CENTER);
                etiqueta[fila][col].setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
                etiqueta[fila][col].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                constraints.gridx = col;
                constraints.gridy = fila;
                boardPanel.add(etiqueta[fila][col], constraints);
                etiqueta[fila][col].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JLabel label = (JLabel) e.getSource();
                        int fila = -1, col = -1;
                        for (int i = 0; i < 3; i++) {
                            for (int j = 0; j < 3; j++) {
                                if (label == etiqueta[i][j]) {
                                    fila = i;
                                    col = j;
                                }
                            }
                        }
                        if (fila != -1 && col != -1) {
                            if (tablero[fila][col] == '-') {
                                if (turnojugar) {
                                    tablero[fila][col] = 'X';
                                    label.setText("X");
                                    label.setForeground(Color.BLUE);
                                    if (verificarganador('X')) {
                                        JOptionPane.showMessageDialog(Triki.this, "¡Ganaste!");
                                        resectiar();
                                    } else if (tablerolleno()) {
                                        JOptionPane.showMessageDialog(Triki.this, "¡Empate!");
                                        resectiar();
                                    } else {
                                        turnojugar = false;
                                        turnopc();
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }

        add(boardPanel);
        setVisible(true);
    }

    private void resectiar() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 3; col++) {
                tablero[fila][col] = '-';
                etiqueta[fila][col].setText("");
            }
        }
        turnojugar = true;
    }

	private boolean verificarganador(char player) {
		for (int i = 0; i < 3; i++) {
			if (tablero[i][0] == player && tablero[i][1] == player && tablero[i][2] == player) {
				return true;
			}
			if (tablero[0][i] == player && tablero[1][i] == player && tablero[2][i] == player) {
				return true;
			}
		}
		if (tablero[0][0] == player && tablero[1][1] == player && tablero[2][2] == player) {
			return true;
		}
		if (tablero[0][2] == player &&tablero[1][1] == player && tablero[2][0] == player) {
			return true;
		}
		return false;
	}

	private boolean tablerolleno() {
		for (int fila = 0; fila < 3; fila++) {
			for (int col = 0; col < 3; col++) {
				if (tablero[fila][col] == '-') {
					return false;
				}
			}
		}
		return true;
	}

	private void turnopc() {
		int fila = -1, col = -1;
		do {
			fila = (int) (Math.random() * 3);
			col = (int) (Math.random() * 3);
		} while (tablero[fila][col] != '-');
		tablero[fila][col] = 'O';
		etiqueta[fila][col].setText("O");
		etiqueta[fila][col].setForeground(Color.RED);
		if (verificarganador('O')) {
			JOptionPane.showMessageDialog(Triki.this, "¡Perdiste!");
			resectiar();
		} else if (tablerolleno()) {
			JOptionPane.showMessageDialog(Triki.this, "¡Empate!");
			resectiar();
		} else {
			turnojugar = true;
		}
	}

}