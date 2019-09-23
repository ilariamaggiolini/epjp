package s069;

public abstract class Mammal {
    protected int gestation;
//poteva essere privato
//    essendo abstract non posso creare la classe mammal e non istanziarla
//    infatti new mammal non si può creare ma i derivati cani e gatti si,
//    quindi solo array di Mammal.
    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
