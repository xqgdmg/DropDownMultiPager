package com.yaphetzhao.dropdownmultipager.ultraPullToRefash.handler;

import android.view.View;

import com.yaphetzhao.dropdownmultipager.ultraPullToRefash.component.PtrFrameLayout;

public interface PtrHandler {

    boolean checkCanDoRefresh(final PtrFrameLayout frame, final View content, final View header);

    void onRefreshBegin(final PtrFrameLayout frame);
}