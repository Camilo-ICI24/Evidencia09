package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import PrincipalCafeteria.Cafe;
import controller.CafeteriaController;

public class ListarCafeWindow extends JFrame {
    public ListarCafeWindow(CafeteriaController controller) {
        setTitle("Listar Cafés por Tamaño");
        setSize(600, 400);
        setLayout(null);
        JLabel lblTamaño = new JLabel("Tamaño:");
        JComboBox<String> cmbTamaño = new JComboBox<>(new String[]{"PEQUENO", "MEDIANO", "GRANDE"});
        JTable table = new JTable();
        DefaultTableModel tableModel = new DefaultTableModel(new String[]{"Código", "Nombre", "Gramos", "Mililitros", "Tamaño", "Ingrediente"}, 0);
        table.setModel(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        JButton btnListar = new JButton("Listar");

        lblTamaño.setBounds(20, 20, 100, 25);
        cmbTamaño.setBounds(130, 20, 150, 25);
        scrollPane.setBounds(20, 60, 540, 250);
        btnListar.setBounds(300, 20, 100, 25);

        add(lblTamaño);
        add(cmbTamaño);
        add(scrollPane);
        add(btnListar);

        btnListar.addActionListener(e -> {
            String tamaño = (String) cmbTamaño.getSelectedItem();
            try {
                List<Cafe> cafes = controller.obtenerCafePorTamano(tamaño);
                tableModel.setRowCount(0); // Limpiar tabla

                if (cafes.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No hay cafés de este tamaño.", "Información", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    for (Cafe cafe : cafes) {
                        tableModel.addRow(new Object[]{cafe.getCodigoIdentificador(), cafe.getNombreCafe(), cafe.getGramosCafe(), cafe.getMililitrosAgua(), cafe.getTamanoCafe(), cafe.getIngrediente()});
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al listar cafés: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
