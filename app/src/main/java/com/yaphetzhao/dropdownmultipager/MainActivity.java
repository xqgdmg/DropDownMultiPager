package com.yaphetzhao.dropdownmultipager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.yaphetzhao.dropdownmultipager.dropDownMultiPager.DropDownMultiPagerView;
import com.yaphetzhao.dropdownmultipager.ultraPullToRefash.component.PtrFrameLayout;
import com.yaphetzhao.dropdownmultipager.ultraPullToRefash.handler.PtrDefaultHandler;

public class MainActivity extends AppCompatActivity {

    private PtrFrameLayout ptrLayout;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ptrLayout = (PtrFrameLayout) findViewById(R.id.ptrlayout);

        final TextView textView = new TextView(this);
        textView.setText("this is PtrFrameLayout");
        ptrLayout.setHeaderView(textView);
        ptrLayout.disableWhenHorizontalMove(true);
        ptrLayout.setPtrHandler(new PtrDefaultHandler() {
            @Override
            public boolean checkCanDoRefresh(PtrFrameLayout frame, View content, View header) {
                return true;
            }

            @Override
            public void onRefreshBegin(PtrFrameLayout frame) {
                ptrLayout.refreshComplete();
                new DropDownMultiPagerView(MainActivity.this).show();
            }
        });
    }

}
