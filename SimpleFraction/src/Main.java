public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1, 2);

        //assert fraction1.valeurDecimale() == 0.5 : "Test de la valeur décimale échoué";
        System.out.println(fraction1.valeurDecimale());
        System.out.println(fraction1.toString());
    }
}
