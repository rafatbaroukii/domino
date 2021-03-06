package com.progressoft.brix.domino.api.client.annotations;

import com.progressoft.brix.domino.api.client.mvp.presenter.Presentable;

import javax.validation.constraints.NotNull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UiView {

    @NotNull
    Class<? extends Presentable> presentable();
}
