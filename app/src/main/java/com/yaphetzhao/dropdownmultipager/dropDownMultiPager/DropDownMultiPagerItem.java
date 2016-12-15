package com.yaphetzhao.dropdownmultipager.dropDownMultiPager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yaphetzhao.dropdownmultipager.R;

/**
 * Created by YaphetZhao
 * on 2016/12/12.
 */

@SuppressLint("ViewConstructor")
public class DropDownMultiPagerItem extends LinearLayout {
    public DropDownMultiPagerItem(Context context, int num) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.item_dropdownfootprint, this);
        ((TextView) findViewById(R.id.item_num)).setText(String.valueOf(num));
    }

}
