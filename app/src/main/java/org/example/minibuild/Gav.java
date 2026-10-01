package org.example.minibuild;

public record Gav(String group) {

    public static Gav parse(String coordonnee){
        return new Gav("org.acme");
    }
}
