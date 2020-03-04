package Planten.java.model;

import Planten.java.Beheerdaad_Eigenschap;

import java.util.List;

public class Beheer {
    private int plant_id;
    private List<Beheerdaad_Eigenschap> multiEigenschappen;

    public Beheer(int plant_id, List<Beheerdaad_Eigenschap> multiEigenschappen) {
        this.plant_id = plant_id;
        this.multiEigenschappen = multiEigenschappen;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public List<Beheerdaad_Eigenschap> getMultiEigenschappen() {
        return multiEigenschappen;
    }
}
