package Runnable;

import Conect.ConexionCliente;
import Gui.InitApp.CrearInstancia;
import Gui.Login;
import Obj.Cliente;
import Obj.Kardex;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Main {

    public static void main(String[] args) {
        
        //Inicio de ventana de login
        
        
        String[] os = System.getProperty("os.name").split(" ");
        String home = System.getProperty("user.home");
        String ubicacion = "";
        File fl = null;
        ObjectInputStream ois = null;
        String nombreInstancia = "";
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            if ("Windows".equals(os[0])) {
                ubicacion = "D:/Kardex.dat";
            } else if ("Linux".equals(os[0])) {
                ubicacion = home + "/Documentos/Kardex.dat";
            }
            fl = new File(ubicacion);
            if (fl.exists()) {
                ois = new ObjectInputStream(new FileInputStream(fl));
                nombreInstancia = (String) ois.readObject();
                Kardex kr = new Kardex(nombreInstancia);
                new Login(kr).setVisible(true);
            } else {
                new CrearInstancia(ubicacion).setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
