package Conect;

import Obj.Empleado;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulker
 */
public class ConexionCliente extends Thread{
    
    private int port;
    private String ip;
    private Socket socket;
    private ObjectOutputStream out;
    private Empleado em;
    public ConexionCliente(int port, String ip) {
        this.port = port;
        this.ip = ip;
    }
    
    public ConexionCliente(){
        
    }

    @Override
    public void run() {
        try{
            this.socket = new Socket(this.ip,this.port);
            System.out.println("Conectado con el server");
            out = new ObjectOutputStream(socket.getOutputStream());
            em = new Empleado("123", "Pedro", "pass");
            out.writeObject(em);
            System.out.println("Objeto enviado por el out");
//            out.flush();
        }catch(Exception ex){
            System.out.println("ERROR: did not connect");
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
        }
    }
    
    
    
}
