package leagueoflegendsbuilder;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hooten_866875
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    private String champList = "NoChampionSelected Aatrox Ahri Akali Alistar Amumu"
                + " Anivia Annie Aphelios Ashe AurelionSol Azir Bard Blitzcrank Brand Braum"
                + " Caitlyn Camille Cassiopeia Cho'Gath Corki Darius Diana Dr.Mundo"
                + " Draven Ekko Elise Evelynn Ezreal Fiddlesticks Fiora Fizz Galio"
                + " Gangplank Garen Gnar Gragas Graves Hecarim Heimerdinger Illaoi"
                + " Irelia Ivern Janna JarvanIV Jax Jayce Jhin Jinx kai'sa Kalista Karma"
                + " Karthus Kassadin Katarina Kayle Kayn Kennen Kha'Zix Kindred Kled"
                + " Kog'Maw LeBlanc LeeSin Leona Lissandra Lucian Lulu Lux Malphite "
                + "Malzahar Maokai MasterYi MissFortune Mordekaiser Morgana Nami"
                + " Nasus Nautilus Neeko Nidalee Nocturne Nunu Olaf Orianna Ornn Pantheon"
                + " Poppy Pyke Qiyana Quinn Rakan Rammus Rek'Sai Renekton Rengar Riven Rumble"
                + " Ryze Sejuani Senna Sett Shaco Shen Shyvana Singed Sion Sivir Skarner Sona"
                + " Soraka Swain Sylas Syndra TahmKench Tailyah Talon Taric Teemo Thresh"
                + " Tristana Trundle Tryndamere TwistedFate Twitch Udyr Urgot Varus"
                + " Vayne Veigar Vel'Koz Vi Viktor Vladimir Volibear Warwick Wukong"
                + " Xayah Xerath XinZhao Yasuo Yorick Yuumi Zac Zed Ziggs Zilean Zoe Zyra";
    private TreeMap <String, Champion> champs;
    public MainWindow() throws IOException {
        
        champs = new TreeMap<String, Champion>();
        addChamps();
        initComponents();
        //ChampPicture.setIcon(new ImageIcon ("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Icon/Ahri.jpg"));
        //ListOfChampions.addItem("Aatrox");
        Scanner allChamps = new Scanner(champList);
        while(allChamps.hasNext()){
           ListOfChampions.addItem(allChamps.next());
        }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        IndividualInfoPanel = new javax.swing.JPanel();
        ListOfChampions = new javax.swing.JComboBox();
        ListOfChamp = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        ChampRole = new javax.swing.JLabel();
        ChampPicture = new javax.swing.JLabel();
        BUILDlabel = new javax.swing.JLabel();
        BuildPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Rune_Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        subStat1 = new javax.swing.JLabel();
        subStat2 = new javax.swing.JLabel();
        subStat3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        subKey = new javax.swing.JLabel();
        topSubKey = new javax.swing.JLabel();
        botSubKey = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        MainKey = new javax.swing.JLabel();
        topKey = new javax.swing.JLabel();
        midKey = new javax.swing.JLabel();
        botKey = new javax.swing.JLabel();
        RUNElabel = new javax.swing.JLabel();
        SkillOrder = new javax.swing.JLabel();
        RSkill1 = new javax.swing.JLabel();
        ESkill1 = new javax.swing.JLabel();
        QSkill1 = new javax.swing.JLabel();
        WSkill1 = new javax.swing.JLabel();
        TeamCompPanel = new javax.swing.JPanel();
        TeamCompBigBoiPanel = new javax.swing.JPanel();
        CharacterComp = new javax.swing.JTabbedPane();
        Character1 = new javax.swing.JPanel();
        ChampName1 = new javax.swing.JLabel();
        ChampRole1 = new javax.swing.JLabel();
        ChampPicture1 = new javax.swing.JLabel();
        Character2 = new javax.swing.JPanel();
        ChampName2 = new javax.swing.JLabel();
        ChampRole2 = new javax.swing.JLabel();
        ChampPicture2 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ListOfChampions.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ListOfChampionsItemStateChanged(evt);
            }
        });
        ListOfChampions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListOfChampionsActionPerformed(evt);
            }
        });

        ListOfChamp.setText("List Of Campions");

        ChampRole.setText("Set this equal to the role");

        BUILDlabel.setText("BUILD");

        javax.swing.GroupLayout BuildPanelLayout = new javax.swing.GroupLayout(BuildPanel);
        BuildPanel.setLayout(BuildPanelLayout);
        BuildPanelLayout.setHorizontalGroup(
            BuildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
        );
        BuildPanelLayout.setVerticalGroup(
            BuildPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChampPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUILDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(BuildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(ChampRole, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ChampRole, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BuildPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BUILDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ChampPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("                                                                                                          Basic Info                                                                                                                     ", jPanel6);

        subStat1.setText("sub stat 1");

        subStat2.setText("sub stat 2");

        subStat3.setText("sub stat 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subStat3)
                    .addComponent(subStat2)
                    .addComponent(subStat1))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(subStat1)
                .addGap(27, 27, 27)
                .addComponent(subStat2)
                .addGap(38, 38, 38)
                .addComponent(subStat3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        subKey.setText("Secondary");

        topSubKey.setText("top sub");

        botSubKey.setText("bot sub");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(subKey)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botSubKey)
                            .addComponent(topSubKey))
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(subKey)
                .addGap(27, 27, 27)
                .addComponent(topSubKey)
                .addGap(33, 33, 33)
                .addComponent(botSubKey)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MainKey.setText("Main KeyStone");

        topKey.setText("top sub");

        midKey.setText("mid sub");

        botKey.setText("bot sub");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(MainKey))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botKey)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(midKey)
                                .addComponent(topKey)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(MainKey)
                .addGap(29, 29, 29)
                .addComponent(topKey)
                .addGap(31, 31, 31)
                .addComponent(midKey)
                .addGap(29, 29, 29)
                .addComponent(botKey)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        RUNElabel.setText("RUNES");

        javax.swing.GroupLayout Rune_PanelLayout = new javax.swing.GroupLayout(Rune_Panel);
        Rune_Panel.setLayout(Rune_PanelLayout);
        Rune_PanelLayout.setHorizontalGroup(
            Rune_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Rune_PanelLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(RUNElabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Rune_PanelLayout.setVerticalGroup(
            Rune_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Rune_PanelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(RUNElabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SkillOrder.setText("Skill order");

        RSkill1.setText("R Skill");

        ESkill1.setText("E Skill");

        QSkill1.setText("Q Skill");

        WSkill1.setText("W Skill");

        javax.swing.GroupLayout IndividualInfoPanelLayout = new javax.swing.GroupLayout(IndividualInfoPanel);
        IndividualInfoPanel.setLayout(IndividualInfoPanelLayout);
        IndividualInfoPanelLayout.setHorizontalGroup(
            IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndividualInfoPanelLayout.createSequentialGroup()
                .addGroup(IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IndividualInfoPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ListOfChamp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(ListOfChampions, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(IndividualInfoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Rune_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(IndividualInfoPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(QSkill1)
                        .addGap(29, 29, 29)
                        .addGroup(IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SkillOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(IndividualInfoPanelLayout.createSequentialGroup()
                                .addComponent(WSkill1)
                                .addGap(28, 28, 28)
                                .addComponent(ESkill1)
                                .addGap(30, 30, 30)
                                .addComponent(RSkill1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IndividualInfoPanelLayout.setVerticalGroup(
            IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IndividualInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListOfChampions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListOfChamp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SkillOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(IndividualInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QSkill1)
                    .addComponent(WSkill1)
                    .addComponent(ESkill1)
                    .addComponent(RSkill1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Rune_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("                                   Individual Inforamtion                                         ", IndividualInfoPanel);

        ChampName1.setText("Set this equal to the champion name");

        ChampRole1.setText("Set this equal to the role");

        ChampPicture1.setText("The picture of the champ");

        javax.swing.GroupLayout Character1Layout = new javax.swing.GroupLayout(Character1);
        Character1.setLayout(Character1Layout);
        Character1Layout.setHorizontalGroup(
            Character1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Character1Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addGroup(Character1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChampRole1)
                    .addComponent(ChampName1))
                .addGap(155, 155, 155))
            .addGroup(Character1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ChampPicture1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Character1Layout.setVerticalGroup(
            Character1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Character1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChampName1)
                .addGap(22, 22, 22)
                .addComponent(ChampPicture1)
                .addGap(27, 27, 27)
                .addComponent(ChampRole1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CharacterComp.addTab("                         Character 1                        ", Character1);

        ChampName2.setText("Set this equal to the champion name");

        ChampRole2.setText("Set this equal to the role");

        ChampPicture2.setText("The picture of the champ");

        javax.swing.GroupLayout Character2Layout = new javax.swing.GroupLayout(Character2);
        Character2.setLayout(Character2Layout);
        Character2Layout.setHorizontalGroup(
            Character2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Character2Layout.createSequentialGroup()
                .addContainerGap(347, Short.MAX_VALUE)
                .addGroup(Character2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChampRole2)
                    .addComponent(ChampName2))
                .addGap(155, 155, 155))
            .addGroup(Character2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ChampPicture2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Character2Layout.setVerticalGroup(
            Character2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Character2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChampName2)
                .addGap(22, 22, 22)
                .addComponent(ChampPicture2)
                .addGap(27, 27, 27)
                .addComponent(ChampRole2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CharacterComp.addTab("                          Character 2                        ", Character2);

        javax.swing.GroupLayout TeamCompBigBoiPanelLayout = new javax.swing.GroupLayout(TeamCompBigBoiPanel);
        TeamCompBigBoiPanel.setLayout(TeamCompBigBoiPanelLayout);
        TeamCompBigBoiPanelLayout.setHorizontalGroup(
            TeamCompBigBoiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamCompBigBoiPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(CharacterComp)
                .addContainerGap())
        );
        TeamCompBigBoiPanelLayout.setVerticalGroup(
            TeamCompBigBoiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamCompBigBoiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CharacterComp, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(944, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TeamCompPanelLayout = new javax.swing.GroupLayout(TeamCompPanel);
        TeamCompPanel.setLayout(TeamCompPanelLayout);
        TeamCompPanelLayout.setHorizontalGroup(
            TeamCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TeamCompBigBoiPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TeamCompPanelLayout.setVerticalGroup(
            TeamCompPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TeamCompBigBoiPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("                                              Comparision                                            ", TeamCompPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListOfChampionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListOfChampionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListOfChampionsActionPerformed

    private void ListOfChampionsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ListOfChampionsItemStateChanged
        
        String selectedChamp = (String)ListOfChampions.getSelectedItem();
        Champion selChamp = champs.get(selectedChamp);
        if(selChamp != null){
            ChampPicture.setIcon(selChamp.getSplashArt());
            SkillOrder.setIcon(selChamp.getSkillOrder());
        }
        else{
            ChampPicture.setIcon(new ImageIcon ("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/ChampionSA/NoChamp.PNG"));
        }
        
    }//GEN-LAST:event_ListOfChampionsItemStateChanged

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new MainWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    public void addChamps() throws IOException{
        
        Scanner allChamps1 = new Scanner(champList);
        allChamps1.next();
        while(allChamps1.hasNext()){
            String nextChamp = allChamps1.next();
            champs.put(nextChamp, new Champion(nextChamp));
        }
    }
    public ImageIcon setChampImg() throws IOException{
        try{
            return champs.get((String)ListOfChampions.getSelectedItem()).getSplashArt();
        
        }
        catch (Exception ioe) {
            return new ImageIcon();
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BUILDlabel;
    private javax.swing.JPanel BuildPanel;
    private javax.swing.JLabel ChampName1;
    private javax.swing.JLabel ChampName2;
    private javax.swing.JLabel ChampPicture;
    private javax.swing.JLabel ChampPicture1;
    private javax.swing.JLabel ChampPicture2;
    private javax.swing.JLabel ChampRole;
    private javax.swing.JLabel ChampRole1;
    private javax.swing.JLabel ChampRole2;
    private javax.swing.JPanel Character1;
    private javax.swing.JPanel Character2;
    private javax.swing.JTabbedPane CharacterComp;
    private javax.swing.JLabel ESkill1;
    private javax.swing.JPanel IndividualInfoPanel;
    private javax.swing.JLabel ListOfChamp;
    private javax.swing.JComboBox ListOfChampions;
    private javax.swing.JLabel MainKey;
    private javax.swing.JLabel QSkill1;
    private javax.swing.JLabel RSkill1;
    private javax.swing.JLabel RUNElabel;
    private javax.swing.JPanel Rune_Panel;
    private javax.swing.JLabel SkillOrder;
    private javax.swing.JPanel TeamCompBigBoiPanel;
    private javax.swing.JPanel TeamCompPanel;
    private javax.swing.JLabel WSkill1;
    private javax.swing.JLabel botKey;
    private javax.swing.JLabel botSubKey;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel midKey;
    private javax.swing.JLabel subKey;
    private javax.swing.JLabel subStat1;
    private javax.swing.JLabel subStat2;
    private javax.swing.JLabel subStat3;
    private javax.swing.JLabel topKey;
    private javax.swing.JLabel topSubKey;
    // End of variables declaration//GEN-END:variables
}
