public class Fraction {
    private final int numerateur;
    private final int denominateur;

    public Fraction(final int numerateur, final int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }

    public Fraction(final int numerateur){
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction(){
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    public double valeurDecimale() {
        return (double) numerateur / denominateur;
    }

    @Override
    public String toString() {
        return "Je suis une fraction.";
    }
}
