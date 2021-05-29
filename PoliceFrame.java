/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package police;

import sun.security.util.Password;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PoliceFrame extends javax.swing.JFrame {

    String id;
    String name;
    String line;

    ArrayList<String> finalList = new ArrayList<String>();
    //ArrayList<String> finalList2 = new ArrayList<String>();
    
    public PoliceFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        pass.setEchoChar((char) 0);
        setIcon();
        clock();
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("policeLogo1.png")));
        String title = "Welcome to NORA Alert System";
        setTitle(title);

    }

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {

                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);

                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        time.setText(hour + ":" + minute + ":" + second);
                        date.setText(year + ":" + month + ":" + day);

                        sleep(1000);
                    }

                } catch (Exception e) {
                    JOptionPane.showInputDialog(rootPane, e);
                }

            }
        };
        clock.start();
    }

    public void downloadPolice(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> pList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                pList.add(line);

            }
            String myString = pList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "").replace("'", "");

            finalList.add(Data);

            pList.clear();
        }

    }
    
    public void downloadPoliceMathara(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> pList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                pList.add(line);

            }
            String myString = pList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "").replace("'", "");

            finalList.add(Data);

            pList.clear();
        }

    }
    
    public void downloadPoliceKandy(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> pList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                pList.add(line);

            }
            String myString = pList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "").replace("'", "");

            finalList.add(Data);

            pList.clear();
        }

    }

    public void downloadDivisionalSecretariat(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> dsList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                dsList.add(line);

            }
            String myString = dsList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");

            finalList.add(Data);

            dsList.clear();
        }

    }

    public void downloadNationalHospital(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> hList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                hList.add(line);

            }
            String myString = hList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");

            finalList.add(Data);

            hList.clear();
        }

    }

    public void downloadKarapitiyaHospital(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> hList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                hList.add(line);

            }
            String myString = hList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");

            finalList.add(Data);

            hList.clear();
        }

    }
    
    public void downloadBankOfCeylon(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> bList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                bList.add(line);

            }
            String myString = bList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }
            String enc = new String(encrArray);
            System.out.println(enc);
            System.out.println("");
            String dec = new String(decrArray);
            System.out.println(dec);

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");

            finalList.add(Data);

            bList.clear();
        }

    }
    
    public void downloadPeoplesBank(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> bList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                bList.add(line);

            }
            String myString = bList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");


            finalList.add(Data);

            bList.clear();
        }

    }

    public void downloadMobitel(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> spList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                spList.add(line);

            }
            String myString = spList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }
            
            byte[] newArray = new byte[decrArray.length];
            for (int i = 3; i < decrArray.length - 3; i++) {
                newArray[i - 3] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");


            finalList.add(Data);

            spList.clear();
        }

    }

    public void downloadDialog(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> spList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                spList.add(line);

            }
            String myString = spList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }
            

            byte[] newArray = new byte[decrArray.length];
            for (int i = 3; i < decrArray.length - 3; i++) {
                newArray[i - 3] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");


            finalList.add(Data);

            System.out.println("Page downloaded.");
            spList.clear();
        }

    }
    
    public void downloadInsurance(String urlString) throws IOException {
        String Data;
        URL url = new URL(urlString);
        ArrayList<String> iList = new ArrayList<String>();
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                BufferedWriter writer = new BufferedWriter(new FileWriter("page.html"));) {

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                iList.add(line);

            }
            String myString = iList.toString();

            byte[] encrArray = myString.getBytes();
            byte[] decrArray = new byte[encrArray.length];
            System.out.println(encrArray.toString());

            for (int i = 0; i < encrArray.length; i++) {
                decrArray[i] = (byte) (encrArray[i] - 3);

            }
            

            byte[] newArray = new byte[decrArray.length];
            for (int i = 4; i < decrArray.length - 4; i++) {
                newArray[i - 4] = decrArray[i];

            }

            Data = new String(newArray);
            Data = Data.replaceAll("#", "\n                                                                                                                                ").replace(",", "").replace("(", "").replace(")", "").replace("[", "").replace("]", "");
            
            finalList.add(Data);
            System.out.println("Page downloaded.");
            iList.clear();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainBase_jPanel1 = new javax.swing.JPanel();
        EnterNora = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LoginMain_jPanel = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        showPassword = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Request_jPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        TabbedPane1 = new javax.swing.JTabbedPane();
        RequestPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        selectMobitel = new javax.swing.JCheckBox();
        selectInsuranceCompany = new javax.swing.JCheckBox();
        selectKarapitiyaHospital = new javax.swing.JCheckBox();
        selectBankOfCeylon = new javax.swing.JCheckBox();
        selectDivisionalSecretariat = new javax.swing.JCheckBox();
        selectPoliceMathara = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        selectPoliceKandy = new javax.swing.JCheckBox();
        selectPoliceDepartment = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        selectNationalHospital = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        selectPeoplesBank = new javax.swing.JCheckBox();
        selectDialog = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        inputName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ResponcePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MainBase_jPanel1.setLayout(new java.awt.CardLayout());

        EnterNora.setBackground(new java.awt.Color(255, 255, 255));
        EnterNora.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("NORA ALERTS SYSTEM");
        EnterNora.add(jLabel1);
        jLabel1.setBounds(273, 133, 922, 98);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/policeLogo1.png"))); // NOI18N
        EnterNora.add(jLabel3);
        jLabel3.setBounds(650, 270, 170, 200);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("SRI LANKA POLICE");
        EnterNora.add(jLabel4);
        jLabel4.setBounds(500, 490, 460, 90);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 51));
        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        EnterNora.add(jButton1);
        jButton1.setBounds(620, 640, 250, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/background4.jpg"))); // NOI18N
        EnterNora.add(jLabel2);
        jLabel2.setBounds(0, 0, 1500, 850);

        MainBase_jPanel1.add(EnterNora, "card2");

        LoginMain_jPanel.setBackground(new java.awt.Color(243, 242, 249));
        LoginMain_jPanel.setForeground(new java.awt.Color(255, 255, 255));
        LoginMain_jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMain_jPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginMain_jPanelMouseEntered(evt);
            }
        });

        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(170, 170, 170));
        user.setText("Username");
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Login");

        jButton2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pass.setBackground(new java.awt.Color(255, 255, 255));
        pass.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(170, 170, 170));
        pass.setText("Password");
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passMouseExited(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 150, 150));
        jLabel7.setText("Enter your username and password here.");

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setForeground(new java.awt.Color(0, 150, 150));
        showPassword.setText("Show Password");
        showPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPasswordMouseClicked(evt);
            }
        });
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        showPassword.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                showPasswordPropertyChange(evt);
            }
        });
        showPassword.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                showPasswordVetoableChange(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(0, 150, 150));
        jLabel8.setText("Forgot Password?");

        jLabel5.setBackground(new java.awt.Color(243, 242, 249));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/loginPageLast.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginMain_jPanelLayout = new javax.swing.GroupLayout(LoginMain_jPanel);
        LoginMain_jPanel.setLayout(LoginMain_jPanelLayout);
        LoginMain_jPanelLayout.setHorizontalGroup(
            LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                .addGroup(LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                                    .addComponent(showPassword)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8))
                                .addComponent(user, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                .addComponent(pass)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                        .addGap(0, 279, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(296, 296, 296)))
                .addComponent(jLabel5))
        );
        LoginMain_jPanelLayout.setVerticalGroup(
            LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginMain_jPanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel6)
                .addGap(71, 71, 71)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(LoginMain_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainBase_jPanel1.add(LoginMain_jPanel, "card3");

        Request_jPanel.setBackground(new java.awt.Color(255, 255, 255));
        Request_jPanel.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Request Data");
        Request_jPanel.add(jLabel9);
        jLabel9.setBounds(580, 25, 308, 43);

        TabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        TabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        TabbedPane1.setForeground(new java.awt.Color(0, 102, 102));
        TabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        RequestPanel.setBackground(new java.awt.Color(243, 242, 249));
        RequestPanel.setForeground(new java.awt.Color(0, 150, 150));
        RequestPanel.setToolTipText("");
        RequestPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        RequestPanel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        RequestPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RequestPanelMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 242, 249));

        selectMobitel.setBackground(new java.awt.Color(255, 255, 255));
        selectMobitel.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectMobitel.setForeground(new java.awt.Color(0, 150, 150));
        selectMobitel.setText("Mobitel");

        selectInsuranceCompany.setBackground(new java.awt.Color(255, 255, 255));
        selectInsuranceCompany.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        selectInsuranceCompany.setForeground(new java.awt.Color(0, 150, 150));
        selectInsuranceCompany.setText("Insurance Company");

        selectKarapitiyaHospital.setBackground(new java.awt.Color(255, 255, 255));
        selectKarapitiyaHospital.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectKarapitiyaHospital.setForeground(new java.awt.Color(0, 150, 150));
        selectKarapitiyaHospital.setText("Teaching Hospital Karapitiya");
        selectKarapitiyaHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectKarapitiyaHospitalActionPerformed(evt);
            }
        });

        selectBankOfCeylon.setBackground(new java.awt.Color(255, 255, 255));
        selectBankOfCeylon.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectBankOfCeylon.setForeground(new java.awt.Color(0, 150, 150));
        selectBankOfCeylon.setText("Bank of Ceylon");

        selectDivisionalSecretariat.setBackground(new java.awt.Color(255, 255, 255));
        selectDivisionalSecretariat.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        selectDivisionalSecretariat.setForeground(new java.awt.Color(0, 150, 150));
        selectDivisionalSecretariat.setText("Divisional Secretariat");

        selectPoliceMathara.setBackground(new java.awt.Color(255, 255, 255));
        selectPoliceMathara.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectPoliceMathara.setForeground(new java.awt.Color(0, 150, 150));
        selectPoliceMathara.setText("Police Station Mathara");
        selectPoliceMathara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPoliceMatharaActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 150, 150));
        jLabel14.setText("Hospitals");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 150, 150));
        jLabel17.setText("Select departments to request data.");

        selectPoliceKandy.setBackground(new java.awt.Color(255, 255, 255));
        selectPoliceKandy.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectPoliceKandy.setForeground(new java.awt.Color(0, 150, 150));
        selectPoliceKandy.setText("Police Station Kandy");
        selectPoliceKandy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPoliceKandyActionPerformed(evt);
            }
        });

        selectPoliceDepartment.setBackground(new java.awt.Color(255, 255, 255));
        selectPoliceDepartment.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectPoliceDepartment.setForeground(new java.awt.Color(0, 150, 150));
        selectPoliceDepartment.setText("Police Department");
        selectPoliceDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPoliceDepartmentActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 150, 150));
        jLabel18.setText("Police Stations");

        selectNationalHospital.setBackground(new java.awt.Color(255, 255, 255));
        selectNationalHospital.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectNationalHospital.setForeground(new java.awt.Color(0, 150, 150));
        selectNationalHospital.setText("National Hospital Colombo");
        selectNationalHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNationalHospitalActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 150, 150));
        jLabel19.setText("Service Providers");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 150, 150));
        jLabel20.setText("Banks");

        selectPeoplesBank.setBackground(new java.awt.Color(255, 255, 255));
        selectPeoplesBank.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectPeoplesBank.setForeground(new java.awt.Color(0, 150, 150));
        selectPeoplesBank.setText("People's Bank");

        selectDialog.setBackground(new java.awt.Color(255, 255, 255));
        selectDialog.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        selectDialog.setForeground(new java.awt.Color(0, 150, 150));
        selectDialog.setText("Dialog");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectBankOfCeylon, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(selectPoliceDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(selectPoliceMathara, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addComponent(selectKarapitiyaHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(selectDivisionalSecretariat, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(selectMobitel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectPeoplesBank, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(selectInsuranceCompany, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(selectPoliceKandy, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectNationalHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPoliceDepartment)
                    .addComponent(selectBankOfCeylon))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPoliceMathara)
                    .addComponent(selectPeoplesBank))
                .addGap(12, 12, 12)
                .addComponent(selectPoliceKandy)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectDivisionalSecretariat)
                    .addComponent(selectInsuranceCompany))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNationalHospital)
                    .addComponent(selectMobitel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectKarapitiyaHospital)
                    .addComponent(selectDialog))
                .addGap(43, 43, 43))
        );

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 150, 150));
        jLabel10.setText("ID Number          :");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 150, 150));
        jLabel11.setText("Full Name           :");

        inputID.setBackground(new java.awt.Color(255, 255, 255));
        inputID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputID.setForeground(new java.awt.Color(0, 150, 150));
        inputID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        inputName.setForeground(new java.awt.Color(0, 150, 150));
        inputName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 150, 150));
        jLabel15.setText("Enter ID Number or Full Name to request data.");

        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Request by NIC");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Request by Name");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RequestPanelLayout = new javax.swing.GroupLayout(RequestPanel);
        RequestPanel.setLayout(RequestPanelLayout);
        RequestPanelLayout.setHorizontalGroup(
            RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RequestPanelLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346))
                    .addGroup(RequestPanelLayout.createSequentialGroup()
                        .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputName, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addComponent(inputID)
                            .addGroup(RequestPanelLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        RequestPanelLayout.setVerticalGroup(
            RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RequestPanelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(RequestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RequestPanelLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        TabbedPane1.addTab("Request", RequestPanel);

        ResponcePanel.setBackground(new java.awt.Color(243, 242, 249));
        ResponcePanel.setLayout(null);

        area1.setBackground(new java.awt.Color(243, 242, 249));
        area1.setColumns(20);
        area1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        area1.setForeground(new java.awt.Color(0, 130, 130));
        area1.setRows(5);
        area1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(area1);

        ResponcePanel.add(jScrollPane1);
        jScrollPane1.setBounds(25, 28, 1350, 519);

        TabbedPane1.addTab("Response", ResponcePanel);

        Request_jPanel.add(TabbedPane1);
        TabbedPane1.setBounds(46, 195, 1407, 620);

        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Log Out");
        Request_jPanel.add(jButton5);
        jButton5.setBounds(1420, 10, 74, 32);

        time.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 150, 150));
        Request_jPanel.add(time);
        time.setBounds(1360, 110, 90, 30);

        date.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        date.setForeground(new java.awt.Color(0, 150, 150));
        Request_jPanel.add(date);
        date.setBounds(130, 110, 110, 30);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 150, 150));
        jLabel12.setText("Time :");
        Request_jPanel.add(jLabel12);
        jLabel12.setBounds(1290, 110, 66, 24);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 150, 150));
        jLabel13.setText("Date :");
        Request_jPanel.add(jLabel13);
        jLabel13.setBounds(46, 113, 66, 25);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/police/background4.jpg"))); // NOI18N
        Request_jPanel.add(jLabel16);
        jLabel16.setBounds(0, 0, 1500, 850);

        MainBase_jPanel1.add(Request_jPanel, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBase_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBase_jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainBase_jPanel1.removeAll();
        MainBase_jPanel1.repaint();
        MainBase_jPanel1.revalidate();

        MainBase_jPanel1.add(LoginMain_jPanel);
        MainBase_jPanel1.repaint();
        MainBase_jPanel1.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped

    }//GEN-LAST:event_userKeyTyped

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        if (user.getText().equals("Username")) {
            user.setText("");
        }
        if (String.valueOf(pass.getPassword()).equals("")) {
            pass.setText("Password");
        }
    }//GEN-LAST:event_userMouseClicked

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited

    }//GEN-LAST:event_userMouseExited

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        if (String.valueOf(pass.getPassword()).equals("Password")) {
            pass.setText("");
        }
        if (user.getText().equals("")) {
            user.setText("Username");
        }
    }//GEN-LAST:event_passMouseClicked

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if (showPassword.isSelected()) {
            pass.setEchoChar((char) 0);

        } else {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_passKeyPressed

    private void passMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseExited

    }//GEN-LAST:event_passMouseExited

    private void LoginMain_jPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMain_jPanelMouseEntered

    }//GEN-LAST:event_LoginMain_jPanelMouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PreparedStatement pst1;                                         //Librarian login
        ResultSet rs1;
        String username1 = user.getText();
        String password1 = String.valueOf(pass.getPassword());

        String sql="select* from users where Username=? and Password=?";
        try{
            pst1=DbConnect.connect().prepareStatement(sql);
            pst1.setString(1, username1);
            pst1.setString(2, password1);

            rs1=pst1.executeQuery();
            if(rs1.next())
            {
                MainBase_jPanel1.removeAll();
                MainBase_jPanel1.repaint();
                MainBase_jPanel1.revalidate();

                MainBase_jPanel1.add(Request_jPanel);
                MainBase_jPanel1.repaint();
                MainBase_jPanel1.revalidate();
            }
            else{
                JOptionPane.showMessageDialog(null, "INVALID");
            }

        } catch (Exception e) {
            System.out.println("error");
        }
        
        user.setText("");
        pass.setText("");
       
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void selectPoliceMatharaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPoliceMatharaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPoliceMatharaActionPerformed

    private void selectKarapitiyaHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectKarapitiyaHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectKarapitiyaHospitalActionPerformed

    private void LoginMain_jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMain_jPanelMouseClicked
        if (String.valueOf(pass.getPassword()).equals("")) {
            pass.setText("Password");
        }
        if (String.valueOf(pass.getPassword()).equals("Password")) {
            pass.setEchoChar((char) 0);
        } else {
            if (showPassword.isSelected()) {
                pass.setEchoChar((char) 0);

            } else {
                pass.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_LoginMain_jPanelMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        if (String.valueOf(pass.getPassword()).equals("")) {
            pass.setText("Password");
        }
        if (String.valueOf(pass.getPassword()).equals("Password")) {
            pass.setEchoChar((char) 0);
        } else {
            if (showPassword.isSelected()) {
                pass.setEchoChar((char) 0);

            } else {
                pass.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPasswordActionPerformed

    private void showPasswordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_showPasswordPropertyChange

    }//GEN-LAST:event_showPasswordPropertyChange

    private void showPasswordVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_showPasswordVetoableChange

    }//GEN-LAST:event_showPasswordVetoableChange

    private void showPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPasswordMouseClicked
        if (String.valueOf(pass.getPassword()).equals("")) {
            pass.setText("Password");
        }
        if (String.valueOf(pass.getPassword()).equals("Password")) {
            pass.setEchoChar((char) 0);
        } else {
            if (showPassword.isSelected()) {
                pass.setEchoChar((char) 0);

            } else {
                pass.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_showPasswordMouseClicked

    private void selectPoliceKandyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPoliceKandyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPoliceKandyActionPerformed

    private void selectPoliceDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPoliceDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectPoliceDepartmentActionPerformed

    private void selectNationalHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNationalHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectNationalHospitalActionPerformed

    private void RequestPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RequestPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RequestPanelMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        area1.setText("");
        area1.setText("");

        id = inputID.getText();
        String finalData;
        finalList.clear();
        

        if (selectPoliceDepartment.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55481/api/v1/police/police?Person_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in police department");
            }
        }
        
        if (selectPoliceMathara.isSelected()) {
            try {

                downloadPoliceMathara("http://127.0.0.1:55483/api/v1/police/matharapolice?Person_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in police station matara");
            }
        }

        if (selectPoliceKandy.isSelected()) {
            try {

                downloadPoliceKandy("http://127.0.0.1:55482/api/v1/police/kandypolice?Person_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in police station kandy");
            }
        }
        
        if (selectDivisionalSecretariat.isSelected()) {
            try {
                downloadDivisionalSecretariat("http://127.0.0.1:55484/api/v1/police/divisionalsecretariat?Person_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in divisional secreatariat");
            }
        }

        if (selectKarapitiyaHospital.isSelected()) {
            try {
                downloadKarapitiyaHospital("http://127.0.0.1:55488/api/v1/police/karapitiyahospital?Patient_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in teaching hospital karapitiya");
            }
        }

        if (selectNationalHospital.isSelected()) {
            try {
                downloadKarapitiyaHospital("http://127.0.0.1:55487/api/v1/police/nationalhospital?Patient_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in national hospital colombo");
            }
        }

        if (selectBankOfCeylon.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55485/api/v1/police/bankofceylon?Customer_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in bank of ceylon");
            }
        }
        
        if (selectPeoplesBank.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55486/api/v1/police/peoplesbank?Customer_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in people's bank");
            }
        }

        if (selectInsuranceCompany.isSelected()) {
            try {
                downloadInsurance("http://127.0.0.1:55489/api/v1/police/insurance?Customer_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in insurance company");
            }
        }

        if (selectMobitel.isSelected()) {
            try {
                downloadMobitel("http://127.0.0.1:55490/api/v1/police/mobitel?Customer_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in mobitel");
            }
        }

        if (selectDialog.isSelected()) {
            try {
                downloadMobitel("http://127.0.0.1:55491/api/v1/police/dialog?Customer_NIC=" + id + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Server error in dialog");
            }
        }
        
        TabbedPane1.setSelectedIndex(1);
        finalData = finalList.toString();
        finalData = finalData.replace("[", "").replace("]", "");
        area1.setText(finalData);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        area1.setText("");

        name = inputName.getText();
        name = name.replace(" ", "%20");
        String finalData;
        finalList.clear();
        

        if (selectPoliceDepartment.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55481/api/v1/police/police?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (selectPoliceMathara.isSelected()) {
            try {

                downloadPoliceMathara("http://127.0.0.1:55483/api/v1/police/matharapolice?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectPoliceKandy.isSelected()) {
            try {

                downloadPoliceKandy("http://127.0.0.1:55482/api/v1/police/kandypolice?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (selectDivisionalSecretariat.isSelected()) {
            try {
                downloadDivisionalSecretariat("http://127.0.0.1:55484/api/v1/police/divisionalsecretariat?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectKarapitiyaHospital.isSelected()) {
            try {
                downloadKarapitiyaHospital("http://127.0.0.1:55488/api/v1/police/karapitiyahospital?Patient_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectNationalHospital.isSelected()) {
            try {
                downloadKarapitiyaHospital("http://127.0.0.1:55487/api/v1/police/nationalhospital?Patient_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectBankOfCeylon.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55485/api/v1/police/bankofceylon?Customer_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (selectPeoplesBank.isSelected()) {
            try {

                downloadPolice("http://127.0.0.1:55486/api/v1/police/peoplesbank?Customer_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectInsuranceCompany.isSelected()) {
            try {
                downloadInsurance("http://127.0.0.1:55489/api/v1/police/insurance?Customer_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectMobitel.isSelected()) {
            try {
                downloadMobitel("http://127.0.0.1:55490/api/v1/police/mobitel?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (selectDialog.isSelected()) {
            try {
                downloadMobitel("http://127.0.0.1:55491/api/v1/police/dialog?Full_Name=" + name + "");
            } catch (IOException ex) {
                Logger.getLogger(PoliceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        TabbedPane1.setSelectedIndex(1);
        finalData = finalList.toString();
        finalData = finalData.replace("[", "").replace("]", "");
        area1.setText(finalData);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PoliceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoliceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoliceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoliceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoliceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EnterNora;
    private javax.swing.JPanel LoginMain_jPanel;
    private javax.swing.JPanel MainBase_jPanel1;
    private javax.swing.JPanel RequestPanel;
    private javax.swing.JPanel Request_jPanel;
    private javax.swing.JPanel ResponcePanel;
    private javax.swing.JTabbedPane TabbedPane1;
    private javax.swing.JTextArea area1;
    private javax.swing.JLabel date;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JCheckBox selectBankOfCeylon;
    private javax.swing.JCheckBox selectDialog;
    private javax.swing.JCheckBox selectDivisionalSecretariat;
    private javax.swing.JCheckBox selectInsuranceCompany;
    private javax.swing.JCheckBox selectKarapitiyaHospital;
    private javax.swing.JCheckBox selectMobitel;
    private javax.swing.JCheckBox selectNationalHospital;
    private javax.swing.JCheckBox selectPeoplesBank;
    private javax.swing.JCheckBox selectPoliceDepartment;
    private javax.swing.JCheckBox selectPoliceKandy;
    private javax.swing.JCheckBox selectPoliceMathara;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel time;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
