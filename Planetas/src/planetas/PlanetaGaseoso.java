package planetas;

public class PlanetaGaseoso extends PlanetaPadre implements NuevoCuerpoCeleste {

    String tipoGas;

    public PlanetaGaseoso() {
    }

    public PlanetaGaseoso(String tipoGas, String nombre, double tamanio, double distanciaSol, int numLunas, double t) {
        super(nombre, tamanio, distanciaSol, numLunas, t);
        this.tipoGas = tipoGas;
    }

    public String getTipoGas() {
        return tipoGas;
    }

    public void setTipoGas(String tipoGas) {
        this.tipoGas = tipoGas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo de gas:" + tipoGas);
    }


}
