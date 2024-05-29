import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private final GameBoard gameBoard;

    public View() {
        super("Kmh <-> Mph"); // JFrame konstruktor
        // setResizable(false); - Akna suurust Frame muuta ei saa
        gameBoard = new GameBoard(); // Loome "mängulaua"

        JPanel container = new JPanel(new BorderLayout());
        // container peale pane gameboard
        container.add(gameBoard, BorderLayout.CENTER);

        this.add(container); // lisa container Jframe peale
    }
    // Registreerime  nupu  Näita
    public void registerButtonListener(ActionListener actionListener) {
        gameBoard.getBtnShow().addActionListener(actionListener);
    }

    public JComboBox<String> getCmbTimes() {
        return gameBoard.getCmbTimes();
    }

    public JTextArea getTxtArea() {
        return gameBoard.getTxtArea();
    }

    public JRadioButton getRdoKmh() {
        return gameBoard.getRdoKmh();
    }

}
