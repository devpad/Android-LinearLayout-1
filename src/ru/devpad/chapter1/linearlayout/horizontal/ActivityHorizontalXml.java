package ru.devpad.chapter1.linearlayout.horizontal;

import android.app.Activity;
import android.os.Bundle;
import ru.devpad.chapter1.linearlayout.R;

public class ActivityHorizontalXml extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_horizontal);
    }
}