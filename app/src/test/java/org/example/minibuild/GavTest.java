package org.example.minibuild;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GavTest {
    
    @Test
    void parseExtraitleGroupe(){
        String coordonnee = "org.acme:lib-a:1.0.0";
        Gav gav = Gav.parse(coordonnee);
        assertEquals("org.acme", gav.group());
    }

    @Test 
    void parseExtraitGroupeArtefactVersion(){
        String coordonnee = "org.other:lib-c:3.0.0";
        Gav gav = Gav.parse(coordonnee);
        assertEquals("org.other", gav.group());
        assertEquals("lib-c", gav.artifact());
        assertEquals("3.0.0", gav.version());

    }
    
}
 