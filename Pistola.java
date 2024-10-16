public class Pistola extends Objeto {

    private boolean tienebala;

    public Pistola(String nombreobj, String desc, boolean disponible, boolean tienebala) {
        super(nombreobj, desc, disponible);
        this.tienebala = tienebala;
    }

    public boolean isTienebala() {
        return tienebala; //Saber si tiene bala o no
    }

    public void setTienebala(boolean tienebala) {
        this.tienebala = tienebala;
    }
}
