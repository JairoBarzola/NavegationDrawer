package lossnn.app.android.apphacetiempo.POJO;

/**
 * Created by Jair Barzola on 09-Mar-17.
 */

public class Actividad {
    private String nombre;
    private String meses;
    private String dias;
    private int mImageResourceId;
    private int color;

    public Actividad (String nombreActividad,
                      String mesActividad, String diaActividad,int imagen, int colorActividad){

        setNombre(nombreActividad);
        setMeses(mesActividad);
        setDias(diaActividad);
        setmImageResourceId(imagen);
        setColor(colorActividad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMeses() {
        return meses;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
