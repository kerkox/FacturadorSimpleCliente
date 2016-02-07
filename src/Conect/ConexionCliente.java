package Conect;

import Obj.Empleado;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulker
 */
public class ConexionCliente extends Thread {

    private int port;
    private String ip;
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;
    private String ClienteId = "User";

    private Empleado em; // Objecto de prueba

    public ConexionCliente(int port, String ip) {
        this.port = port;
        this.ip = ip;
    }

    public ConexionCliente(int port, String ip, String ClienteId) {
        this.port = port;
        this.ip = ip;
        this.ClienteId = ClienteId;
    }

    public ConexionCliente() {

    }

    @Override
    public void run() {
        try {
            this.socket = new Socket(this.ip, this.port);
            System.out.println("Conectado con el server");
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            //Envio de Id del cliente  
            out.writeUTF(this.ClienteId);
//Enviando el Objeto Empleado
            em = new Empleado("123", "Pedro", "pass");
            out.writeObject(em);
            System.out.println("Objeto enviado por el out");
            out.flush();
        } catch (Exception ex) {
            System.out.println("ERROR: did not connect");
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
        }
    }

    public void enviarObjeto(Object obj) {
//        enviarTrama();
    }

    public void enviarTrama(int code, Object obj) {
        try {
            out.writeInt(code);
            out.writeObject(obj);
            out.flush(); // para liberar la salida
        } catch (Exception ex) {
            System.out.println("Error al enviar los datos");
            JOptionPane.showMessageDialog(null, "ERROR no se pudo enviar el objeto");

        }
    }

    /**
     * Recibe un objeto despues de solicitado al servidor
     *
     * @return regresa un objeto para su posterior manejo con un casting ya que
     * lo que se solicita es lo que se recibe
     */
    public Object recibirObjeto() {
        Object salida = null;
        try {
            salida = in.readObject();
        } catch (Exception ex) {
            System.out.println("ERROR AL RECIBIR EL OBJETO");
            JOptionPane.showMessageDialog(null, "Error al recibir el objeto");

        }
        return salida;

    }

}
