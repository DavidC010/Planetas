
package planetas;


public class PlanetaPadre implements NuevoCuerpoCeleste {
    String nombre;
    double tamanio;
    double distanciaSol;
    int numLunas;
    double t;
    
            

    public PlanetaPadre() {
    }

    public PlanetaPadre(String nombre, double tamanio, double distanciaSol, int numLunas, double t) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.distanciaSol = distanciaSol;
        this.numLunas = numLunas;
        this.t = t;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public int getNumLunas() {
        return numLunas;
    }

    public void setNumLunas(int numLunas) {
        this.numLunas = numLunas;
    }
    
    public void mostrarInfo(){
        System.out.println("--Informacion del planeta--"
                + "\nNombre: " + nombre +
                "\nTamaño: " + tamanio + "km" +
                "\nDistancia al sol: " + distanciaSol + "km" +
                "\nNumero de lunas: " + numLunas);
    }

    @Override
    public double medirAnio() {
        double resultado = t * t * t ;
        long redondeado = Math.round(resultado);
        System.out.println("La cantidad de años en el planeta " + nombre + " es de " + redondeado + " años en el planeta tierra ");
        return redondeado;
    }

    @Override
    public void calculoGravedad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
