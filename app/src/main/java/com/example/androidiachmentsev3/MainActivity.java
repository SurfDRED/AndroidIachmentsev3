package com.example.androidiachmentsev3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// найдем View-элементы
        final TextView ePolzovatel = findViewById(R.id.edPolzovatel);
        final TextView eEmail = findViewById(R.id.edEmail);
        final TextView edinfo = findViewById(R.id.edInfo);
        Button exampleBtn = findViewById(R.id.buttonOk);
        Button exampleBtn2 = findViewById(R.id.buttonClear);
// обработка кнопки Ок
        exampleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edinfo.setText(String.format("Подписка на рассылку успешно оформлена для пользователя %S на электронный адрес: %s", ePolzovatel.getText(), eEmail.getText()));
            }
        });
// обработка кнопки Clear
        exampleBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ePolzovatel.setText("");
                eEmail.setText("");
                edinfo.setText("");
            }
        });
    }
}
