
package sistemabiblioteca;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.color.ColorSpace;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Junior
 */
public class SistemaBiblioteca extends JWindow {

    JProgressBar BarraDeProgresso;
    
    public SistemaBiblioteca() throws InterruptedException {
        
       
        int w = this.getToolkit().getDefaultToolkit().getScreenSize().width;
        int h = this.getToolkit().getDefaultToolkit().getScreenSize().height;
        
        int x = (w - 954)/2;
        int y = (h - 416)/2;
        
        JLabel img = new JLabel (new ImageIcon("src/Imagens/ImagemFlash2.jpg"));
        img.setLocation(new Point(0,0));
        img.setSize(954,416);
        
        this.setLayout(null);
        this.add(img);
        this.setLocation(new Point(x,y));
        this.setSize(954, 416);
        this.setVisible(true);
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR)); 
        
        
        BarraDeProgresso = new JProgressBar();
        BarraDeProgresso.setForeground(Color.GRAY);
        BarraDeProgresso.setBackground(Color.BLACK);
        BarraDeProgresso.setBounds(0,396,954,20);
        BarraDeProgresso.setStringPainted(true);
        this.add(BarraDeProgresso);
        
        new Thread(){
            public void run(){
                for (int progress = 0;progress < 101;progress++){
                    try{
                       BarraDeProgresso.setValue(progress); 
                       
                       sleep(80);
                    }
                    catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        Thread.sleep(9500);
        this.setVisible(false);
         
        
        
         try {  
        for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels() ) {  
            if ( "Windows".equals( info.getName() ) ) {  
                UIManager.setLookAndFeel( info.getClassName() );  
                break;  
            }  
        }  
    } catch ( UnsupportedLookAndFeelException exc ) {  
        exc.printStackTrace();  
    } catch ( ClassNotFoundException exc ) {  
        exc.printStackTrace();  
    } catch ( InstantiationException exc ) {  
        exc.printStackTrace();  
    } catch ( IllegalAccessException exc ) {  
        exc.printStackTrace();  
    }  
  
    
  
 
       
        MenuInicial a = new MenuInicial();
        a.setVisible(true);
        a.setResizable(false);
        a.setSize(400, 225);
        a.setLocationRelativeTo(null); 
        
       
    }
public static void main(String args[]) throws InterruptedException  {
   new SistemaBiblioteca();
}
  
    
}
