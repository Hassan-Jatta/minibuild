package org.example.minibuild;

class GavTest {
    
    Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
    assertEquals("org.acme", gav.group());

}
