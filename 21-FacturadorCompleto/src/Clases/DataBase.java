package Clases;

import java.sql.*;

public class DataBase {
    
    Statement manipularDB;
    
    public DataBase(){
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "almacenes";
        String database_user = "root";
        String database_password = "";
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            Connection conexion = DriverManager.getConnection(url, database_user, database_password);
            this.manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a: "+database_name);
        }catch(SQLException e){
            System.out.println("Error en conexion: "+e.getMessage());
            this.manipularDB = null;
        }
    }
    
    public Persona[] listaClientes(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Persona[] listaVendedores(){
        Persona [] listaClientes = new Persona [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Persona temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
                    listaClientes[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaClientes;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaClientes;
        }
    }
    
    public Producto[] listaProductos(){
        Producto [] listaProductos = new Producto [100];
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos");
            registros.next();
            if (registros.getRow()==1) {
                int indice = 0;
                do{
                    Producto temp = new Producto( registros.getString("id"),registros.getString("nombre"), registros.getString("precio") );
                    listaProductos[indice] = temp;
                    indice++;
                }while(registros.next());
            }
            return listaProductos;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return listaProductos;
        }
    }
    
    public Persona buscarCliente(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM clientes WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    public Producto buscarProducto(String id){
        Producto temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM productos WHERE id='"+id+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Producto( registros.getString("id"),registros.getString("nombre"), registros.getString("precio") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
    
    
    public Persona buscarVendedor(String cedula){
        Persona temp = null;
        try{
            ResultSet registros = this.manipularDB.executeQuery("SELECT * FROM vendedores WHERE cedula='"+cedula+"' ");
            registros.next();
            if (registros.getRow()==1) {
                temp = new Persona( registros.getString("cedula"),registros.getString("nombres"), registros.getString("apellidos"), registros.getString("telefono"), registros.getString("direccion"), registros.getString("email") );
            }
            return temp;
        }catch(SQLException e){
            System.out.println("Error en SELECT: "+e.getMessage());
            return temp;
        }
    }
   
    
    public boolean editarCliente(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE clientes SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarVendedor(Persona persona){
        boolean respuesta = false;
        String cedula = persona.getCedula();
        String nombres = persona.getNombres();
        String apellidos = persona.getApellidos();
        String telefono = persona.getTelefono();
        String direccion = persona.getDireccion();
        String email = persona.getEmail();
        
        try {
            String consulta = "UPDATE vendedores SET nombres='"+nombres+"', apellidos='"+apellidos+"', telefono='"+telefono+"', direccion='"+direccion+"', email='"+email+"' WHERE cedula='"+cedula+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean editarProducto(Producto producto){
        boolean respuesta = false;
        String id = producto.getId();
        String nombre = producto.getNombre();
        String precio = producto.getPrecio();
        
        try {
            String consulta = "UPDATE productos SET nombre='"+nombre+"', precio='"+precio+"' WHERE id='"+id+"'";
            int resp = manipularDB.executeUpdate(consulta);
            if (resp>0) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE: "+ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean insertarCliente(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO clientes(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    
    /**
     *
     * @param id
     * @param nombre
     * @param precio
     * @return
     */
    public boolean insertarProducto(String id, String nombre, String precio){
        String consulta = "INSERT INTO productos(id, nombre, precio) VALUES ('"+id+"','"+nombre+"','"+precio+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("PRODUCTO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    public boolean insertarVendedor(String cedula, String nombres, String apellidos, String telefono, String direccion, String email){
        String consulta = "INSERT INTO vendedores(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"') ";    
        try{
            int respuesta = manipularDB.executeUpdate(consulta);
            if (respuesta>0) {
                System.out.println("REGISTRO INSERTADO CON EXITO");
                return true;
            }else{
                return false;
            }
        }catch(SQLException e){
            System.out.println("Error al insertar: "+e.getMessage());
            return false;
        }
    }
    public boolean eliminarCliente(Persona persona){
        boolean respuesta=false;
        String cedula = persona.getCedula();
        try{
            String consulta ="DELETE FROM clientes WHERE cedula ='"+cedula+"'";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta==1){
                respuesta= true;
                
            }
            
            
        } catch (SQLException e){
            System.out.print("Error Delete"+e.getMessage());
        }
        if (respuesta){
                        System.out.print("Eliminado con exito");
                     
                }else {
                                    System.out.print("Nose puedo eliminar");

        }
        return true;
    }
    
     public boolean eliminarVendedor(Persona persona){
        boolean respuesta=false;
        String cedula = persona.getCedula();
        try{
            String consulta ="DELETE FROM vendedores WHERE cedula ='"+cedula+"'";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta==1){
                respuesta= true;
                
            }
            
            
        } catch (SQLException e){
            System.out.print("Error Delete"+e.getMessage());
        }
        if (respuesta){
                        System.out.print("Eliminado con exito");
                     
                }else {
                                    System.out.print("Nose puedo eliminar");

        }
        return true;
    }
     
     public boolean eliminarProducto(Producto producto){
        boolean respuesta=false;
        String id = producto.getId();
        try{
            String consulta ="DELETE FROM productos WHERE id ='"+id+"'";
                int resp_consulta = manipularDB.executeUpdate(consulta);
                if (resp_consulta==1){
                respuesta= true;
                
            }
            
            
        } catch (SQLException e){
            System.out.print("Error Delete"+e.getMessage());
        }
        if (respuesta){
                        System.out.print("Eliminado con exito");
                     
                }else {
                                    System.out.print("Nose puedo eliminar");

        }
        return true;
    }
   
    
    
}
