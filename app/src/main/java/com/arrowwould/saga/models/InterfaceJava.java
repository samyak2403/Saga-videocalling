package com.arrowwould.saga.models;

import android.webkit.JavascriptInterface;

import com.arrowwould.saga.activities.CallActivity;

public class InterfaceJava {

    CallActivity callActivity;

    public InterfaceJava(CallActivity callActivity) {
        this.callActivity = callActivity;
    }

    @JavascriptInterface
    public void onPeerConnected(){
        callActivity.onPeerConnected();
    }
}
