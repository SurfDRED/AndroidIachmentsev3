package com.example.androidiachmentsev3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClicker();
        onClear();
    }
    public void onClicker() {
        // Обработка кнопки ОК
        Button exampleBtn = findViewById(R.id.buttonOk);
        exampleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView ePolzovatel = findViewById(R.id.edPolzovatel);
                TextView eEmail = findViewById(R.id.edEmail);
                TextView edinfo = findViewById(R.id.edInfo);
                edinfo.setText(String.format("Подписка на рассылку успешно оформлена для пользователя %S на электронный адрес: %s", ePolzovatel.getText(), eEmail.getText()));
            }
        });
    }

    public void onClear() {
        // Обработка кнопки Очистить
        Button exampleBtn2 = findViewById(R.id.buttonClear);
        exampleBtn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView ePolzovatel = findViewById(R.id.edPolzovatel);
                ePolzovatel.setText("");
                TextView eEmail = findViewById(R.id.edEmail);
                eEmail.setText("");
                TextView edinfo = findViewById(R.id.edInfo);
                edinfo.setText("");
            }
        });
    }
}
