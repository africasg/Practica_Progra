public abstract class Objeto {
    private String nombreobj;
    private String desc;
    private boolean disponible;

    public Objeto(String nombreobj, String desc, boolean disponible) {
        this.nombreobj = nombreobj;
        this.desc = desc;
        this.disponible = disponible;
    }

    public String getNombreobj() {
        return nombreobj;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isDisponible() {
        return disponible;
    }

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

}




