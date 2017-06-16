package jogo;

import javax.swing.JFrame;

import jplay.Window;

@SuppressWarnings("serial")
public class Home extends javax.swing.JPanel {
	
	Window janela;
	JFrame pgHome;
	
    public Home(Window window, JFrame home) {
    	janela = window;
    	pgHome = home;
        initComponents();
    }
                     
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        panelPersonagem = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        panelCreate = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblMundo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxGenero = new javax.swing.JComboBox<>();
        boxClasse = new javax.swing.JComboBox<>();
        boxMundos = new javax.swing.JComboBox<>();
        imgPersonagem = new javax.swing.JPanel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        panelPersonagem.setBackground(new java.awt.Color(153, 153, 153));
        panelPersonagem.setPreferredSize(new java.awt.Dimension(800, 600));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 51, 0));
        lblTitle.setText("CRIE SEU PRIMEIRO PERSONAGEM ABAIXO :");

        btnCreate.setBackground(new java.awt.Color(51, 204, 0));
        btnCreate.setText("CRIAR");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18));
        lblName.setText("Nome:");

        lblGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        lblGenero.setText("Gênero:");

        lblMundo.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        lblMundo.setText("Mundo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        jLabel5.setText("Classe:");

        boxGenero.setMaximumRowCount(6);
        boxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humanos", "Marcianos", "Venusianos", "Vampiro", "Zumbi", "Elfo" }));

        boxClasse.setMaximumRowCount(2);
        boxClasse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", " " }));

        boxMundos.setMaximumRowCount(3);
        boxMundos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terra", "Polux", "Vênus" }));

        imgPersonagem.setToolTipText("");

        javax.swing.GroupLayout imgPersonagemLayout = new javax.swing.GroupLayout(imgPersonagem);
        imgPersonagem.setLayout(imgPersonagemLayout);
        imgPersonagemLayout.setHorizontalGroup(
            imgPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );
        imgPersonagemLayout.setVerticalGroup(
            imgPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 129, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCreateLayout = new javax.swing.GroupLayout(panelCreate);
        panelCreate.setLayout(panelCreateLayout);
        panelCreateLayout.setHorizontalGroup(
            panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCreateLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addComponent(lblMundo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxMundos, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCreateLayout.createSequentialGroup()
                                .addComponent(txtName)
                                .addGap(24, 24, 24))
                            .addGroup(panelCreateLayout.createSequentialGroup()
                                .addComponent(boxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(panelCreateLayout.createSequentialGroup()
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(imgPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCreateLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCreateLayout.setVerticalGroup(
            panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCreateLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(boxClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(panelCreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMundo)
                    .addComponent(boxMundos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imgPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPersonagemLayout = new javax.swing.GroupLayout(panelPersonagem);
        panelPersonagem.setLayout(panelPersonagemLayout);
        panelPersonagemLayout.setHorizontalGroup(
            panelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonagemLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addGroup(panelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(123, 123, 123))
        );
        panelPersonagemLayout.setVerticalGroup(
            panelPersonagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonagemLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String[] personagem = new String[4];
        personagem[0] = txtName.getText();
        personagem[1] = boxGenero.getItemAt(boxGenero.getSelectedIndex());
        personagem[2] = boxClasse.getItemAt(boxClasse.getSelectedIndex());
        personagem[3] = boxMundos.getItemAt(boxMundos.getSelectedIndex());
        
        Principal.inicializa(personagem, pgHome, janela);
                
    }                                         
                   
    private javax.swing.JComboBox<String> boxClasse;
    private javax.swing.JComboBox<String> boxGenero;
    private javax.swing.JComboBox<String> boxMundos;
    private javax.swing.JButton btnCreate;
    private javax.swing.JPanel imgPersonagem;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMundo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelCreate;
    private javax.swing.JPanel panelPersonagem;
    private javax.swing.JTextField txtName;
    
}
