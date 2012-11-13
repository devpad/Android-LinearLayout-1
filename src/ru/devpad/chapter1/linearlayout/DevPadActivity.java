package ru.devpad.chapter1.linearlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import ru.devpad.chapter1.linearlayout.horizontal.ActivityHorizontalJava;
import ru.devpad.chapter1.linearlayout.horizontal.ActivityHorizontalXml;
import ru.devpad.chapter1.linearlayout.verthor.ActivityVertHorJava;
import ru.devpad.chapter1.linearlayout.verthor.ActivityVertHorXml;
import ru.devpad.chapter1.linearlayout.vertical.ActivityVerticalJava;
import ru.devpad.chapter1.linearlayout.vertical.ActivityVerticalXml;

public class DevPadActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void startActivityVerticalXml(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityVerticalXml.class));
    }

    public void startActivityVerticalJava(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityVerticalJava.class));
    }

    public void startActivityHorizontalXml(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityHorizontalXml.class));
    }

    public void startActivityHorizontalJava(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityHorizontalJava.class));
    }

    public void startActivityVertHorXml(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityVertHorXml.class));
    }

    public void startActivityVertHorJava(View v) {
        startActivity(new Intent(DevPadActivity.this, ActivityVertHorJava.class));
    }

}
