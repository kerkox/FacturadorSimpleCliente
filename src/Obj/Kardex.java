package Obj;

import java.io.Serializable;
import java.util.List;

public class Kardex implements Serializable {

    private String nombre;


    public Kardex(String id) throws Exception {
        if (id.equals("".trim())) {
            throw new Exception("No se permiten parametros vacios");
        }
        this.nombre = id;
        init();
    }

    public Kardex() {
        init();
    }

    public void init() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Kardex: " + nombre;
    }

    public void add(Empleado vendedor) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando agregar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void add(Cliente cliente) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando agregar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void add(Producto producto) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando agregar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void add(Venta venta) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando agregar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public Empleado accesoEmpleado(String id, String pass) throws Exception {
        //access allowed by Server autorization
        return null;
    }

    public Empleado findEmpleado(String id) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public Cliente findCliente(String id) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public Producto findProducto(String codigo) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public Venta findVenta(Long id) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public List<Cliente> getClientes() throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public List<Producto> getProductos() throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public List<Venta> getVentas() throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando buscar objeto
        //Se espera respuesta para poder determinar si fue exitoso
        return null;
    }

    public void edit(Venta venta) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando editar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void edit(Producto producto) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando editar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void edit(Cliente cliente) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando editar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void remove(Producto producto) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando eliminar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }

    public void remove(Cliente cliente) throws Exception {
        //Codigo cambia por conexion con servidor 
        //Solicitando eliminar objeto
        //Se espera respuesta para poder determinar si fue exitoso
    }
}
