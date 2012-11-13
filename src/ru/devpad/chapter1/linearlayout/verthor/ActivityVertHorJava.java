package ru.devpad.chapter1.linearlayout.verthor;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.*;
import ru.devpad.chapter1.linearlayout.R;

public class ActivityVertHorJava extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView contactImage = new ImageView(this);
        LinearLayout.LayoutParams paramContactImage = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        paramContactImage.leftMargin = 5;
        paramContactImage.rightMargin = 10;
        paramContactImage.gravity = Gravity.CENTER;
        contactImage.setLayoutParams(paramContactImage);
        contactImage.setImageResource(R.drawable.anonym);
        contactImage.setScaleType(ImageView.ScaleType.FIT_CENTER);

        TextView contactName = new TextView(this);
        contactName.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        contactName.setText("Аноним");
        contactName.setTextSize(20);
        contactName.setTypeface(null, Typeface.BOLD);

        TextView messageText = new TextView(this);
        LinearLayout.LayoutParams paramMessage = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        paramMessage.weight = (float) 1.0;
        messageText.setLayoutParams(paramMessage);
        messageText.setText("Пропущенных вызовов от абонента - 1, время 20:48 09/12");
        messageText.setTextSize(13);
        messageText.setMaxLines(2);

        TextView dateText = new TextView(this);
        LinearLayout.LayoutParams paramDate = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        paramDate.weight = (float) 2.0;
        paramDate.gravity = Gravity.BOTTOM;
        dateText.setLayoutParams(paramDate);
        dateText.setText("11/11/12");
        dateText.setGravity(Gravity.RIGHT);
        dateText.setPadding(0, 0, 5, 0);
        dateText.setTextSize(12);
        dateText.setTextColor(Color.parseColor("#0000ff"));

        Button btnDelete = new Button(this);
        btnDelete.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        btnDelete.setText("Удалить всё");
        btnDelete.setGravity(Gravity.CENTER);

        LinearLayout messagePanel = new LinearLayout(this);
        messagePanel.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        messagePanel.setOrientation(LinearLayout.HORIZONTAL);
        messagePanel.addView(messageText);
        messagePanel.addView(dateText);

        LinearLayout contactPanel = new LinearLayout(this);
        contactPanel.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        contactPanel.setOrientation(LinearLayout.VERTICAL);
        contactPanel.addView(contactName);
        contactPanel.addView(messagePanel);

        LinearLayout item = new LinearLayout(this);
        item.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        item.setOrientation(LinearLayout.HORIZONTAL);
        item.setBackgroundColor(Color.parseColor("#dddddd"));
        int dp = (int) (getResources().getDisplayMetrics().density * 5);
        item.setPadding(0, dp, 0, dp);
        item.addView(contactImage);
        item.addView(contactPanel);

        LinearLayout root = new LinearLayout(this);
        root.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.FILL_PARENT,
                ViewGroup.LayoutParams.FILL_PARENT
        ));
        root.setOrientation(LinearLayout.VERTICAL);
        root.addView(item);
        root.addView(btnDelete);

        setContentView(root);
    }
}