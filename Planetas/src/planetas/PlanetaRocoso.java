
package planetas;


public class PlanetaRocoso extends PlanetaPadre implements NuevoCuerpoCeleste {
    String tipoMetal;
    
    public PlanetaRocoso() {
    }

    public PlanetaRocoso(String tipoMetal, String nombre, double tamanio, double distanciaSol, int numLunas, double t) {
        super(nombre, tamanio, distanciaSol, numLunas, t);
        this.tipoMetal = tipoMetal;
    }

  

    

    public String getTipoMetal() {
        return tipoMetal;
    }

    public void setTipoMetal(String tipoMetal) {
        this.tipoMetal = tipoMetal;
    }
    
    @Override
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("Tipo de metal:" + tipoMetal);
    }

    

    
    
    
}
