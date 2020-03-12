/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoflegendsbuilder;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author hooten_866875
 */

public class Champion {
private String name;
private ImageIcon splashArt; 
private ImageIcon skillOrder;
private ImageIcon qSkill;
private ImageIcon wSkill;
private ImageIcon eSkill;
private ImageIcon rSkill;
private String qSkillInfo;
private String wSkillInfo;
private String eSkillInfo;
private String rSkillInfo;
    //public ArrayList<String> addSkills(){
        //will return the skill order of the champion in letters in the arrayList
   // }
    public Champion(){
        name = null;
        splashArt = null;    
        skillOrder = null;
        qSkill = null;
        wSkill = null;
        eSkill = null;
        rSkill = null;
        qSkillInfo = null;
        wSkillInfo = null;
        eSkillInfo = null;
        rSkillInfo = null;
    }
    public Champion(String n) throws IOException {
        name = n;
        setSplashArt();
        setSkillOrder();
    }
    public void setName(String name){
        this.name = name;
    }
    public ImageIcon getSplashArt() {
        return splashArt;
    }
    public void setSplashArt() throws IOException {
        
        splashArt = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds"
                + "/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Icon/"+ name + ".jpg");
        
        /*String imagePath = ("/U:/NetBeansProjects/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/ChampionSA/Aatrox.PNG");
        InputStream imgStream = Champion.class.getResourceAsStream(imagePath);
        BufferedImage myImg = ImageIO.read(imgStream);*/
        //splashArt.setImage(myImg);
        
    }

    public ImageIcon getSkillOrder() {
        return skillOrder;
    }

    public void setSkillOrder() {
        skillOrder = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds"
                + "/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/SkillOrder/"+ name +".JPG");
    }
    public ImageIcon getQSkill() {
        return qSkill;
    }

    public void setQSkill() {
        qSkill = new ImageIcon("C:/Users/hooten_866875/Desktop/New/LeagueBuilds-master/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Abilities/" + name + "Q.png");
    }

    public ImageIcon getqSkill() {
        return qSkill;
    }

    public void setqSkill(ImageIcon qSkill) {
        this.qSkill = qSkill;
    }

    public ImageIcon getwSkill() {
        return wSkill;
    }

    public void setwSkill(ImageIcon wSkill) {
        this.wSkill = wSkill;
    }

    public ImageIcon geteSkill() {
        return eSkill;
    }

    public void seteSkill(ImageIcon eSkill) {
        this.eSkill = eSkill;
    }

    public ImageIcon getrSkill() {
        return rSkill;
    }

    public void setrSkill(ImageIcon rSkill) {
        this.rSkill = rSkill;
    }

    public String getqSkillInfo() throws FileNotFoundException, IOException {
        String output = "";
        File file = new File("C:/Users/hooten_866875/Desktop/New/LeagueBuilds-"
                + "master/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Skill Info/AatroxqSkillInfo.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
  
        String st; 
        while ((st = br.readLine()) != null){ 
            output+= st + "\n";
        }
        return output;
    }

    public void setqSkillInfo(String qSkillInfo){
        
        this.qSkillInfo = qSkillInfo;
    }

    public String getwSkillInfo() {
        
        return wSkillInfo;
    }

    public void setwSkillInfo(String wSkillInfo) {
        this.wSkillInfo = wSkillInfo;
    }

    public String geteSkillInfo() {
        return eSkillInfo;
    }

    public void seteSkillInfo(String eSkillInfo) {
        this.eSkillInfo = eSkillInfo;
    }

    public String getrSkillInfo() {
        return rSkillInfo;
    }

    public void setrSkillInfo(String rSkillInfo) {
        this.rSkillInfo = rSkillInfo;
    }
    
   
}
