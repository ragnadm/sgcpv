/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Drake Shin
 */
public class Config {
    private static FileInputStream stream;
    
    public static Properties loadSell() throws FileNotFoundException, IOException{
        
        Properties prop = new Properties();
        
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        File file1 = new File(folder+File.separator+"sellControl.data");
        System.out.println(file1);
        
        if(!file1.exists()){
            try{
                PrintWriter writer = new PrintWriter(file1);
                
                writer.print("");
                
                writer.close();
                
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file1);
        prop.load(stream);
        return prop;
    }
    
    public static Properties loadClient() throws FileNotFoundException, IOException{
        
        
        Properties prop2 = new Properties();
        
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file2 = new File(folder+File.separator+"clientControl.data");
        
        
        if( !file2.exists()){
            try{
                
                PrintWriter writer2 = new PrintWriter(file2);
                
                
                writer2.print("");
               
               
                writer2.close();
                
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file2);
        prop2.load(stream);
        return prop2;
    }
    
    public static Properties loadProduct() throws FileNotFoundException, IOException{
        
        
        Properties prop3 = new Properties();
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file3 = new File(folder+File.separator+"productControl.data");
        
        if(!file3.exists()){
            try{
                
                PrintWriter writer3 = new PrintWriter(file3);
                
                writer3.print("");
                
                writer3.close();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file3);
        prop3.load(stream);
        return prop3;
    }
    
     public static Properties loadOrcamentos() throws FileNotFoundException, IOException{
        
        
        Properties prop4 = new Properties();
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file4 = new File(folder+File.separator+"budgetControl.data");
        
        if(!file4.exists()){
            try{
                
                PrintWriter writer4 = new PrintWriter(file4);
                
                writer4.print("");
                
                writer4.close();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file4);
        prop4.load(stream);
        return prop4;
    }
     
     public static Properties loadFornecedores() throws FileNotFoundException, IOException{
        
        
        Properties prop5 = new Properties();
        String path = System.getProperty("user.home") + File.separator + "Documents" + File.separator;
        File folder = new File(path+"SGVPC - System");
        if(!folder.exists()){
            try{
                folder.mkdirs();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        
        File file5 = new File(folder+File.separator+"fornecControl.data");
        
        if(!file5.exists()){
            try{
                
                PrintWriter writer5 = new PrintWriter(file5);
                
                writer5.print("");
                
                writer5.close();
            }catch(Exception e){JOptionPane.showMessageDialog(null, "Error: "+e);}
        }else{}
        
        stream = new FileInputStream(file5);
        prop5.load(stream);
        return prop5;
    }
     
}
