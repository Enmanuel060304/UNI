
public class Alumnos {
    public String nombre;
    public String carrera;
    public String carnet;


    public Alumnos(String nombre, String carrera, String carnet)
    {
        this.nombre = nombre;
        this.carrera = carrera;
        this.carnet = carnet;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}
