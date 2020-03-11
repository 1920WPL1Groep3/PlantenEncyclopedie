package Planten.java.dao;

import java.sql.Blob;

public interface Queries {
    /* QUERIES om alle gegevens uit een tabel te halen per plant ID */
    String GETPLANTBYID = "SELECT * FROM plant WHERE plant_id = ?";

    String GETFENOTYPEBYPLANTID = "SELECT * FROM fenotype WHERE plant_id = ?";
    String GETFENOTYPEMULTIBYPLANTID = "SELECT * FROM fenotype_multi WHERE plant_id = ?";

    String GETABIOTISCHBYPLANTID = "SELECT * FROM abiotische_factoren WHERE plant_id = ?";
    String GETABIOTISCHBMULTIYPLANTID = "SELECT * FROM abiotisch_multi WHERE plant_id = ?";

    String GETCOMMENSALISMEBYPLANTID = "SELECT * FROM commensialisme WHERE plant_id = ?";
    String GETCOMMENSALISMEMULTIBYPLANTID = "SELECT * FROM commensialisme_multi WHERE plant_id = ?";

    String GETBEHEERBYPLANTID = "SELECT * FROM beheer WHERE plant_id = ?";

    String GETEXTRABYPLANTID = "SELECT * FROM extra WHERE plant_id = ?";

    String GETFOTOBYPLANTID = "SELECT * FROM foto WHERE plant_id = ?";

    //TODO omzetten naar queries -> makkelijker onderhoud en anti-hardcoding
    String GETINFOTABLE = "SELECT ? FROM ?";


    String GETPLANTSBYPLANT =
            "SELECT * FROM plant WHERE " +
                    "type = ? OR  1=? " +
                    "AND " +
                    "familie = ? OR 1=?" +
                    "AND " +
                    "fgsv LIKE ? OR 1=?";

    String GETEXTRASBYEXTRA =
            "SELECT * FROM extra WHERE " +
                    "plant_id IN ? " +
                    "AND " +
                    "nectarwaarde = ? OR 1=?" +
                    "AND " +
                    "pollenwaarde = ? OR 1=?" +
                    "AND " +
                    "bijvriendelijk = ? OR 1=?" +
                    "AND " +
                    "eetbaar = ? OR 1=?" +
                    "AND " +
                    "kruidgebruik = ? OR 1=?" +
                    "AND " +
                    "geurend = ? OR 1=?" +
                    "AND " +
                    "vorstgevoelig = ? OR 1=?";

    String GETTYPEBYPLANTID =
            "SELECT type_naam FROM type WHERE type_id = type_id FROM plant";

    String GETFAMILIEBYPLANTID =
            "SELECT familie_naam FROM familie WHERE familie_id = familie_id FROM plant";

    /* QUERIES om de STRING gegevens uit de naakte tabellen te halen
    * om velden te kunnen in/aanvullen */

    String GETLEVENSDUURBYLEVENSDUUR =
            "SELECT waarde FROM levensduur_concurrentiekracht";

    String GETSTRATEGIEBYSTRATEGIE =
            "SELECT waarde FROM strategie";

    String GETONTWIKKELBYONTWIKKELSNELHEID =
            "SELECT waarde FROM ontwikkelingssnelheid";

    String GETVOEDINGBYVOEDINGSBEHOEFTE =
            "SELECT waarde FROM voedingsbehoefte";

    String GETVOCHTBYVOCHTBEHOEFTE =
            "SELECT waarde FROM vochtbehoefte";

    String GETHABITATBYHABITAT =
            "SELECT waarde FROM habitat" +
            "SELECT afkorting FROM habitat";

    String GETREACTIEBYREACTIEOMGEVING =
            "SELECT waarde FROM reactieomgeving";

    String GETGRONDSOORTBYGRONDSOORT =
            "SELECT waarde FROM grondsoort";

    String GETBEZONNINGBYBEZONNING =
            "SELECT waarde FROM bezonning";

    String GETHABITUSBYHABITUS =
            "SELECT waarde FROM habitus";

    String GETKLEURENBYKLEUREN =
            "SELECT kleur FROM kleuren";

    String GETBLADVORMBYBLADVORM =
            "SELECT waarde FROM bladvorm";

    String GETRATIOBYRATIOBLOEIBLAD =
            "SELECT waarde FROM ratio_bloeiblad";

    String GETSPRUITBYSPRUITFENOLOGIE =
            "SELECT waarde FROM spruitfenologie";

    String GETBLOEIWIJZEBYBLOEIWIJZE =
            "SELECT waarde FROM bloeiwijze";

    String GETSOCIABILITEITBYSOCIABILITEIT =
            "SELECT waarde FROM sociabiliteit";

    String GETBEHEERDAADBYBEHEERDAAD =
            "SELECT waarde FROM beheerdaad";

    String GETNECTARBYNECTARWAARDE =
            "SELECT waarde FROM nectarwaarde";

    String GETPOLLENBYPOLLENWAARDE =
            "SELECT waarde FROM pollenwaarde";

    String GETBLADGROOTTE =
            "SELECT waarde FROM maxbladgrootte";

    String GETLEVENSVORM =
            "SELECT waarde FROM levensvorm";

    String GETFOTOHABITUS =
            "SELECT afbeelding FROM habitus";

    String GETFOTOBlOEIWIJZE =
            "SELECT afbeelding FROM bloeiwijze";
}
