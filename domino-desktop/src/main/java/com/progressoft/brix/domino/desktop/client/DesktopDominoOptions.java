package com.progressoft.brix.domino.desktop.client;

import com.progressoft.brix.domino.api.client.CanSetDominoOptions;
import com.progressoft.brix.domino.api.client.DominoOptions;
import com.progressoft.brix.domino.api.client.DynamicServiceRoot;

import java.util.ArrayList;
import java.util.List;

public class DesktopDominoOptions implements DominoOptions {
    private String defaultServiceRoot = "http://localhost:8080/service";
    private String defaultJsonDateFormat = null;
    private List<DynamicServiceRoot> dynamicServiceRoots = new ArrayList<>();

    @Override
    public void applyOptions() {

    }

    @Override
    public CanSetDominoOptions setDefaultServiceRoot(String defaultServiceRoot) {
        this.defaultServiceRoot = defaultServiceRoot;
        return this;
    }

    @Override
    public CanSetDominoOptions setDefaultJsonDateFormat(String defaultJsonDateFormat) {
        this.defaultJsonDateFormat = defaultJsonDateFormat;
        return this;
    }

    @Override
    public CanSetDominoOptions addDynamicServiceRoot(DynamicServiceRoot dynamicServiceRoot) {
        dynamicServiceRoots.add(dynamicServiceRoot);
        return this;
    }

    @Override
    public String getDefaultServiceRoot() {
        return defaultServiceRoot;
    }

    @Override
    public String getDefaultJsonDateFormat() {
        return defaultJsonDateFormat;
    }

    @Override
    public List<DynamicServiceRoot> getServiceRoots() {
        return dynamicServiceRoots;
    }
}
