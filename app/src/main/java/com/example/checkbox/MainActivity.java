package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    //チェックボックスを参照するためのフィールド
    private CheckBox checkBox1, checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);

        //イベントリスナーの登録
        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        String string1 = "する", string2 = "する";
        if (!checkBox1.isChecked()) {
            string1 = "しない";
        }

        if (!checkBox2.isChecked()) {
            string2 = "しない";
        }

        ((TextView) findViewById(R.id.textView2)).setText(
                String.format(
                        "庭の掃除は「%s」" + "/n" +
                                "窓拭きは「%s」" + "/n"
                        , string1, string2)
        );

    }
}
