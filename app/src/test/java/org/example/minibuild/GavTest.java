package org.example.minibuild;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class GavTest {
    
    @ParameterizedTest 
    @CsvSource({
        "org.acme:lib-a:1.0.0, org.acme, lib-a, 1.0.0",
        "org.other:lib-c:3.0.0, org.other, lib-c, 3.0.0"
    })
    void parseDecoupeLesTroisChamps(String coordonnee, String groupe, String artefact, String version){
        Gav gav = Gav.parse(coordonnee);
        assertEquals(groupe, gav.group());
        assertEquals(artefact, gav.artifact());
        assertEquals(version, gav.version());
    }

    @ParameterizedTest 
    @ValueSource(strings = {
        "",
        "org.acme:lib-a",
        "org.acme:lib-a:1.0.0:extra",
        ":lib-a:1.0.0",
        "org.acme::1.0.0",
        "org.acme:lib-a:",
        "org.acme:   :1.0.0"
    })

    void parseRejetteUneCoordonneeMalFormee(String coordonnee) {
        assertThrows(IllegalArgumentException.class, () -> Gav.parse(coordonnee));
    }

    @Test
    void parseRejetteNull() {
        assertThrows(NullPointerException.class, () -> Gav.parse(null));
    }

}
 