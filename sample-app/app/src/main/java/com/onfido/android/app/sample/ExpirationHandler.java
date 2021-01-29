package com.onfido.android.app.sample;

import com.onfido.android.sdk.capture.token.TokenExpirationHandler;

import org.jetbrains.annotations.NotNull;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

class ExpirationHandler implements TokenExpirationHandler {


    @Override
    public void refreshToken(@NotNull Function1<? super String, Unit> injectNewToken) {
        //Your network request logic to retrieve SDK token goes here




        injectNewToken.invoke("NEW_SDK_TOKEN"); // if you pass `null`  sdk exit with token expired error

    }
}

