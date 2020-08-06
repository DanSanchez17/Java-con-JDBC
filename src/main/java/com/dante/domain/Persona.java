package com.dante.domain;

/**
 *
 * En esta clase iran nuestro mapeo con los atributos de la tabla de nuestra bd
 * puede ser el paquete tambien llamado modelo (MVC)
 * @author Dante Sánchez
 */
public class Persona {
    
    //lo primero es derinir las variables que deben coincidir con loa atributos de nuestra tabla de la bd
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    
    
    //ahora crearemos constructores sobrecargados, cada uno tendra una funcion
    
    //constructor vacio
    public Persona(){
        
    }
    
    
    //podemos crear otro cosntructor solo con el idPersona, para eliminar registros
    //solo necesitamo este atributo(idPersona)
    public Persona(int idPersona){
        this.idPersona = idPersona;
    }
    
    
    //podemos crear otro constructor para crear nuevos registros
    //por lo tanto necesitamos los valores a llenar EXCEPTO idPErsona, ya que este es autoincrementable en nuestra bd
    public Persona(String nombre, String apellido, String email, String telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    
    
    //para modificar un registro debemos especificar todos nuestros atributos incluyendo el idPersona
    public Persona(int idPersona, String nombre, String apellido, String email, String telefono){
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
                
    }

    
    
    
//AHORA ES necesario incluir los metodos get y set de nuestros atributos
public int getIdPersona(){
    return idPersona;
}
public void setIdPersona(int idPersona){
    this.idPersona = idPersona;
}

public String getNombre(){
    return nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getApellido(){
    return apellido;
}
public void setApellido(String apellido){
    this.apellido = apellido;
}

public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}

public String getTelefono(){
    return telefono;
}
public void setTelefono(String telefono){
    this.telefono = telefono;
}




//por ultimo añadimos el metodo toString para que podamos ver en consola el estdo del objeto que estemos consultando

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }




    
    
}
