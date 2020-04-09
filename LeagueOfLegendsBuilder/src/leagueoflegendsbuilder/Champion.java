/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoflegendsbuilder;

import java.io.IOException;
import javax.swing.ImageIcon;

public class Champion {
private String name;
private ImageIcon splashArt; 
private ImageIcon skillOrder;
private ImageIcon runes;
private ImageIcon builds;
private ImageIcon skills;
private ImageIcon q;
private ImageIcon w;
private ImageIcon e;
private ImageIcon r;
    //public ArrayList<String> addSkills(){
        //will return the skill order of the champion in letters in the arrayList
   // }
    public Champion(){
        name = null;
        splashArt = null;    
        skillOrder = null;
        runes = null;
        builds = null;
        q = null;
        w= null;
        e= null;
        r= null;
        
    }
    public Champion(String n) throws IOException {
        name = n;
        setSplashArt();
        setSkillOrder();
        setRunes();
        setBuild();
        setQ();
        setW();
        setE();
        setR();
    }
    public void setName(String name){
        this.name = name;
    }
    public ImageIcon getSplashArt() {
        return splashArt;
    }
    public void setSplashArt() throws IOException {
        
        splashArt = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Icon/"+ name + ".jpg");
        
        /*String imagePath = ("/U:/NetBeansProjects/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/ChampionSA/Aatrox.PNG");
        InputStream imgStream = Champion.class.getResourceAsStream(imagePath);
        BufferedImage myImg = ImageIO.read(imgStream);*/
        //splashArt.setImage(myImg);
        
    }
    public ImageIcon getSkillOrder() {
        return skillOrder;
    }
    public void setSkillOrder() {
        skillOrder = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/SkillOrder/"+ name +".JPG");
    }
    public void setRunes(){
        runes = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Runes/"+ name + ".JPG");
    }
    public ImageIcon getRunes(){
        return runes;
    }
    public void setBuild(){
        builds = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Builds/"+ name + ".JPG");
    }
    public ImageIcon getBuild(){
        return builds;
    }
    public ImageIcon getQ() {
        return q;
    }
    public void setQ() {
        q = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Abilities/" + name + "Q.png");
    }
    public ImageIcon getW() {
        return w;
    }

    public void setW() {
       w = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Abilities/" + name + "W.png");
    }

    public ImageIcon getE() {
        return e;
    }

    public void setE() {
        e = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Abilities/" + name + "E.png");
    }

    public ImageIcon getR() {
        return r;
    }

    public void setR() {
        r = new ImageIcon("C:/Users/jghoo/Documents/GitHub/LeagueBuilds/LeagueOfLegendsBuilder/src/leagueoflegendsbuilder/Champion Abilities/" + name + "R.png");
    }
    
   
}
