import javax.swing.*;
import java.awt.*;

public class GameBoard extends JPanel {
    private JComboBox<String> cmbTimes;
    private JButton btnShow;
    private JTextArea txtArea;
    private JRadioButton rdoKmh;

    public GameBoard() {
        setPreferredSize(new Dimension(325, 300));
        setLayout(new BorderLayout());

        createComponents();
    }

    private void createComponents() {
        // taustavärv nuppudel
        Color background = new Color(177,250,239);
        // Loome kolm paneeli
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel centerPanel = new JPanel(new BorderLayout());
        JPanel rightPanel = new JPanel(); // Default on FlowLayout
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(background);
        rightPanel.setPreferredSize(new Dimension(100, 100));

        //  top paneel sisu
        JLabel lblTime = new JLabel("Mitu korda teeme?"); // Loo Label
        topPanel.add(lblTime); // Pane label topPanelile


        // Loome rippmenüü ja lisame numbrid 1-5
        cmbTimes = new JComboBox<>(new String[]{"1", "2", "3", "4", "5"});
        topPanel.add(cmbTimes);

        btnShow = new JButton("Näita");
        topPanel.add(btnShow);

        //top paneel sisu
        txtArea = new JTextArea(10,15);
        txtArea.setFont(new Font("Courier", Font.PLAIN, 14));
        centerPanel.add(new JScrollPane(txtArea));

        ButtonGroup btnGroup = new ButtonGroup(); // Raadionupp grupeerimiseks
        rdoKmh = new JRadioButton("Kmh"); //Esimene
        JRadioButton rdoMph = new JRadioButton("Mph");
        rdoMph = new JRadioButton("Mph"); // Teine
        rdoKmh.setSelected(true); //Raadio kmh on valitud
        rdoKmh.setBackground(background);
        rdoMph.setBackground(background);
        btnGroup.add(rdoKmh); //nupp lisamine
        btnGroup.add(rdoMph); //nupp lisamine
        rightPanel.add(rdoKmh); //nupp lisamine rightpanelile
        rightPanel.add(rdoMph); //nupp lisamine rightpanelile



        // Lisame gameboard-ile kolm paneeli
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(rightPanel, BorderLayout.EAST);

    } // Meetodi lõpp

    public JComboBox<String> getCmbTimes() {
        return cmbTimes;
    }

    public JButton getBtnShow() {
        return btnShow;
    }

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public JRadioButton getRdoKmh() {
        return rdoKmh;
    }

} // Klassi lõpp
