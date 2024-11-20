package gui;

import javax.swing.*;

import PrincipalCafeteria.Cafe;
import PrincipalCafeteria.IngredientesCafe;
import PrincipalCafeteria.Tamaño;
import controller.CafeteriaController;

import java.awt.*;

public class EliminarCafeWindow extends JFrame {
    public EliminarCafeWindow(CafeteriaController controller) {
        setTitle("Eliminar Café");
        setSize(400, 200);
        setLayout(null);

        JLabel lblCodigo = new JLabel("Código del Café:");
        JTextField txtCodigo = new JTextField();

        JButton btnEliminar = new JButton("Eliminar");

        lblCodigo.setBounds(20, 20, 150, 25);
        txtCodigo.setBounds(180, 20, 150, 25);
        btnEliminar.setBounds(150, 70, 100, 25);

        add(lblCodigo);
        add(txtCodigo);
        add(btnEliminar);

        btnEliminar.addActionListener(e -> {
            try {
                int codigo = Integer.parseInt(txtCodigo.getText());
                if (controller.descontinuarCafe(codigo)) {
                    JOptionPane.showMessageDialog(this, "Café eliminado con éxito.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un café con ese código.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El código debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al eliminar café: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static class AgregarCafeWindow extends JFrame {
        public AgregarCafeWindow(CafeteriaController controller) {
            setTitle("Agregar Café");
            setSize(450, 400);
            setLayout(null);

            JLabel lblNombre = new JLabel("Nombre:");
            JLabel lblGramos = new JLabel("Gramos de café:");
            JLabel lblMililitros = new JLabel("Mililitros:");
            JLabel lblTamaño = new JLabel("Tamaño:");
            JLabel lblIngrediente = new JLabel("Ingrediente opcional:");

            JTextField txtNombre = new JTextField();
            JTextField txtGramos = new JTextField();
            JTextField txtMililitros = new JTextField();
            JComboBox<String> cmbTamaño = new JComboBox<>(new String[]{"PEQUEÑO", "MEDIANO", "GRANDE"});
            JComboBox<String> cmbIngrediente = new JComboBox<>(new String[]{"CHOCOLATE", "LECHE", "CREMA"});

            JButton btnAgregar = new JButton("Agregar");

            lblNombre.setBounds(20, 20, 100, 25);
            txtNombre.setBounds(150, 20, 200, 25);
            lblGramos.setBounds(20, 60, 100, 25);
            txtGramos.setBounds(150, 60, 200, 25);
            lblMililitros.setBounds(20, 100, 100, 25);
            txtMililitros.setBounds(150, 100, 200, 25);
            lblTamaño.setBounds(20, 140, 100, 25);
            cmbTamaño.setBounds(150, 140, 200, 25);
            lblIngrediente.setBounds(20, 180, 100, 25);
            cmbIngrediente.setBounds(150, 180, 200, 25);
            btnAgregar.setBounds(150, 240, 100, 25);

            add(lblNombre);
            add(txtNombre);
            add(lblGramos);
            add(txtGramos);
            add(lblMililitros);
            add(txtMililitros);
            add(lblTamaño);
            add(cmbTamaño);
            add(lblIngrediente);
            add(cmbIngrediente);
            add(btnAgregar);

            btnAgregar.addActionListener(e -> {
                try {
                    String nombre = txtNombre.getText();
                    int gramos = Integer.parseInt(txtGramos.getText());
                    int mililitros = Integer.parseInt(txtMililitros.getText());
                    Tamaño tamaño = Tamaño.valueOf(
                            cmbTamaño.getSelectedItem().toString().toUpperCase().replace("Ñ", "N")
                    );
                    IngredientesCafe ingrediente = IngredientesCafe.valueOf(
                            cmbIngrediente.getSelectedItem().toString().toUpperCase()
                    );

                    int codigo = controller.obtenerCantidadCafes() + 1;

                    boolean success = controller.agregarCafe(new Cafe(gramos, mililitros, tamaño, ingrediente, nombre, codigo));
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Café agregado con éxito.");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al agregar el café.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos donde corresponda.", "Error", JOptionPane.ERROR_MESSAGE);
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }

    public static class CafeteriaGUI extends JFrame {
        public CafeteriaGUI(CafeteriaController controller) {
            setTitle("Gestión de Cafetería");
            setSize(500, 400);
            setLayout(new GridLayout(5, 1, 10, 10)); // Espaciado entre botones

            JButton btnAgregarCafe = new JButton("Agregar Café");
            JButton btnListarCafe = new JButton("Listar Cafés por Tamaño");
            JButton btnEliminarCafe = new JButton("Eliminar Café");
            JButton btnModificarCafeteria = new JButton("Modificar Información");
            JButton btnSalir = new JButton("Salir");

            add(btnAgregarCafe);
            add(btnListarCafe);
            add(btnEliminarCafe);
            add(btnModificarCafeteria);
            add(btnSalir);

            btnAgregarCafe.addActionListener(e -> new AgregarCafeWindow(controller).setVisible(true));
            btnListarCafe.addActionListener(e -> new ListarCafeWindow(controller).setVisible(true));
            btnEliminarCafe.addActionListener(e -> new EliminarCafeWindow(controller).setVisible(true));
            btnModificarCafeteria.addActionListener(e -> new ModificarCafeteriaWindow(controller).setVisible(true));
            btnSalir.addActionListener(e -> System.exit(0));

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public static void main(String[] args) {
            CafeteriaController controller = new CafeteriaController();
            new CafeteriaGUI(controller).setVisible(true);
        }
    }
}
