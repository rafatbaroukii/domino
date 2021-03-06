package com.progressoft.brix.domino.desktop.client;

import com.progressoft.brix.domino.api.client.events.Event;
import com.progressoft.brix.domino.api.client.events.ServerRequestEventFactory;
import com.progressoft.brix.domino.api.client.request.ClientServerRequest;
import com.progressoft.brix.domino.api.shared.request.ServerResponse;
import com.progressoft.brix.domino.desktop.client.events.DesktopFailedServerEvent;
import com.progressoft.brix.domino.desktop.client.events.DesktopSuccessServerEvent;

public class DesktopServerRequestEventFactory implements ServerRequestEventFactory {
    @Override
    public Event makeSuccess(ClientServerRequest request, ServerResponse serverResponse) {
        return new DesktopSuccessServerEvent(request, serverResponse);
    }

    @Override
    public Event makeFailed(ClientServerRequest request, Throwable error) {
        return new DesktopFailedServerEvent(request, error);
    }
}
