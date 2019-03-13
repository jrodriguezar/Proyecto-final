package Objetos;

/**
 *
 * @author Jhon
 */
public class Enemigosimple extends Thread{
    private double xref;
    private double yref;
    private double alto;
    private double ancho;

    public Enemigosimple(double xref, double yref, double alto, double ancho) {
        this.xref = xref;
        this.yref = yref;
        this.alto = alto;
        this.ancho = ancho;
    }



    public void setAlto(double alto) {
        this.alto = alto;
    }


    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public void setXref(double xref) {
        this.xref = xref;
    }

    public void setYref(double yref) {
        this.yref = yref;
    }

    public double getXref() {
        return xref;
    }

    public double getYref() {
        return yref;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    public void moverderecha(){
        xref = xref+1;
    }
    
    public void moverizquierda(){
        xref = xref-1;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            xref--;
        }
        /*for (int i = 0; i < 300; i++) {
            xref++;
        }*/
    }
}