package calculadora;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Hernan
 */
public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    boolean used=false;
    
    public Calculadora() {
        this.setUndecorated(true);
        this.setSize(350, 500);
        
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 30, 30);
        AWTUtilities.setWindowShape(this, forma);
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btn_modo = new javax.swing.JButton();
        btn_close = new javax.swing.JLabel();
        btn_mini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_div = new javax.swing.JButton();
        btn_c = new javax.swing.JButton();
        btn_ce = new javax.swing.JButton();
        btn_porc = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_mul = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(244, 253, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperacion.setFont(new java.awt.Font("Monospac821 BT", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(55, 62, 71));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 316, 29));

        txtResultado.setFont(new java.awt.Font("Monospac821 BT", 3, 48)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(55, 62, 71));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, 316, 70));

        btn_modo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn4.png"))); // NOI18N
        btn_modo.setBorder(null);
        btn_modo.setMaximumSize(new java.awt.Dimension(50, 25));
        btn_modo.setMinimumSize(new java.awt.Dimension(50, 25));
        btn_modo.setPreferredSize(new java.awt.Dimension(50, 25));
        btn_modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_modo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 50, 25));

        btn_close.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 51, 51));
        btn_close.setText("•");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        btn_mini.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        btn_mini.setForeground(new java.awt.Color(255, 204, 0));
        btn_mini.setText("•");
        btn_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_miniMouseClicked(evt);
            }
        });
        jPanel1.add(btn_mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_div.setBackground(new java.awt.Color(240, 240, 240));
        btn_div.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_div.setForeground(new java.awt.Color(55, 62, 71));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_div.setText("/");
        btn_div.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_div.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_div.setName(""); // NOI18N
        btn_div.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_div.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        btn_c.setBackground(new java.awt.Color(240, 240, 240));
        btn_c.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_c.setForeground(new java.awt.Color(55, 62, 71));
        btn_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_c.setText("C");
        btn_c.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_c.setFocusPainted(false);
        btn_c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_c.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_c.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_c.setName(""); // NOI18N
        btn_c.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_c.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_c.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cActionPerformed(evt);
            }
        });
        jPanel2.add(btn_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btn_ce.setBackground(new java.awt.Color(240, 240, 240));
        btn_ce.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_ce.setForeground(new java.awt.Color(55, 62, 71));
        btn_ce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_ce.setText("CE");
        btn_ce.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_ce.setFocusPainted(false);
        btn_ce.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_ce.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_ce.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_ce.setName(""); // NOI18N
        btn_ce.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_ce.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_ce.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_ce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ceActionPerformed(evt);
            }
        });
        jPanel2.add(btn_ce, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btn_porc.setBackground(new java.awt.Color(240, 240, 240));
        btn_porc.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_porc.setForeground(new java.awt.Color(55, 62, 71));
        btn_porc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porc.setText("%");
        btn_porc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_porc.setFocusPainted(false);
        btn_porc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_porc.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_porc.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_porc.setName(""); // NOI18N
        btn_porc.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_porc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_porc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_porc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_porcActionPerformed(evt);
            }
        });
        jPanel2.add(btn_porc, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btn_7.setBackground(new java.awt.Color(240, 240, 240));
        btn_7.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_7.setForeground(new java.awt.Color(55, 62, 71));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_7.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_7.setName(""); // NOI18N
        btn_7.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        btn_8.setBackground(new java.awt.Color(240, 240, 240));
        btn_8.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_8.setForeground(new java.awt.Color(55, 62, 71));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_8.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_8.setName(""); // NOI18N
        btn_8.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        btn_9.setBackground(new java.awt.Color(240, 240, 240));
        btn_9.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_9.setForeground(new java.awt.Color(55, 62, 71));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_9.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_9.setName(""); // NOI18N
        btn_9.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        btn_mul.setBackground(new java.awt.Color(240, 240, 240));
        btn_mul.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(55, 62, 71));
        btn_mul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_mul.setText("x");
        btn_mul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_mul.setFocusPainted(false);
        btn_mul.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_mul.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_mul.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_mul.setName(""); // NOI18N
        btn_mul.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_mul.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_mul.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mulActionPerformed(evt);
            }
        });
        jPanel2.add(btn_mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        btn_4.setBackground(new java.awt.Color(240, 240, 240));
        btn_4.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_4.setForeground(new java.awt.Color(55, 62, 71));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_4.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_4.setName(""); // NOI18N
        btn_4.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        btn_5.setBackground(new java.awt.Color(240, 240, 240));
        btn_5.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_5.setForeground(new java.awt.Color(55, 62, 71));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_5.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_5.setName(""); // NOI18N
        btn_5.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        btn_6.setBackground(new java.awt.Color(240, 240, 240));
        btn_6.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_6.setForeground(new java.awt.Color(55, 62, 71));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_6.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_6.setName(""); // NOI18N
        btn_6.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        btn_resta.setBackground(new java.awt.Color(240, 240, 240));
        btn_resta.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(55, 62, 71));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_resta.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_resta.setName(""); // NOI18N
        btn_resta.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_resta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        btn_1.setBackground(new java.awt.Color(240, 240, 240));
        btn_1.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_1.setForeground(new java.awt.Color(55, 62, 71));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_1.setFocusPainted(false);
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_1.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_1.setName(""); // NOI18N
        btn_1.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btn_2.setBackground(new java.awt.Color(240, 240, 240));
        btn_2.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_2.setForeground(new java.awt.Color(55, 62, 71));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_2.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_2.setName(""); // NOI18N
        btn_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btn_3.setBackground(new java.awt.Color(240, 240, 240));
        btn_3.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_3.setForeground(new java.awt.Color(55, 62, 71));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_3.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_3.setName(""); // NOI18N
        btn_3.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        btn_suma.setBackground(new java.awt.Color(240, 240, 240));
        btn_suma.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(55, 62, 71));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_suma.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_suma.setName(""); // NOI18N
        btn_suma.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_suma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        btn_0.setBackground(new java.awt.Color(240, 240, 240));
        btn_0.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_0.setForeground(new java.awt.Color(55, 62, 71));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_0.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_0.setName(""); // NOI18N
        btn_0.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btn_punto.setBackground(new java.awt.Color(240, 240, 240));
        btn_punto.setFont(new java.awt.Font("Monospac821 BT", 0, 26)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(55, 62, 71));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn2.png"))); // NOI18N
        btn_punto.setText(".");
        btn_punto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_punto.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_punto.setName(""); // NOI18N
        btn_punto.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_punto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1.png"))); // NOI18N
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        btn_igual.setBackground(new java.awt.Color(240, 240, 240));
        btn_igual.setFont(new java.awt.Font("Monospac821 BT", 0, 30)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setMaximumSize(new java.awt.Dimension(127, 59));
        btn_igual.setMinimumSize(new java.awt.Dimension(127, 59));
        btn_igual.setName(""); // NOI18N
        btn_igual.setPreferredSize(new java.awt.Dimension(50, 50));
        btn_igual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn3.png"))); // NOI18N
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn1_pressed.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 350, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        if(used==false){
            addNumber("/");
            used=true;
        }
        
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cActionPerformed
        // TODO add your handling code here:
        txtOperacion.setText("");
        txtResultado.setText("");
        used=false;
    }//GEN-LAST:event_btn_cActionPerformed

    private void btn_ceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ceActionPerformed

        if(txtOperacion.getText().length()-1>=0){ 
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length()-1);
        txtOperacion.setText(texto);
        
        }
            
        
    }//GEN-LAST:event_btn_ceActionPerformed

    private void btn_porcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_porcActionPerformed
        if(used==false){
            addNumber("%");
            used=true;
        }
        
    }//GEN-LAST:event_btn_porcActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addNumber("7");
        used=false;
        
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addNumber("8");
        used=false;
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addNumber("9");
        used=false;
    }//GEN-LAST:event_btn_9ActionPerformed

    private void btn_mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mulActionPerformed
        if(used==false){
        addNumber("*");
        used=true;
        }
    }//GEN-LAST:event_btn_mulActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addNumber("4");
        used=false;
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addNumber("5");
        used=false;
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addNumber("6");
        used=false;
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        if(used==false){
        addNumber("-");
        used=true;
        }
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addNumber("1");
        used=false;
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addNumber("2");
        used=false;
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addNumber("3");
        used=false;
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        if(used==false){
        addNumber("+");
        used=true;
        }
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addNumber("0");
        used=false;
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed

        for (int i = 0; i < txtOperacion.getText().length(); i++) {
            if (!txtOperacion.getText().substring(0,txtOperacion.getText().length()-1-i).equals(".")) {
                addNumber(".");
                break;
            }
        }
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
            txtOperacion.setText("");
            
        } catch (ScriptException ex) {
            Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        used=false;
    }//GEN-LAST:event_btn_igualActionPerformed

    boolean modoOscuro = false;

    private void btn_modoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modoActionPerformed
        // TODO add your handling code here:

        if (!modoOscuro) {
            jPanel1.setBackground(Color.decode("#212b41"));
            jPanel2.setBackground(Color.decode("#2e3951"));
            txtOperacion.setForeground(Color.decode("#0db387"));
            txtResultado.setForeground(Color.decode("#0db387"));

            cambiarColorBtn1(btn_0);
            cambiarColorBtn1(btn_punto);
            cambiarColorBtn1(btn_1);
            cambiarColorBtn1(btn_2);
            cambiarColorBtn1(btn_3);
            cambiarColorBtn1(btn_4);
            cambiarColorBtn1(btn_5);
            cambiarColorBtn1(btn_6);
            cambiarColorBtn1(btn_7);
            cambiarColorBtn1(btn_8);
            cambiarColorBtn1(btn_9);

            cambiarColorBtn2(btn_c);
            cambiarColorBtn2(btn_ce);
            cambiarColorBtn2(btn_porc);
            cambiarColorBtn2(btn_div);
            cambiarColorBtn2(btn_mul);
            cambiarColorBtn2(btn_suma);
            cambiarColorBtn2(btn_resta);

            btn_modo.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn5dark.png")));

            btn_igual.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn3dark.png")));
            btn_igual.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn3dark.png")));
            btn_igual.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn4dark.png")));
            btn_igual.setForeground(Color.decode("#96a8a0"));
            modoOscuro = true;
        } else {
            Calculadora frame = new Calculadora();
            this.dispose();
            frame.setVisible(true);
        }

    }//GEN-LAST:event_btn_modoActionPerformed

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miniMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_btn_miniMouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    public void cambiarColorBtn1(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn1dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn1dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn2dark.png")));
        btn.setForeground(Color.decode("#96a8a0"));
    }

    public void cambiarColorBtn2(JButton btn) {
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/btn2dark.png")));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/imagenes/btn2dark.png")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/imagenes/btn2darkpressed.png")));
        btn.setForeground(Color.decode("#0db387"));
    }

    public void addNumber(String digito) {
        txtOperacion.setText(txtOperacion.getText() + digito);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_c;
    private javax.swing.JButton btn_ce;
    private javax.swing.JLabel btn_close;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_igual;
    private javax.swing.JLabel btn_mini;
    private javax.swing.JButton btn_modo;
    private javax.swing.JButton btn_mul;
    private javax.swing.JButton btn_porc;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
