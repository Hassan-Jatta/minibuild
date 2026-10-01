package org.example.minibuild;

public record Gav(String group, String artifact, String version) {

    public static Gav parse(String coordonnee){
        String[] parts = coordonnee.split(":");
        return new Gav(parts[0], parts[1], parts[2]);
    }
}
