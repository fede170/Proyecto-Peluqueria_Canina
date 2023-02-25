package com.mycompany.peluqueriacanina.igu;

import com.mycompany.peluqueriacanina.logica.ControladoraLogica;
import com.mycompany.peluqueriacanina.logica.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    //variable objeto contLogica para tener acceso a la controladora
    ControladoraLogica contLogica = null; //siempre inicializar al menos con null cuando es en jframe
    
    public VerDatos() {
        //cuando se cree una nueva instancia de VerDatos me crea la instancia de la controladora
        contLogica = new ControladoraLogica();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Visualizacion de Datos");

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos de mascotas");

        btnEliminar.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\pngwing.com (6).png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\pngwing.com (7).png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\pngwing.com.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\pngwing.com (8).png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\ZNOT\\Descargas\\pngwing.com (9).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        cargarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //controla que la tabla no este vacia, getRowCOunt cuenta la cantidad de filas que tiene la tbala
        if(tablaMascotas.getRowCount() > 0){
            //controla que se haya seleccionado una fila, si el resultado es -1 significa que no hay nada seleccionado porque arranca
            //en 0. Si es distinto de -1 es decir 0, 1, 2, etc. entonces hago el proceso de obtener el id para eliminar
            if(tablaMascotas.getSelectedRow() != -1){//me trae la fila que haya seleccionado el usuario
                
                //asigna a numCliente el valor en la tabla mascota que este ubicado en la columna 0 de la fila seleccionada 
                //lo convierte en string y luego en long y lo guarda en la variable numCliente
                long numCliente = Long.parseLong(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                //mensaje de confirmacion para el borrado
                int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea borrar esta mascota?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    
                    //Llamo a la controladora de la logica
                    contLogica.borrarMascota(numCliente);
                    
                    //Vuelvo a cargar la tabla sin el registro eliminado, es como un refresh
                    cargarTabla();
                }
                
            }else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al eliminar");
            }
        }else {
            mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        //controla que la tabla no este vacia, getRowCOunt cuenta la cantidad de filas que tiene la tbala
        if(tablaMascotas.getRowCount() > 0){
            //controla que se haya seleccionado una fila, si el resultado es -1 significa que no hay nada seleccionado porque arranca
            //en 0. Si es distinto de -1 es decir 0, 1, 2, etc. entonces hago el proceso de obtener el id para editar
            if(tablaMascotas.getSelectedRow() != -1){//me trae la fila que haya seleccionado el usuario
                //asigna a numCliente el valor en la tabla mascota que este ubicado en la columna 0 de la fila seleccionada 
                //lo convierte en string y luego en long y lo guarda en la variable numCliente
                long numCliente = Long.parseLong(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                
                ModificarDatos modDatos = new ModificarDatos(numCliente);
                modDatos.setVisible(true);
                modDatos.setLocationRelativeTo(null);
                
                this.dispose();
                
            }else{
                mostrarMensaje("No selecciono ninguna mascota", "Error", "Error al editar");
            }
            
        }else {
            mostrarMensaje("No hay nada para editar en la tabla", "Error", "Error al editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo){
         
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        //Definir el modelo que queremos que tenga la tabla
        //clase especial que nos permite establecer un modelo para nuestra tabla, es decir ir agragandole cosas, ej: agregarles las 
        //columnas
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //hace que todas las celdas no sean editables(no podremos hacer clic en la celda y editar)
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        
        //Establecemos los nombres de las columnas
        String titulos [] = {"Num", "Nombre", "Color", "Raza", "Alergico", "At. Esp", "Nom. Dueño", "Cel."};
        
        //pone los nombres de arriba en las columnas
        modeloTabla.setColumnIdentifiers(titulos); 
        
        //traemos las mascotas de la logica y la logiaca se encarga de traer de la BD 
        //y guardamos en la lista y a cada elemento de la lista lo colocamos en la tabla
        List<Mascota> listaMascotas = contLogica.traerMascotas();
            
        //recorrer la lista y mostrar cada uno de los elementos en la tabla
        //preguntamos si la lista es distinto null, si es null(no tiene nada cargado) no vamos apoder hacer este proceso
        if(listaMascotas != null){
            for(Mascota masco : listaMascotas){
                //creamos un array de objetos con cada uno de los datos que tienen que coincidir con los que declaramos en el array de 
                //arriba
                //El array es de tipo objeto porque asi podemos guardar todos los tipos de datos de la mascota como int, string, etc
                Object[] objeto = {masco.getNumCliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), masco.getAlergico(),
                                    masco.getAtencionEspecial(), masco.getUnDuenio().getNombre(), masco.getUnDuenio().getCelDuenio()};
                
                //agragamos el obejeto con los datos de la mascota como fila a la tabla
                modeloTabla.addRow(objeto);
            }
        }
        //asigno todo lo de arriba a la tabla
        tablaMascotas.setModel(modeloTabla);
        
    }
}
