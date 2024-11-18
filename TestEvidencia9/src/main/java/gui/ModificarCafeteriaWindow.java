package gui;

import javax.swing.*;
import controller.CafeteriaController;

public class ModificarCafeteriaWindow extends JFrame {
    public ModificarCafeteriaWindow(CafeteriaController controller) {
        setTitle("Modificar Información de la Cafetería");
        setSize(450, 400);
        setLayout(null);

        JLabel lblNombre = new JLabel("Nombre:");
        JLabel lblDireccion = new JLabel("Dirección:");
        JLabel lblFacebook = new JLabel("Facebook:");
        JLabel lblInstagram = new JLabel("Instagram:");
        JLabel lblTelefono = new JLabel("Teléfono:");

        JTextField txtNombre = new JTextField();
        JTextField txtDireccion = new JTextField();
        JTextField txtFacebook = new JTextField();
        JTextField txtInstagram = new JTextField();
        JTextField txtTelefono = new JTextField();

        JButton btnGuardar = new JButton("Guardar");

        lblNombre.setBounds(20, 20, 100, 25);
        txtNombre.setBounds(150, 20, 250, 25);
        lblDireccion.setBounds(20, 60, 100, 25);
        txtDireccion.setBounds(150, 60, 250, 25);
        lblFacebook.setBounds(20, 100, 100, 25);
        txtFacebook.setBounds(150, 100, 250, 25);
        lblInstagram.setBounds(20, 140, 100, 25);
        txtInstagram.setBounds(150, 140, 250, 25);
        lblTelefono.setBounds(20, 180, 100, 25);
        txtTelefono.setBounds(150, 180, 250, 25);
        btnGuardar.setBounds(150, 240, 100, 25);

        add(lblNombre);
        add(txtNombre);
        add(lblDireccion);
        add(txtDireccion);
        add(lblFacebook);
        add(txtFacebook);
        add(lblInstagram);
        add(txtInstagram);
        add(lblTelefono);
        add(txtTelefono);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            try {
                String nombre = txtNombre.getText();
                String direccion = txtDireccion.getText();
                String facebook = txtFacebook.getText();
                String instagram = txtInstagram.getText();
                int telefono = Integer.parseInt(txtTelefono.getText());

                if (controller.modificarCafeteria(nombre, direccion, facebook, instagram, telefono)) {
                    JOptionPane.showMessageDialog(this, "Información actualizada con éxito.");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar la información.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El teléfono debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al actualizar la información: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
