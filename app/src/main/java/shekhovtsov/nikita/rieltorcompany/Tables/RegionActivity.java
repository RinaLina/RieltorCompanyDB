package shekhovtsov.nikita.rieltorcompany.Tables;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import shekhovtsov.nikita.rieltorcompany.DBActivity;
import shekhovtsov.nikita.rieltorcompany.R;
import shekhovtsov.nikita.rieltorcompany.TablesEdit.RegionEditActivity;

public class RegionActivity extends AppCompatActivity {

    String rows[] = { "Центральный", "Восточный", "Западный", "Северный", "Южный", "Северо-западный", "Северо-восточный", "Юго-западный" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_region);
        ListView listView = findViewById(R.id.listView_region);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, rows);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    default:
                        break;
                    case 0:
                        Intent intent = new Intent(RegionActivity.this, RegionEditActivity.class);
                        startActivity(intent);
                }
            }
        });
    }

    public void on_button_back_region_click(View view) {
        Intent intent = new Intent(RegionActivity.this, DBActivity.class);
        startActivity(intent);
    }
}
