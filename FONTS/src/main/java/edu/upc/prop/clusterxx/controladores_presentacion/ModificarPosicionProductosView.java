package edu.upc.prop.clusterxx.controladores_presentacion;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Esta clase representa la vista para modificar la posición de productos.
 */
public class ModificarPosicionProductosView {
    JPanel panel;
    private Presentacion_Main controller;

    /**
     * Constructor de la vista ModificarPosicionProductosView.
     *
     * @param controller el controlador principal de la aplicación
     */
    public ModificarPosicionProductosView(Presentacion_Main controller) {
        this.controller = controller;
        ArrayList<String> productos = controller.get_productes();

        panel = new JPanel(new GridLayout(2, 2, 10, 10));
        if (productos.isEmpty()) {
            JOptionPane.showMessageDialog(controller, "No hay productos para modificar.");
            panel = null;
            return;
        }

        JComboBox<String> producto1Combo = new JComboBox<>(productos.toArray(new String[0]));
        JComboBox<String> producto2Combo = new JComboBox<>(productos.toArray(new String[0]));

        panel.add(new JLabel("Seleccione el primer producto:"));
        panel.add(producto1Combo);
        panel.add(new JLabel("Seleccione el segundo producto:"));
        panel.add(producto2Combo);

        int result = JOptionPane.showConfirmDialog(controller, panel, "Modificar Posición de Productos", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String producto1 = (String) producto1Combo.getSelectedItem();
            String producto2 = (String) producto2Combo.getSelectedItem();

            if (producto1.equals(producto2)) {
                JOptionPane.showMessageDialog(controller, "Seleccione dos productos diferentes.");
                controller.ModificarPosicionProductos();
            }

            int index1 = productos.indexOf(producto1);
            int index2 = productos.indexOf(producto2);

            controller.intercambiar_productes(index1, index2);
        }
        else {
            panel = null;
        }
    }

    /**
     * Obtiene el panel de la vista.
     *
     * @return el panel de la vista
     */
    JPanel getPanel() {
        return panel;
    }
}
