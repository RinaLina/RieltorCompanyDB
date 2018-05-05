package shekhovtsov.nikita.rieltorcompany;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import shekhovtsov.nikita.rieltorcompany.Fragment.EditFragment;

public class DBActivity extends AppCompatActivity {

    private int opened;
    private ImageView reports, change, history;

    private void InitUI() {
        reports = findViewById(R.id.imageView_reports);
        change = findViewById(R.id.imageView_change);
        history = findViewById(R.id.imageView_history);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
        InitUI();

    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame_layout, fragment);
        ft.commit();
    }


    public void on_reports_button_click(View view) {
        if (opened == 1) {
        } else {
            reports.setAlpha((float) 1.0);
            change.setAlpha((float) 0.3);
            history.setAlpha((float) 0.3);
            // loadFragment(ReportAdminFragment.newInstance());
            opened = 1;
        }
    }

    public void on_edit_button_click(View view) {
        if (opened == 2) {
        } else {
            reports.setAlpha((float) 0.3);
            change.setAlpha((float) 1.0);
            history.setAlpha((float) 0.3);
            loadFragment(EditFragment.newInstance());
            opened = 2;
        }
    }
}
