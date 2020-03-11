package Planten.java.model;

import javafx.collections.ObservableList;

import java.sql.Blob;

/**@author Siebe*/
public class InfoTables {
    //Plant
    private ObservableList<String> types;
    private ObservableList<String> families;

    //Fenotype
    private ObservableList<String> kleuren;
    private ObservableList<String> bladgroottes;
    private ObservableList<String> bladvormen;
    private ObservableList<String> bloeiBladRatios;
    private ObservableList<String> spruitfenologieen;
    private ObservableList<String> bloeiwijzes;
    private ObservableList<Blob> bloeiwijzesFotos;
    private ObservableList<String> habitusMogelijkheden;
    private ObservableList<Blob> habitusFotos;
    private ObservableList<String> levensvormen;

    //Abiotische factoren
    private ObservableList<String> bezonningsMogelijkheden;
    private ObservableList<String> grondsoorten;
    private ObservableList<String> vochtbehoeftes;
    private ObservableList<String> voedingsbehoeftes;
    private ObservableList<String> antagonistischeOmgevingsReacties;
    private ObservableList<String> habitats;

    //Commensalisme
    private ObservableList<String> onstwikkelingssnelheden;
    private ObservableList<String> concurentiekrachten;
    private ObservableList<Integer> sociabiliteiten;
    private ObservableList<String> stratergieen;

    //Extra
    private ObservableList<Integer> nectarwaardes;
    private ObservableList<Integer> pollenwaardes;

    public InfoTables(ObservableList<String> types, ObservableList<String> families, ObservableList<String> kleuren, ObservableList<String> bladgroottes, ObservableList<String> bladvormen, ObservableList<String> bloeiBladRatios, ObservableList<String> spruitfenologieen, ObservableList<String> bloeiwijzes, ObservableList<Blob> bloeiwijzesFotos, ObservableList<String> habitusMogelijkheden, ObservableList<Blob> habitusFotos, ObservableList<String> levensvormen, ObservableList<String> bezonningsMogelijkheden, ObservableList<String> grondsoorten, ObservableList<String> vochtbehoeftes, ObservableList<String> voedingsbehoeftes, ObservableList<String> antagonistischeOmgevingsReacties, ObservableList<String> habitats, ObservableList<String> onstwikkelingssnelheden, ObservableList<String> concurentiekrachten, ObservableList<Integer> sociabiliteiten, ObservableList<String> stratergieen, ObservableList<Integer> nectarwaardes, ObservableList<Integer> pollenwaardes) {
        this.types = types;
        this.families = families;
        this.kleuren = kleuren;
        this.bladgroottes = bladgroottes;
        this.bladvormen = bladvormen;
        this.bloeiBladRatios = bloeiBladRatios;
        this.spruitfenologieen = spruitfenologieen;
        this.bloeiwijzes = bloeiwijzes;
        this.bloeiwijzesFotos = bloeiwijzesFotos;
        this.habitusMogelijkheden = habitusMogelijkheden;
        this.habitusFotos = habitusFotos;
        this.levensvormen = levensvormen;
        this.bezonningsMogelijkheden = bezonningsMogelijkheden;
        this.grondsoorten = grondsoorten;
        this.vochtbehoeftes = vochtbehoeftes;
        this.voedingsbehoeftes = voedingsbehoeftes;
        this.antagonistischeOmgevingsReacties = antagonistischeOmgevingsReacties;
        this.habitats = habitats;
        this.onstwikkelingssnelheden = onstwikkelingssnelheden;
        this.concurentiekrachten = concurentiekrachten;
        this.sociabiliteiten = sociabiliteiten;
        this.stratergieen = stratergieen;
        this.nectarwaardes = nectarwaardes;
        this.pollenwaardes = pollenwaardes;
    }

    public ObservableList<String> getTypes() {
        return types;
    }

    public ObservableList<String> getFamilies() {
        return families;
    }

    public ObservableList<String> getKleuren() {
        return kleuren;
    }

    public ObservableList<String> getBladgroottes() {
        return bladgroottes;
    }

    public ObservableList<String> getBladvormen() {
        return bladvormen;
    }

    public ObservableList<String> getBloeiBladRatios() {
        return bloeiBladRatios;
    }

    public ObservableList<String> getSpruitfenologieen() {
        return spruitfenologieen;
    }

    public ObservableList<String> getBloeiwijzes() {
        return bloeiwijzes;
    }

    public ObservableList<Blob> getBloeiwijzesFotos() {
        return bloeiwijzesFotos;
    }

    public ObservableList<String> getHabitusMogelijkheden() {
        return habitusMogelijkheden;
    }

    public ObservableList<Blob> getHabitusFotos() {
        return habitusFotos;
    }

    public ObservableList<String> getLevensvormen() {
        return levensvormen;
    }

    public ObservableList<String> getBezonningsMogelijkheden() {
        return bezonningsMogelijkheden;
    }

    public ObservableList<String> getGrondsoorten() {
        return grondsoorten;
    }

    public ObservableList<String> getVochtbehoeftes() {
        return vochtbehoeftes;
    }

    public ObservableList<String> getVoedingsbehoeftes() {
        return voedingsbehoeftes;
    }

    public ObservableList<String> getAntagonistischeOmgevingsReacties() {
        return antagonistischeOmgevingsReacties;
    }

    public ObservableList<String> getHabitats() {
        return habitats;
    }

    public ObservableList<String> getOnstwikkelingssnelheden() {
        return onstwikkelingssnelheden;
    }

    public ObservableList<String> getConcurentiekrachten() {
        return concurentiekrachten;
    }

    public ObservableList<Integer> getSociabiliteiten() {
        return sociabiliteiten;
    }

    public ObservableList<String> getStratergieen() {
        return stratergieen;
    }

    public ObservableList<Integer> getNectarwaardes() {
        return nectarwaardes;
    }

    public ObservableList<Integer> getPollenwaardes() {
        return pollenwaardes;
    }
}
