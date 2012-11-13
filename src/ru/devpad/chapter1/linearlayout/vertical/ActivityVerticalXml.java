package ru.devpad.chapter1.linearlayout.vertical;

import android.app.Activity;
import android.os.Bundle;
import ru.devpad.chapter1.linearlayout.R;

public class ActivityVerticalXml extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_vertical);
    }
}