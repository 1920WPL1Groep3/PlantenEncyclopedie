package Planten.java.model;

import Planten.java.Foto_Eigenschap;

import java.util.List;


public class Foto {
    private int plant_id;
    private List<Foto_Eigenschap> fotos;

    public Foto(int plant_id, List<Foto_Eigenschap> fotos) {
        this.plant_id = plant_id;
        this.fotos = fotos;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public List<Foto_Eigenschap> getFotos() {
        return fotos;
    }

}
