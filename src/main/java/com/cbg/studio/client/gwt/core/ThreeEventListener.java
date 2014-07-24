package com.cbg.studio.client.gwt.core;

import com.google.gwt.core.client.JavaScriptObject;

public class ThreeEventListener extends JavaScriptObject {
    protected ThreeEventListener() {
    }

    public final native ThreeEventListener create(GWTEventListener listener)/*-{
                                                                            return function(event){
                                                                            listener.@com.akjava.gwt.three.client.gwt.core.GWTEventListener::onEvent(Lcom/akjava/gwt/three/client/gwt/core/ThreeEvent;)(event);
                                                                            }
                                                                            }-*/;
}
