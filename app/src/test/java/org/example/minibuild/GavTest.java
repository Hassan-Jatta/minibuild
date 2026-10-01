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
    
}
 