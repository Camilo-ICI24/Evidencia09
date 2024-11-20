package gui;

import javax.swing.*;
import PrincipalCafeteria.Cafe;
import PrincipalCafeteria.Tamaño;
import PrincipalCafeteria.IngredientesCafe;
import controller.CafeteriaController;

public class AgregarCafeWindow extends JFrame {

    public AgregarCafeWindow(CafeteriaController controller) {
        setTitle("Agregar Café");
        setSize(450, 400);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblGramos = new JLabel("Gramos:");
        JLabel lblMililitros = new JLabel("Mililitros:");
        JLabel lblTamaño = new JLabel("Tamaño:");
        JLabel lblIngrediente = new JLabel("Ingrediente:");

        JTextField txtNombre = new JTextField();
        JTextField txtGramos = new JTextField();
        JTextField txtMililitros = new JTextField();
        JComboBox<String> cmbTamaño = new JComboBox<>(new String[]{"PEQUENO", "MEDIANO", "GRANDE"});
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
