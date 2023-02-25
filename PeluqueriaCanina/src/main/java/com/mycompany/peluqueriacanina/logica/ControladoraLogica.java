package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

//esta clase crea los objetos y le asigna valores y llama a la controladora de persistencia para que los guarde  en la BD
public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    //La controladora de logica recibe los dato que le mando la IGU
    //Crea un duenio
    //Crea una mascota
    // Y llama a la persistencia
    public void guardar(String nombreAnim, String raza, String color, String nombreDuenio, String Observa, String alergico, String atencioEsp, String celDuenio) {
        
        //creamos el duenio y asignamos sus valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreAnim);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencioEsp);
        masco.setObservaciones(Observa);
        masco.setUnDuenio(duenio);
        
        //llama a la controladora de persistencia para que los guarde en la BD
        controlPersis.guardar(duenio, masco);
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(long numCliente) {
        controlPersis.borrarMascota(numCliente);
    }

    public Mascota traerMascota(long numCliente) {

        return controlPersis.traerMascota(numCliente);
        
    }

    public void modificarMascota(Mascota masco, String nombreAnim, String raza, String color, String nombreDuenio, String Observa, String alergico, String atencioEsp, String celDuenio) {
        
        //seteo los datos modificados en la mascota vieja que viene como parametro tambien
        
        masco.setNombre(nombreAnim);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencionEspecial(atencioEsp);
        masco.setObservaciones(Observa);
        
        //modifico la mascota
        controlPersis.modificarMascota(masco);
        
        //seteo valores del duenio
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getIdDuenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        //llamar al modificar duenio
        this.modificarDuenio(dueno);
        
    }

    private Duenio buscarDuenio(Long idDuenio) {
        
        return controlPersis.traerDuenio(idDuenio);
        
    }

    private void modificarDuenio(Duenio dueno) {
        controlPersis.modificarDuenio(dueno);
    }
    
    
    
    
    
}
