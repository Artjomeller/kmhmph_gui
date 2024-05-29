import javax.swing.*;

public class App {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(); // Tee JFrame
        // JFrame view = new JFrame(); view.setTitle("Tekst");
        new Controller(model, view);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.pack(); // "Raputa" komponendid kohale
        view.setLocationRelativeTo(null); // Ekraani keskele
        view.setVisible(true); // Teeb JFrame nähtavaks
    }
}
