package ru.devpad.chapter1.linearlayout.horizontal;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class ActivityHorizontalJava extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setGravity(Gravity.CENTER_HORIZONTAL);

        ViewGroup.LayoutParams paramsLayout = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT);

        linearLayout.setLayoutParams(paramsLayout);

        ViewGroup.LayoutParams paramsButton = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        Button btn1 = new Button(this);
        btn1.setText("Кнопка 1");

        Button btn2 = new Button(this);
        btn2.setText("Кнопка 2");

        Button btn3 = new Button(this);
        btn3.setText("Кнопка 3");

        linearLayout.addView(btn1, paramsButton);
        linearLayout.addView(btn2, paramsButton);
        linearLayout.addView(btn3, paramsButton);

        setContentView(linearLayout);
    }
}