package com.yaphetzhao.dropdownmultipager.ultraPullToRefash.handler;

import com.yaphetzhao.dropdownmultipager.ultraPullToRefash.component.PtrFrameLayout;
import com.yaphetzhao.dropdownmultipager.ultraPullToRefash.indicator.PtrIndicator;

public interface PtrUIHandler {

    void onUIReset(PtrFrameLayout frame);

    void onUIRefreshPrepare(PtrFrameLayout frame);

    void onUIRefreshBegin(PtrFrameLayout frame);

    void onUIRefreshComplete(PtrFrameLayout frame);

    void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status, PtrIndicator ptrIndicator);
}
