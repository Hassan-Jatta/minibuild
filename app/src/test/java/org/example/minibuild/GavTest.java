package org.example.minibuild;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
}
 