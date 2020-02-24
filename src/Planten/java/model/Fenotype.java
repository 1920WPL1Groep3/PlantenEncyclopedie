package Planten.java.model;

public class Fenotype {
    private String bladvorm;
    private int levensvorm;
    private String habitus;
    private String bloeiwijze;
    private int bladgrootte;
    private String ratio_bloei_blad;
    private String spruitfenologie;
    private int plant_id;

    public Fenotype(String bladvorm, int levensvorm,
                    String habitus, String bloeiwijze,
                    int bladgrootte, String ratio_bloei_blad,
                    String spruitfenologie, int plant_id) {
        this.bladvorm = bladvorm;
        this.levensvorm = levensvorm;
        this.habitus = habitus;
        this.bloeiwijze = bloeiwijze;
        this.bladgrootte = bladgrootte;
        this.ratio_bloei_blad = ratio_bloei_blad;
        this.spruitfenologie = spruitfenologie;
        this.plant_id = plant_id;
    }
}
