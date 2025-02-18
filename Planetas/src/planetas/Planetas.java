package planetas;

import javax.swing.JOptionPane;

public class Planetas {

    public static void main(String[] args) {
        PlanetaPadre[] planeta1 = new PlanetaPadre[5];

        planeta1[0] = new PlanetaGaseoso("Nitrogeno", "Urano", 50.724, 2.9228, 3, 19.22);
        planeta1[1] = new PlanetaGaseoso("Helio", "Jupiter", 69.911, 762.36, 12, 5.20);
        planeta1[2] = new PlanetaGaseoso("Hidorgeno", "Saturno", 58.232, 1.4377, 5, 9.58);
        planeta1[3] = new PlanetaRocoso("Hematita", "Marte", 33.289, 248.29, 3, 1.88);
        planeta1[4] = new PlanetaRocoso("Hierro", "Tierra", 6.378, 147.87, 3, 1);

        for (int i = 0; i < planeta1.length; i++) {
            System.out.println("----------------------------------");
            if (planeta1[i].equals(planeta1[0])) {
                System.out.println("Planeta " + planeta1[0].getNombre() + " es planeta gaseoso");
            }
            if (planeta1[i].equals(planeta1[1])) {
                System.out.println("Planeta " + planeta1[1].getNombre() + " es planeta gaseoso");
            }
            if (planeta1[i].equals(planeta1[2])) {
                System.out.println("Planeta " + planeta1[2].getNombre() + " es planeta gaseoso");
            }
            if (planeta1[i].equals(planeta1[3])) {
                System.out.println("Planeta " + planeta1[3].getNombre() + " es planeta Rocoso");
            }
            if (planeta1[i].equals(planeta1[4])) {
                System.out.println("Planeta " + planeta1[4].getNombre() + " es planeta Rocoso");
            }
            ///////////////////////////////////////////////////////////////////////////////////
        }
        System.out.println("----------------------------------");

        if (planeta1[0].getTamanio() < planeta1[1].getTamanio()) {
            System.out.println("- Planeta " + planeta1[0].getNombre() + " es mas pequeño que " + planeta1[1].getNombre());
        } else {
            System.out.println("- Planeta " + planeta1[0].getNombre() + " es mas grande que " + planeta1[1].getNombre());
        }
        System.out.println("----------------------------------");

        if (planeta1[1].getTamanio() < planeta1[2].getTamanio()) {
            System.out.println("- Planeta " + planeta1[1].getNombre() + " es mas pequeño que " + planeta1[2].getNombre());
        } else {
            System.out.println("- Planeta " + planeta1[1].getNombre() + " es mas grande que " + planeta1[2].getNombre());
        }
        System.out.println("----------------------------------");

        if (planeta1[2].getTamanio() < planeta1[3].getTamanio()) {
            System.out.println("- Planeta " + planeta1[2].getNombre() + " es mas pequeño que " + planeta1[3].getNombre());
        } else {
            System.out.println("- Planeta " + planeta1[2].getNombre() + " es mas grande que " + planeta1[3].getNombre());
        }
        System.out.println("----------------------------------");

        if (planeta1[3].getTamanio() < planeta1[4].getTamanio()) {
            System.out.println("- Planeta " + planeta1[3].getNombre() + " es mas pequeño que " + planeta1[4].getNombre());
        } else {
            System.out.println("- Planeta " + planeta1[3].getNombre() + " es mas grande que " + planeta1[4].getNombre());
        }

        for (int i = 0; i < planeta1.length; i++) {
            planeta1[i].mostrarInfo();
            planeta1[i].medirAnio();
        }

    }

}
