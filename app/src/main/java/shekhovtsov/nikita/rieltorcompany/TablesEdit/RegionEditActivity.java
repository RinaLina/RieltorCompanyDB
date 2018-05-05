package shekhovtsov.nikita.rieltorcompany.TablesEdit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import shekhovtsov.nikita.rieltorcompany.R;
import shekhovtsov.nikita.rieltorcompany.Tables.RegionActivity;

public class RegionEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region_edit);
    }

    public void on_button_back_region_edit_click(View view) {
        super.onBackPressed();
    }

    public void on_add_button_click(View view) {
        TextView label = findViewById(R.id.label);
        Button save = findViewById(R.id.button_save);
        Button delete = findViewById(R.id.button_delete);
        delete.setClickable(false);
        label.setText("Добавление нового элемента");
    }
}
