
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junior Moreira
 */
public class Tela extends javax.swing.JFrame {

    public static boolean Vit1 = false;
    public static boolean Vit2 = false;
    public static boolean Vez1 = true;
    public static boolean Vez2 = false;
    public static boolean Desabilitar = false;   
    public static boolean Habilitar = true;
    public static int vitoria1, vitoria2, emp;
    public static String jogador1 = "X";
    public static String jogador2 = "O"; 
    
    public void VVenc(){
        if (Vit1==true){
            vitoria1 = vitoria1 + 1;
            VitoriasJ1.setText(String.valueOf(vitoria1));
        }
        if (Vit2==true){
            vitoria2 = vitoria2 + 1;
            VitoriasJ2.setText(String.valueOf(vitoria2));
        }        
    }
    
    public void lblvez(){
        if (Vez1==true){
            VezL.setText("Jogador 1");
        }
        if (Vez2==true){
            VezL.setText("Jogador 2");
        }        
    }
    
    public void EscVez(){
        if (Vez1==true){
            Vez2 = true;
            Vez1 = false;
            Verificacao("X");
        }else{
            Vez1 = true;
            Vez2 = false;
            Verificacao("O");
        }
       lblvez(); 
    }
    
    public void Verificacao(String Jogador){
        
        //JOGADOR 1
            //HORIZONTAL
               if (Botao1.getText().equals("X")&& (Botao2.getText().equals("X")) && (Botao3.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao4.getText().equals("X")&& (Botao5.getText().equals("X")) && (Botao6.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }         
               if (Botao7.getText().equals("X")&& (Botao8.getText().equals("X")) && (Botao9.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }  
               
            //VERTICAL   
               if (Botao7.getText().equals("X")&& (Botao4.getText().equals("X")) && (Botao1.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao8.getText().equals("X")&& (Botao5.getText().equals("X")) && (Botao2.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }         
               if (Botao9.getText().equals("X")&& (Botao6.getText().equals("X")) && (Botao3.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }  
               
            //HORIZONTAL
               if (Botao1.getText().equals("X")&& (Botao5.getText().equals("X")) && (Botao9.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao7.getText().equals("X")&& (Botao5.getText().equals("X")) && (Botao3.getText().equals("X"))){                        
                   Vit1 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 1");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }                                  
             
               
          //JOGADOR 2   
            //HORIZONTAL
               if (Botao1.getText().equals("O")&& (Botao2.getText().equals("O")) && (Botao3.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao4.getText().equals("O")&& (Botao5.getText().equals("O")) && (Botao6.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }         
               if (Botao7.getText().equals("O")&& (Botao8.getText().equals("O")) && (Botao9.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }  
               
            //VERTICAL   
               if (Botao7.getText().equals("O")&& (Botao4.getText().equals("O")) && (Botao1.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao8.getText().equals("O")&& (Botao5.getText().equals("O")) && (Botao2.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }         
               if (Botao9.getText().equals("O")&& (Botao6.getText().equals("O")) && (Botao3.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }  
               
            //HORIZONTAL
               if (Botao1.getText().equals("O")&& (Botao5.getText().equals("O")) && (Botao9.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               } 
               if (Botao7.getText().equals("O")&& (Botao5.getText().equals("O")) && (Botao3.getText().equals("O"))){                        
                   Vit2 = true;
                   JOptionPane.showMessageDialog(rootPane, "O vencedor foi o jogador 2");
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar);
               }
               
               //VELHA
                 if ((Botao1.getText().equals("X") | (Botao1.getText().equals("O"))) && 
                    (Botao2.getText().equals("X") | (Botao2.getText().equals("O"))) && 
                    (Botao3.getText().equals("X") | (Botao3.getText().equals("O"))) && 
                    (Botao4.getText().equals("X") | (Botao4.getText().equals("O"))) &&
                    (Botao5.getText().equals("X") | (Botao5.getText().equals("O"))) &&                         
                    (Botao6.getText().equals("X") | (Botao6.getText().equals("O"))) &&
                    (Botao7.getText().equals("X") | (Botao7.getText().equals("O"))) &&
                    (Botao8.getText().equals("X") | (Botao8.getText().equals("O"))) &&
                    (Botao9.getText().equals("X") | (Botao9.getText().equals("O")))                         
                         ){
                 if((Vit1==false) && (Vit2==false)){     
                    JOptionPane.showMessageDialog(rootPane, "O jogo deu empate"); 
                   Botao1.setEnabled(Desabilitar); Botao2.setEnabled(Desabilitar); Botao3.setEnabled(Desabilitar); Botao4.setEnabled(Desabilitar);
                   Botao5.setEnabled(Desabilitar); Botao6.setEnabled(Desabilitar); Botao7.setEnabled(Desabilitar); Botao8.setEnabled(Desabilitar);
                   Botao9.setEnabled(Desabilitar); 
                   emp = emp + 1;
                   Empates.setText(String.valueOf(emp));
                   }
                 }
               
            VVenc();                              
    }        
    
    public Tela() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        TelinhaPainel = new javax.swing.JPanel();
        Botao7 = new javax.swing.JButton();
        Botao4 = new javax.swing.JButton();
        Botao2 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        Botao3 = new javax.swing.JButton();
        Botao6 = new javax.swing.JButton();
        Botao5 = new javax.swing.JButton();
        Botao8 = new javax.swing.JButton();
        Botao9 = new javax.swing.JButton();
        PainelInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        VitoriasJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        VitoriasJ2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Empates = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        VezL = new javax.swing.JLabel();
        PainelControles = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JButton();
        SobreBtn = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Jogo Da Velha"); // NOI18N
        setResizable(false);

        TelinhaPainel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Botao7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao7ActionPerformed(evt);
            }
        });

        Botao4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao4ActionPerformed(evt);
            }
        });

        Botao2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });

        Botao1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });

        Botao3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao3ActionPerformed(evt);
            }
        });

        Botao6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao6ActionPerformed(evt);
            }
        });

        Botao5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao5ActionPerformed(evt);
            }
        });

        Botao8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao8ActionPerformed(evt);
            }
        });

        Botao9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelinhaPainelLayout = new javax.swing.GroupLayout(TelinhaPainel);
        TelinhaPainel.setLayout(TelinhaPainelLayout);
        TelinhaPainelLayout.setHorizontalGroup(
            TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelinhaPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelinhaPainelLayout.createSequentialGroup()
                        .addComponent(Botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TelinhaPainelLayout.createSequentialGroup()
                        .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelinhaPainelLayout.createSequentialGroup()
                                .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TelinhaPainelLayout.createSequentialGroup()
                                .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TelinhaPainelLayout.setVerticalGroup(
            TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelinhaPainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botao7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botao9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelinhaPainelLayout.createSequentialGroup()
                        .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(TelinhaPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        PainelInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Jogador 1");

        VitoriasJ1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VitoriasJ1.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Jogador 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Simbolo : X");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Vitorias :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Simbolo : O");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Vitorias :");

        VitoriasJ2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VitoriasJ2.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Empates :");

        Empates.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Empates.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("É a vez do :");

        VezL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VezL.setText("Jogador 1");

        javax.swing.GroupLayout PainelInfoLayout = new javax.swing.GroupLayout(PainelInfo);
        PainelInfo.setLayout(PainelInfoLayout);
        PainelInfoLayout.setHorizontalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(PainelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VitoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelInfoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(VitoriasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Empates, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VezL)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        PainelInfoLayout.setVerticalGroup(
            PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(VitoriasJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInfoLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VitoriasJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Empates, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(VezL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PainelControles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        NovoJogo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });

        SobreBtn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SobreBtn.setText("Sobre");
        SobreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreBtnActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelControlesLayout = new javax.swing.GroupLayout(PainelControles);
        PainelControles.setLayout(PainelControlesLayout);
        PainelControlesLayout.setHorizontalGroup(
            PainelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelControlesLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(PainelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NovoJogo, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(SobreBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelControlesLayout.setVerticalGroup(
            PainelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelControlesLayout.createSequentialGroup()
                .addComponent(NovoJogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SobreBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Sair))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TelinhaPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TelinhaPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PainelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PainelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao7ActionPerformed
        
        if (Vez1==true){
            if(Botao7.getText().equals("")){
                Botao7.setText("X");
                EscVez();
            }
        }else{
            if(Botao7.getText().equals("")){
                Botao7.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao7ActionPerformed

    private void Botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao8ActionPerformed
        
        if (Vez1==true){
            if(Botao8.getText().equals("")){
                Botao8.setText("X");
                EscVez();
            }
        }else{
            if(Botao8.getText().equals("")){
                Botao8.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao8ActionPerformed

    private void Botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao9ActionPerformed
        
        if (Vez1==true){
            if(Botao9.getText().equals("")){
                Botao9.setText("X");
                EscVez();
            }
        }else{
            if(Botao9.getText().equals("")){
                Botao9.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao9ActionPerformed

    private void Botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao4ActionPerformed
        
        if (Vez1==true){
            if(Botao4.getText().equals("")){
                Botao4.setText("X");
                EscVez();
            }
        }else{
            if(Botao4.getText().equals("")){
                Botao4.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao4ActionPerformed

    private void Botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao5ActionPerformed
        
        if (Vez1==true){
            if(Botao5.getText().equals("")){
                Botao5.setText("X");
                EscVez();
            }
        }else{
            if(Botao5.getText().equals("")){
                Botao5.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao5ActionPerformed

    private void Botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao6ActionPerformed
        
        if (Vez1==true){
            if(Botao6.getText().equals("")){
                Botao6.setText("X");
                EscVez();
            }
        }else{
            if(Botao6.getText().equals("")){
                Botao6.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao6ActionPerformed

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        
        if (Vez1==true){
            if(Botao1.getText().equals("")){
                Botao1.setText("X");
                EscVez();
            }
        }else{
            if(Botao1.getText().equals("")){
                Botao1.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        
        if (Vez1==true){
            if(Botao2.getText().equals("")){
                Botao2.setText("X");
                EscVez();
            }
        }else{
            if(Botao2.getText().equals("")){
                Botao2.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao2ActionPerformed

    private void Botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao3ActionPerformed
        
        if (Vez1==true){
            if(Botao3.getText().equals("")){
                Botao3.setText("X");
                EscVez();
            }
        }else{
            if(Botao3.getText().equals("")){
                Botao3.setText("O");
                EscVez();
            }            
        }
        
    }//GEN-LAST:event_Botao3ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        
        if(Vit1==true){
            Vez1 = false;
            Vez2 = true;
        }
        if(Vit2==true){
            Vez1 = true;
            Vez2 = false;
        }
        
        Botao1.setText(""); Botao2.setText(""); Botao3.setText(""); Botao4.setText(""); Botao5.setText(""); Botao6.setText("");
        Botao7.setText(""); Botao8.setText(""); Botao9.setText("");
        
        Vit1 = false;
        Vit2 = false;
        
        Botao1.setEnabled(Habilitar); Botao2.setEnabled(Habilitar); Botao3.setEnabled(Habilitar); Botao4.setEnabled(Habilitar);
        Botao5.setEnabled(Habilitar); Botao6.setEnabled(Habilitar); Botao7.setEnabled(Habilitar); Botao8.setEnabled(Habilitar);
        Botao9.setEnabled(Habilitar);         
        
        lblvez();
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void SobreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreBtnActionPerformed
        
        Sobre frame = new Sobre();
        frame.setVisible(true);
        
    }//GEN-LAST:event_SobreBtnActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JButton Botao3;
    private javax.swing.JButton Botao4;
    private javax.swing.JButton Botao5;
    private javax.swing.JButton Botao6;
    private javax.swing.JButton Botao7;
    private javax.swing.JButton Botao8;
    private javax.swing.JButton Botao9;
    private javax.swing.JLabel Empates;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JPanel PainelControles;
    private javax.swing.JPanel PainelInfo;
    private javax.swing.JButton Sair;
    private javax.swing.JButton SobreBtn;
    private javax.swing.JPanel TelinhaPainel;
    private javax.swing.JLabel VezL;
    private javax.swing.JLabel VitoriasJ1;
    private javax.swing.JLabel VitoriasJ2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
