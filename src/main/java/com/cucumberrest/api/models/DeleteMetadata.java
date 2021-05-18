package com.cucumberrest.api.models;

import com.google.gson.annotations.SerializedName;

public class DeleteMetadata {
    @SerializedName("id")
    private String id;

    @SerializedName("versionsDeleted")
    private String versionsDeleted;

    @SerializedName("private")
    private boolean isPrivate;

    public String getId() {
        return id;
    }

    public String getVersionsDeleted() {
        return versionsDeleted;
    }
}
