package com.cucumberrest.api.models;

import com.google.gson.annotations.SerializedName;

public class Response {
    @SerializedName("record")
    private Location location;

    @SerializedName("metadata")
    private Metadata metadata;

    public Location getRecord() {
        return location;
    }

    public Metadata getMetadata() {
        return metadata;
    }
}
