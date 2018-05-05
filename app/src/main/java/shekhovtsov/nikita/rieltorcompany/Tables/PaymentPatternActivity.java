package shekhovtsov.nikita.rieltorcompany.Tables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import shekhovtsov.nikita.rieltorcompany.DBActivity;
import shekhovtsov.nikita.rieltorcompany.R;

public class PaymentPatternActivity extends AppCompatActivity {

    String rows[] = { "Обычная", "Необычная", "Крутая", "Пиздатая" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_pattern);
        ListView listView = findViewById(R.id.listView_payment_pattern);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, rows);
        listView.setAdapter(arrayAdapter);
    }

    public void on_button_back_payment_pattern_click(View view) {
        Intent intent = new Intent(PaymentPatternActivity.this, DBActivity.class);
        startActivity(intent);
    }
}
