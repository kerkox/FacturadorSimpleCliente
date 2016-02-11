package Conect;

import Gui.Login;
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
    private Login login = null;
    private Empleado em; // Objecto de prueba

    public ConexionCliente(int port, String ip, Login login) {
        this.port = port;
        this.ip = ip;
        this.login = login;
    }

    public ConexionCliente(int port, String ip, String ClienteId, Login login) {
        this.port = port;
        this.ip = ip;
        this.ClienteId = ClienteId;
        this.login = login;
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
            out.writeInt(1);
            out.writeObject(this.ClienteId);
//Enviando el Objeto Empleado
//            em = new Empleado("123", "Pedro", "pass");
//            out.writeInt(2);
//            out.writeObject(em);
//            System.out.println("Objeto enviado por el out");
            out.flush();
        } catch (Exception ex) {
            System.out.println("ERROR: did not connect");
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion");
        }
    }

    public void enviarObjeto(int code, Object obj) {
        //Este se usa para enviar un obejto e indicandole que tipo

//        enviarTrama();
    }

    public void enviarTrama(int code, Object obj) {
        try {
//            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeInt(code);
            out.writeObject(obj);
            out.flush(); // para liberar la salida
            } catch (Exception ex) {
            ex.printStackTrace();
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
    public boolean logueo() {
        boolean login = false;
        try {
            System.out.println("Aqui se va a leer los datos");
//            in = new ObjectInputStream(socket.getInputStream());
            //##########################################
            //##########################################
            //ERROR - ERROR - ERROR - ERROR - ERROR - ERROR
            //##########################################
            //##########################################
            
            int op = in.readInt();
            
            //#########################################S
            System.out.println("valor de op: " + op);
            if (op == 2) {
                login = "true".equals(in.readObject());
            }
            System.out.println("Valor de login: " + login);
            System.out.println("se leyo los datos");
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("###error: "+ex.getMessage());
        }
        System.out.println("++Va a retornar los datos");
        return login;
    }

    public Object recibirObjeto() {
        Object salida = null;
        int code = -1;
        try {
            code = in.readInt();
            salida = in.readObject();
            switch (code) {
                case 1:
                    break;
                case 2:
                    //obtencion de respuesta para el logueo
                    boolean success = (boolean) salida;
                    break;
                case 3:
                    break;

            }
        } catch (Exception ex) {
            System.out.println("ERROR AL RECIBIR EL OBJETO");
            JOptionPane.showMessageDialog(null, "Error al recibir el objeto");

        }
        return salida;

    }

}
