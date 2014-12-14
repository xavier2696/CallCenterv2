/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package callcenterv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author xavier2696
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventana_pregunta = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_pregunta2 = new javax.swing.JTextArea();
        label_nombre = new javax.swing.JLabel();
        boton_detener = new javax.swing.JButton();
        boton_si = new javax.swing.JButton();
        boton_no = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        boton_encuesta = new javax.swing.JButton();
        label_pregunta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_pregunta = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        barra_menu = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        menu_cargarnombres = new javax.swing.JMenuItem();
        menu_generarrelaciones = new javax.swing.JMenuItem();
        menu_guardarrelaciones = new javax.swing.JMenuItem();
        menu_cargarrelaciones = new javax.swing.JMenuItem();

        ventana_pregunta.setMinimumSize(new java.awt.Dimension(480, 320));
        ventana_pregunta.getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/callcenterv2/call_center.gif"))); // NOI18N
        jLabel2.setText("jLabel2");
        ventana_pregunta.getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 106, 129);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        ta_pregunta2.setEditable(false);
        ta_pregunta2.setColumns(20);
        ta_pregunta2.setRows(5);
        jScrollPane2.setViewportView(ta_pregunta2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(170, 90, 166, 96);

        label_nombre.setText("jLabel1");
        jPanel2.add(label_nombre);
        label_nombre.setBounds(170, 40, 200, 20);

        boton_detener.setBackground(new java.awt.Color(0, 153, 153));
        boton_detener.setForeground(new java.awt.Color(255, 255, 255));
        boton_detener.setText("Detener");
        boton_detener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_detenerActionPerformed(evt);
            }
        });
        jPanel2.add(boton_detener);
        boton_detener.setBounds(220, 240, 100, 23);

        boton_si.setBackground(new java.awt.Color(0, 153, 153));
        boton_si.setForeground(new java.awt.Color(255, 255, 255));
        boton_si.setText("Si");
        boton_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_siActionPerformed(evt);
            }
        });
        jPanel2.add(boton_si);
        boton_si.setBounds(120, 200, 70, 23);

        boton_no.setBackground(new java.awt.Color(0, 153, 153));
        boton_no.setForeground(new java.awt.Color(255, 255, 255));
        boton_no.setText("No");
        boton_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_noActionPerformed(evt);
            }
        });
        jPanel2.add(boton_no);
        boton_no.setBounds(340, 200, 70, 23);

        ventana_pregunta.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 480, 320);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton_encuesta.setBackground(new java.awt.Color(0, 153, 153));
        boton_encuesta.setForeground(new java.awt.Color(255, 255, 255));
        boton_encuesta.setText("Iniciar Encuesta");
        boton_encuesta.setEnabled(false);
        boton_encuesta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_encuestaMouseClicked(evt);
            }
        });
        boton_encuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_encuestaActionPerformed(evt);
            }
        });

        label_pregunta.setText("Pregunta:");

        ta_pregunta.setColumns(20);
        ta_pregunta.setRows(5);
        jScrollPane1.setViewportView(ta_pregunta);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/callcenterv2/call.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        menu_archivo.setText("Archivo");

        menu_cargarnombres.setText("Cargar Nombres");
        menu_cargarnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cargarnombresActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_cargarnombres);

        menu_generarrelaciones.setText("Generar Relaciones");
        menu_generarrelaciones.setEnabled(false);
        menu_generarrelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_generarrelacionesActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_generarrelaciones);

        menu_guardarrelaciones.setText("Guardar Relaciones");
        menu_guardarrelaciones.setEnabled(false);
        menu_guardarrelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_guardarrelacionesActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_guardarrelaciones);

        menu_cargarrelaciones.setText("Cargar Relaciones");
        menu_cargarrelaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cargarrelacionesActionPerformed(evt);
            }
        });
        menu_archivo.add(menu_cargarrelaciones);

        barra_menu.add(menu_archivo);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(label_pregunta)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(label_pregunta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(boton_encuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_cargarnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cargarnombresActionPerformed
        // TODO add your handling code here:
        
        File archivo = null;
        relaciones = new TDAGrafo();
        try{
            JFileChooser jfc = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos","txt");
            jfc.setFileFilter(filtro);
            int op = jfc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION){
                archivo = jfc.getSelectedFile();
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null){
                    TDAGrafo.Vertice v1 = relaciones.new Vertice(linea);
                    relaciones.addVertex(v1);
                }
                menu_generarrelaciones.setEnabled(true);
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_menu_cargarnombresActionPerformed

    private void menu_generarrelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_generarrelacionesActionPerformed
        // TODO add your handling code here:
        relaciones.setRelations();
        siguiente  = relaciones.MostRelated();
            siguiente.visitado = true;
            //System.out.println(siguiente.data);
        /*for(int i = 0; i<relaciones.getVertexCount(); i++){
            for(int j = 0; j<relaciones.getVertexCount(); j++){
                System.out.print("["+relaciones.relaciones[i][j]+"]");
            }
            System.out.println("");
        }*/
        menu_guardarrelaciones.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Se han generado las relaciones aleatorias");
        boton_encuesta.setEnabled(true);
    }//GEN-LAST:event_menu_generarrelacionesActionPerformed

    private void boton_encuestaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_encuestaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_encuestaMouseClicked

    private void boton_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_siActionPerformed
        // TODO add your handling code here:
        contadorsi++;
        TDAGrafo.Vertice anterior = siguiente;
        siguiente = relaciones.RandomVertex(siguiente);
        ArrayList<TDAGrafo.Vertice> adyacentes = relaciones.getAdjacentVertices(anterior);
        boolean has_adjacent = true;
        while(siguiente.visitado && has_adjacent){
            has_adjacent = false;            
            for(int i = 0 ; i<adyacentes.size(); i++){
                if(!adyacentes.get(i).visitado){
                    has_adjacent = true;
                }                
            }
            siguiente = relaciones.RandomVertex(anterior);
        }
        if(has_adjacent){
            siguiente.visitado = true;
            label_nombre.setText(siguiente.getData());
        }else{
            JOptionPane.showMessageDialog(this, "Se realizo la encuesta correctamente \n"
                    + "Si: "+contadorsi+"\n"
                    + "No: "+contadorno);
            contadorsi = 0;
            contadorno = 0;
        }
    }//GEN-LAST:event_boton_siActionPerformed

    private void boton_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_noActionPerformed
        // TODO add your handling code here:
        contadorno++;
        TDAGrafo.Vertice anterior = siguiente;
        siguiente = relaciones.RandomVertex(siguiente);
        ArrayList<TDAGrafo.Vertice> adyacentes = relaciones.getAdjacentVertices(anterior);
        boolean has_adjacent = true;
        while(siguiente.visitado && has_adjacent){
            has_adjacent = false;            
            for(int i = 0 ; i<adyacentes.size(); i++){
                if(!adyacentes.get(i).visitado){
                    has_adjacent = true;
                }                
            }
            siguiente = relaciones.RandomVertex(anterior);
        }
        if(has_adjacent){
            siguiente.visitado = true;
            label_nombre.setText(siguiente.getData());
        }else{
            JOptionPane.showMessageDialog(this, "Se realizo la encuesta correctamente \n"
                    + "Si: "+contadorsi+"\n"
                    + "No: "+contadorno);
            contadorsi = 0;
            contadorno = 0;
        }
    }//GEN-LAST:event_boton_noActionPerformed

    private void boton_encuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_encuestaActionPerformed
        // TODO add your handling code here:
        
        label_nombre.setText(siguiente.getData());
        ta_pregunta2.setText(ta_pregunta.getText());
        this.setVisible(false);
        ventana_pregunta.pack();
        ventana_pregunta.setLocation(this.getLocation());
        ventana_pregunta.setVisible(true);
        ventana_pregunta.setModal(true);
    }//GEN-LAST:event_boton_encuestaActionPerformed

    private void boton_detenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_detenerActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Se realizo la encuesta correctamente \n"
                    + "Si: "+contadorsi+"\n"
                    + "No: "+contadorno);
        contadorsi=0;
        contadorno=0;
        ventana_pregunta.setModal(false);
        ventana_pregunta.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_boton_detenerActionPerformed

    private void menu_guardarrelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_guardarrelacionesActionPerformed
        // TODO add your handling code here:
        ArrayList<TDAGrafo.Vertice> vertices = relaciones.getVertices();
        FileWriter salida1 = null;
        BufferedWriter bw = null;
        File archivo = null;
        try {
            JFileChooser jfc = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos","txt");
            jfc.setFileFilter(filtro);
            int op = jfc.showSaveDialog(this);
            if (op == JFileChooser.APPROVE_OPTION){                
                archivo = new File(jfc.getSelectedFile().getPath() + ".txt");
                salida1 = new FileWriter(archivo, true);
                bw = new BufferedWriter(salida1);                        
                for (int i = 0; i < vertices.size(); i++) {
                    ArrayList<TDAGrafo.Vertice> adyacents = relaciones.getAdjacentVertices(vertices.get(i));
                    for (int j = 0; j < adyacents.size(); j++) {
                        String relacion = vertices.get(i).getData() + "-" + adyacents.get(j).getData();
                        bw.write(relacion);
                        bw.newLine();
                        
                    }
                }
                bw.flush();
                JOptionPane.showMessageDialog(this, "Se ha creado el archivo");
            }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
            try {
                bw.close();
                salida1.close();                
            } catch (Exception e1) {
            }
        }
    }//GEN-LAST:event_menu_guardarrelacionesActionPerformed

    private void menu_cargarrelacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cargarrelacionesActionPerformed
        // TODO add your handling code here:
        File archivo = null;
        relaciones = new TDAGrafo();
        try{
            JFileChooser jfc = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("Archivos","txt");
            jfc.setFileFilter(filtro);
            int op = jfc.showOpenDialog(this);
            if (op == JFileChooser.APPROVE_OPTION){
                archivo = jfc.getSelectedFile();
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null){
                    String[] personas = linea.split("-");
                    TDAGrafo.Vertice v1 = relaciones.new Vertice(personas[0]);
                    TDAGrafo.Vertice v2 = relaciones.new Vertice(personas[1]);
                    relaciones.addVertex(v1);
                    relaciones.addVertex(v2);
                    if (!relaciones.addVertex(v1) || !relaciones.addVertex(v2)) {
                    for (int i = 0; i < relaciones.vertices.size(); i++) {
                        if (v1.equals(relaciones.vertices.get(i))) {
                            v1 = relaciones.vertices.get(i);
                        }
                        if (v2.equals(relaciones.vertices.get(i))) {
                            v2 = relaciones.vertices.get(i);
                        }
                    }

                }
                relaciones.addEdge(v1, v2);
                }
                
                JOptionPane.showMessageDialog(this, "Se ha cargado el archivo");
                System.out.println("");
                /*for (int i = 0; i < relaciones.getVertexCount(); i++) {
                    for (int j = 0; j < relaciones.getVertexCount(); j++) {
                        System.out.print("[" + relaciones.relaciones[i][j] + "]");
                    }
                    System.out.println("");
                }*/
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocurrio un error");
            e.printStackTrace();
        }
        siguiente  = relaciones.MostRelated();
        menu_generarrelaciones.setEnabled(true);
        menu_guardarrelaciones.setEnabled(true);
        boton_encuesta.setEnabled(true);
    }//GEN-LAST:event_menu_cargarrelacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JButton boton_detener;
    private javax.swing.JButton boton_encuesta;
    private javax.swing.JButton boton_no;
    private javax.swing.JButton boton_si;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_pregunta;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenuItem menu_cargarnombres;
    private javax.swing.JMenuItem menu_cargarrelaciones;
    private javax.swing.JMenuItem menu_generarrelaciones;
    private javax.swing.JMenuItem menu_guardarrelaciones;
    private javax.swing.JTextArea ta_pregunta;
    private javax.swing.JTextArea ta_pregunta2;
    private javax.swing.JDialog ventana_pregunta;
    // End of variables declaration//GEN-END:variables
TDAGrafo relaciones = new TDAGrafo();
int contadorsi = 0;
int contadorno = 0;
TDAGrafo.Vertice siguiente;
}
