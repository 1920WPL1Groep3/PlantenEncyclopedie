package Planten.java.model;

import java.sql.Blob;
import java.util.List;

public class InfoTables {
    //Plant
    private List<String> types;
    private List<String> families;

    //Fenotype
    private List<String> kleuren;
    private List<String> bladgroottes;
    private List<String> bladvormen;
    private List<String> bloeiBladRatios;
    private List<String> spruitfenologieen;
    private List<String> bloeiwijzes;
    private List<Blob> bloeiwijzesFotos;
    private List<String> habitusMogelijkheden;
    private List<Blob> habitusFotos;
    private List<String> levensvormen;

    //Abiotische factoren
    private List<String> bezonningsMogelijkheden;
    private List<String> grondsoorten;
    private List<String> vochtbehoeftes;
    private List<String> voedingsbehoeftes;
    private List<String> antagonistischeOmgevingsReacties;
    private List<String> habitats;

    //Commensalisme
    private List<String> onstwikkelingssnelheden;
    private List<String> concurentiekrachten;
    private List<Integer> sociabiliteiten;
    private List<String> stratergieen;

    //Extra
    private List<Integer> nectarwaardes;
    private List<Integer> pollenwaardes;

    public InfoTables(List<String> types, List<String> families, List<String> kleuren, List<String> bladgroottes, List<String> bladvormen, List<String> bloeiBladRatios, List<String> spruitfenologieen, List<String> bloeiwijzes, List<Blob> bloeiwijzesFotos, List<String> habitusMogelijkheden, List<Blob> habitusFotos, List<String> levensvormen, List<String> bezonningsMogelijkheden, List<String> grondsoorten, List<String> vochtbehoeftes, List<String> voedingsbehoeftes, List<String> antagonistischeOmgevingsReacties, List<String> habitats, List<String> onstwikkelingssnelheden, List<String> concurentiekrachten, List<Integer> sociabiliteiten, List<String> stratergieen, List<Integer> nectarwaardes, List<Integer> pollenwaardes) {
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

    public List<String> getTypes() {
        return types;
    }

    public List<String> getFamilies() {
        return families;
    }

    public List<String> getKleuren() {
        return kleuren;
    }

    public List<String> getBladgroottes() {
        return bladgroottes;
    }

    public List<String> getBladvormen() {
        return bladvormen;
    }

    public List<String> getBloeiBladRatios() {
        return bloeiBladRatios;
    }

    public List<String> getSpruitfenologieen() {
        return spruitfenologieen;
    }

    public List<String> getBloeiwijzes() {
        return bloeiwijzes;
    }

    public List<Blob> getBloeiwijzesFotos() {
        return bloeiwijzesFotos;
    }

    public List<String> getHabitusMogelijkheden() {
        return habitusMogelijkheden;
    }

    public List<Blob> getHabitusFotos() {
        return habitusFotos;
    }

    public List<String> getLevensvormen() {
        return levensvormen;
    }

    public List<String> getBezonningsMogelijkheden() {
        return bezonningsMogelijkheden;
    }

    public List<String> getGrondsoorten() {
        return grondsoorten;
    }

    public List<String> getVochtbehoeftes() {
        return vochtbehoeftes;
    }

    public List<String> getVoedingsbehoeftes() {
        return voedingsbehoeftes;
    }

    public List<String> getAntagonistischeOmgevingsReacties() {
        return antagonistischeOmgevingsReacties;
    }

    public List<String> getHabitats() {
        return habitats;
    }

    public List<String> getOnstwikkelingssnelheden() {
        return onstwikkelingssnelheden;
    }

    public List<String> getConcurentiekrachten() {
        return concurentiekrachten;
    }

    public List<Integer> getSociabiliteiten() {
        return sociabiliteiten;
    }

    public List<String> getStratergieen() {
        return stratergieen;
    }

    public List<Integer> getNectarwaardes() {
        return nectarwaardes;
    }

    public List<Integer> getPollenwaardes() {
        return pollenwaardes;
    }
}
