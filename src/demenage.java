
public class demenage {

    public static void main(String[] args) {
        int nombreCartons = 34;
        int capaciteCamion = 9;
        int voyages = 0;
        int cartonsDansCamion = 0;


        while (nombreCartons > 0) {

            if (nombreCartons > capaciteCamion) {
                cartonsDansCamion = 9;
            } else {
                cartonsDansCamion = nombreCartons;
            }

            // Pour retourner le plus petit de deux nombres => Math.min
            // cartonsDansCamion = Math.min(nombreCartons, capaciteCamion);


            nombreCartons = nombreCartons - cartonsDansCamion;
            // System.out.println (cartonsDansCamion);
            System.out.println(nombreCartons);
            voyages++;

            System.out.println("Voyage de " + cartonsDansCamion + " cartons.");
        }

        System.out.println(voyages + " : voyages total");
    }
}
