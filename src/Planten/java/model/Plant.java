package Planten.java.model;

public class Plant {
    private int id;
    private String type;
    private String familie;
    private String geslacht;
    private String soort;
    private String variatie;
    private int minPlantdichtheid;
    private int maxPlantdichtheid;

    public Plant(int id, String type, String familie, String geslacht, String soort, String variatie, int minPlantdichtheid, int maxPlantdichtheid) {
        this.id = id;
        this.type = type;
        this.familie = familie;
        this.geslacht = geslacht;
        this.soort = soort;
        this.variatie = variatie;
        this.minPlantdichtheid = minPlantdichtheid;
        this.maxPlantdichtheid = maxPlantdichtheid;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return this.geslacht +" "+ this.soort +" "+ this.variatie;
    }


}