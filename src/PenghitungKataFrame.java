public class PenghitungKataFrame extends javax.swing.JFrame {

   
   public PenghitungKataFrame() {
    initComponents();

   
}

    
    // ============ METHOD LOGIKA ============

private void hitungSemua() {
    // HANYA BACA teks, JANGAN setText di sini
    String text = txtInput.getText();

    // hitung karakter
    int jumlahKarakter = text.length();

    // buang spasi di awal/akhir
    String trimmed = text.trim();

    // hitung kata
    int jumlahKata = 0;
    if (!trimmed.isEmpty()) {
        String[] words = trimmed.split("\\s+");
        jumlahKata = words.length;
    }

    // hitung kalimat
    int jumlahKalimat = 0;
    if (!trimmed.isEmpty()) {
        String[] sentences = trimmed.split("[.!?]+");
        for (String s : sentences) {
            if (!s.trim().isEmpty()) {
                jumlahKalimat++;
            }
        }
    }

    // hitung paragraf
    int jumlahParagraf = 0;
    if (!trimmed.isEmpty()) {
        String[] paras = trimmed.split("\\r?\\n+");
        for (String p : paras) {
            if (!p.trim().isEmpty()) {
                jumlahParagraf++;
            }
        }
    }

  
    lblKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
    lblKata.setText("Jumlah Kata: " + jumlahKata);
    lblKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);
    lblParagraf.setText("Jumlah Paragraf: " + jumlahParagraf);
}

 
private void cariKata() {
    String text = txtInput.getText().toLowerCase();
    String dicari = txtCari.getText().toLowerCase().trim();

    if (dicari.isEmpty()) {
        lblHasilCari.setText("Muncul: 0 kali");
        return;
    }

    String[] words = text.split("\\s+");
    int count = 0;
    for (String w : words) {
        if (w.equals(dicari)) {
            count++;
        }
    }

    lblHasilCari.setText("Muncul: " + count + " kali");
}

private void simpanKeFile() {
    javax.swing.JFileChooser chooser = new javax.swing.JFileChooser();
    int result = chooser.showSaveDialog(this);
    if (result == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File file = chooser.getSelectedFile();
        try (java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(file))) {
            bw.write("Teks:\n");
            bw.write(txtInput.getText());
            bw.write("\n\nHASIL PERHITUNGAN:\n");
            bw.write(lblKata.getText() + "\n");
            bw.write(lblKarakter.getText() + "\n");
            bw.write(txtInput.getText() + "\n");
            bw.write(lblParagraf.getText() + "\n");
            javax.swing.JOptionPane.showMessageDialog(this, "Berhasil disimpan!");
        } catch (java.io.IOException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Gagal menyimpan: " + ex.getMessage());
        }
    }
    
}

    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        JPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnHitung = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        lblHasilCari = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        lblKata = new javax.swing.JLabel();
        lblKalimat = new javax.swing.JLabel();
        lblKarakter = new javax.swing.JLabel();
        lblParagraf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        txtInput.setColumns(20);
        txtInput.setLineWrap(true);
        txtInput.setRows(5);
        txtInput.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtInput);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel2.setText("Cari kata:");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        lblHasilCari.setText("Muncul: 0 kali");

        btnSimpan.setText("Simpan ke File");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHasilCari))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSimpan)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(jLabel2)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(lblHasilCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSimpan)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        lblKata.setText("Jumlah Kata: 0");

        lblKalimat.setText("Jumlah Kalimat: 0");

        lblKarakter.setText("Jumlah Karakter: 0");

        lblParagraf.setText("Jumlah Paragraf: 0");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Aplikasi Penghitung Kata");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKata)
                    .addComponent(lblKalimat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblParagraf)
                    .addComponent(lblKarakter))
                .addGap(81, 81, 81))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKata)
                    .addComponent(lblKarakter))
                .addGap(18, 18, 18)
                .addGroup(JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKalimat)
                    .addComponent(lblParagraf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(JPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungSemua();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cariKata();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        simpanKeFile();
    }//GEN-LAST:event_btnSimpanActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new PenghitungKataFrame().setVisible(true);
        }
    });
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel2;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHasilCari;
    private javax.swing.JLabel lblKalimat;
    private javax.swing.JLabel lblKarakter;
    private javax.swing.JLabel lblKata;
    private javax.swing.JLabel lblParagraf;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
}
