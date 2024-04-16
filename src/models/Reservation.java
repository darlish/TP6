package models;

public class Reservation {
    private long id;
    private int nbResvation;

    ////////////////////////////////////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNbResvation() {
        return nbResvation;
    }

    public void setNbResvation(int nbResvation) {
        this.nbResvation = nbResvation;
    }

}
