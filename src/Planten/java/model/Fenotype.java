package Planten.java.model;

import Planten.java.FenoMulti_Eigenschap;

import java.util.List;

public class Fenotype {
    private int id;
    private int plant_id;
    private String bladvorm;
    private int levensvorm;
    private String habitus;
    private String bloeiwijze;
    private int bladgrootte;
    private String ratio_bloei_blad;
    private String spruitfenologie;

    private List<FenoMulti_Eigenschap> multiEigenschappen;

    public Fenotype(int id, int plant_id, String bladvorm, int levensvorm, String habitus, String bloeiwijze, int bladgrootte, String ratio_bloei_blad, String spruitfenologie, List<FenoMulti_Eigenschap> multiEigenschappen) {
        this.id = id;
        this.plant_id = plant_id;
        this.bladvorm = bladvorm;
        this.levensvorm = levensvorm;
        this.habitus = habitus;
        this.bloeiwijze = bloeiwijze;
        this.bladgrootte = bladgrootte;
        this.ratio_bloei_blad = ratio_bloei_blad;
        this.spruitfenologie = spruitfenologie;
        this.multiEigenschappen = multiEigenschappen;
    }

    public int getId() {
        return id;
    }

    public int getPlant_id() {
        return plant_id;
    }

    public String getBladvorm() {
        return bladvorm;
    }

    public int getLevensvorm() {
        return levensvorm;
    }

    public String getHabitus() {
        return habitus;
    }

    public String getBloeiwijze() {
        return bloeiwijze;
    }

    public int getBladgrootte() {
        return bladgrootte;
    }

    public String getRatio_bloei_blad() {
        return ratio_bloei_blad;
    }

    public String getSpruitfenologie() {
        return spruitfenologie;
    }

    public List<FenoMulti_Eigenschap> getMultiEigenschappen() {
        return multiEigenschappen;
    }
}
