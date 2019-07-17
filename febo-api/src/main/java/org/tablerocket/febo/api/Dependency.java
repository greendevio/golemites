package org.tablerocket.febo.api;

import lombok.Data;

import java.net.URI;

@Data
public class Dependency
{
    private String identity;

    private URI location;

    private Metadata metadata;

    public static Dependency dependency(String name, URI location) {
        Dependency d = new Dependency();
        d.setIdentity(name);
        d.setLocation(location);
        return d;
    }

    public static Dependency dependency(String name, URI location,Metadata metadata) {
        Dependency d = new Dependency();
        d.setIdentity(name);
        d.setLocation(location);
        d.setMetadata(metadata);
        return d;
    }
}
