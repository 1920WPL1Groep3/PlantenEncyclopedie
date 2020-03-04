package Planten.java.model;

import Planten.java.CommMulti_Eigenschap;

import java.util.List;

public class Commensalisme {
    private int id;
    private int plant_id;
    private String strategie;
    private String ontwikkelingssnelheid;
    private List<CommMulti_Eigenschap> multiEigenschappen;

    public Commensalisme(int id, int plant_id, String strategie, String ontwikkelingssnelheid, List<CommMulti_Eigenschap> multiEigenschappen) {
        this.id = id;
        this.plant_id = plant_id;
        this.strategie = strategie;
        this.ontwikkelingssnelheid = ontwikkelingssnelheid;
        this.multiEigenschappen = multiEigenschappen;
    }

    public int getId() {
        return id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public String getStrategie() {
        return strategie;
    }

    public String getOntwikkelingssnelheid() {
        return ontwikkelingssnelheid;
    }

    public List<CommMulti_Eigenschap> getMultiEigenschappen() {
        return multiEigenschappen;
    }
}
