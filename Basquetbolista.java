package proyectos.de.clase;

public class Basquetbolista {
    int dorsal, triples;
    String equipo,posicion;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void estadistica(){
        System.out.println("El jugador con el dorsal "+getDorsal() +" marcó un total de "+getTriples()+" triples en el juego");
    }
    public void bloqueo(){
        System.out.println("¡ BLOQUEO !");
    }
    public boolean resultado(boolean r){
        return r;
    }
}
