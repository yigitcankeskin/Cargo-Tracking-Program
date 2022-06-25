
package ileripcprogproje;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class AssesmentApp {
 private long kno;
 private long TC;
 private String ktt;
 private String kadres;
 private File f = new File("arsiv.txt");
    public long getKno() {
        return kno;
    }

    public void setKno(long kno) {
        this.kno = kno;
    }

    public long getTC() {
        return TC;
    }

    public void setTC(long TC) {  
        this.TC = TC;
    }

    public String getKtt() {
        return ktt;
    }

    public void setKtt(String ktt) {
        this.ktt = ktt;
    }

    public String getKadres() {
        return kadres;
    }

    public void setKadres(String kadres) {
        this.kadres = kadres;
    }
    public void dosyayaYaz(long kno,long TC,String ktt,String kadres) 
    {
     try {  
     FileWriter fw;
     fw = new FileWriter(f,true);
		
     fw.write(kno+" "+TC+" "+ktt+" "+kadres+" "+"\n");
     fw.close();   
          } 
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    public int goruntule(long kno)
    {
     int flag=0;
     try {
         
         Scanner ff;
         ff = new Scanner(new File("arsiv.txt"));
         while(ff.hasNext()) {
         long kno2      = ff.nextLong();
         long TC2       = ff.nextLong();
         String ktt2   = ff.next();
         String kadres2 = ff.next();
         if(kno2==kno)
         {
         TC=TC2;
         ktt=ktt2;
         kadres=kadres2;
         this.kno=kno2;
         flag=1;
         }
                     
         
         }
         
     } catch (FileNotFoundException ex) {
         Logger.getLogger(AssesmentApp.class.getName()).log(Level.SEVERE, null, ex);
     }
			 
     return flag;   
    }
      public boolean Lıstele(int flag)
    {
     int flag2=-1;
     boolean empty =true;
     try {
         
         Scanner ff;
         ff = new Scanner(new File("arsiv.txt"));
         while(ff.hasNext()) {
         long kno2      = ff.nextLong();
         long TC2       = ff.nextLong();
         String ktt2   = ff.next();
         String kadres2 = ff.next();
         flag2++;
         if(flag==flag2)
         {
         TC=TC2;
         ktt=ktt2;
         kadres=kadres2;
         this.kno=kno2;
         empty = false;
         }
                     
         
         }
         
     } catch (FileNotFoundException ex) {
         Logger.getLogger(AssesmentApp.class.getName()).log(Level.SEVERE, null, ex);
     }
			 
     return empty;
    }
}
