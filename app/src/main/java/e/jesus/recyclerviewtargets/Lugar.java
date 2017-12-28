package e.jesus.recyclerviewtargets;

/**
 * Created by Jesus on 28/12/2017.
 */

public class Lugar {

    String nombre;
    String ubicacion;
    int valoracion;
    int imagen;

    public Lugar(String nombre, String ubicacion, int valoracion, int imagen) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.valoracion = valoracion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getValoracion() {
        return valoracion;
    }

    public int getImagen() {
        return imagen;
    }

}
