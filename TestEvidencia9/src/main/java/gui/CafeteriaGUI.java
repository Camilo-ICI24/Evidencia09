package gui;

import javax.swing.*;
import java.awt.*;
import controller.CafeteriaController;

public class CafeteriaGUI extends JFrame {
    public CafeteriaGUI(CafeteriaController controller) {
        //Lamento por quien hara los test de esto, yo solo segui adelante con fe y resulto. Buena suerte
        setTitle("Gestión de Cafetería");
        setSize(500, 500);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel lblImagen = new JLabel();
        try {
            ImageIcon icono = new ImageIcon(getClass().getClassLoader().getResource("cafe.png"));
            Image imagen = icono.getImage().getScaledInstance(200, 100, Image.SCALE_SMOOTH);
            lblImagen.setIcon(new ImageIcon(imagen));

        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
        }
        lblImagen.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btnAgregarCafe = new JButton("Agregar Café");
        JButton btnListarCafe = new JButton("Listar Cafés por Tamaño");
        JButton btnEliminarCafe = new JButton("Eliminar Café");
        JButton btnModificarCafeteria = new JButton("Modificar Información");
        JButton btnSalir = new JButton("Salir");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(lblImagen, gbc);

        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        add(btnAgregarCafe, gbc);

        gbc.gridx = 1;
        add(btnListarCafe, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        add(btnEliminarCafe, gbc);

        gbc.gridx = 1;
        add(btnModificarCafeteria, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        add(btnSalir, gbc);

        btnAgregarCafe.addActionListener(e -> new AgregarCafeWindow(controller).setVisible(true));
        btnListarCafe.addActionListener(e -> new ListarCafeWindow(controller).setVisible(true));
        btnEliminarCafe.addActionListener(e -> new EliminarCafeWindow(controller).setVisible(true));
        btnModificarCafeteria.addActionListener(e -> new ModificarCafeteriaWindow(controller).setVisible(true));
        btnSalir.addActionListener(e -> System.exit(0));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        CafeteriaController controller = new CafeteriaController();
        SwingUtilities.invokeLater(() -> {
            CafeteriaGUI gui = new CafeteriaGUI(controller);
            gui.setVisible(true);
        });
    }
}
