package probleme;

public class SumaMatrice {
        public static double sumaMatrice(double[][] matrice) {
            double suma = 0;
            if (matrice == null || matrice.length == 0 || matrice[0].length == 0) {
                return 0;
            }

            for (int i = 0; i < matrice.length; i++) {
                for (int j = 0; j < matrice[i].length; j++) {
                    suma += matrice[i][j];
                }
            }
            return suma;
        }

        public static void main(String[] args) {
            double[][] matriceExemplu = {
                    {2, 6, 3.7, -13, 21}
            };
            double rezultat = sumaMatrice(matriceExemplu);
            System.out.println("Suma numerelor din matrice este: " + rezultat);
        }
    }

