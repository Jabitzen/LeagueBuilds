/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leagueoflegendsbuilder;

import java.awt.image.BufferedImage;
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
    //public ArrayList<String> addSkills(){
        //will return the skill order of the champion in letters in the arrayList
   // }
    public Champion(){
        name = null;
        splashArt = null;          
    }
    public Champion(String n) throws IOException {
        name = n;
        setSplashArt();
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
}
