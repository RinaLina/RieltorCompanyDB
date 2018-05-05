package shekhovtsov.nikita.rieltorcompany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private EditText login;
    private EditText pass;
    private Button button;
    private ProgressBar progressBar;
    private RelativeLayout relativeLayout;
    private final String loginAsAdmin = "admin";
    private final String loginAsDirector = "director";
    private final String loginAsWorker = "worker";
    private final String passAdmin = "1";
    private final String passDirector = "2";
    private final String passWorker = "3";

    private void InitUI() {
        login = findViewById(R.id.editText_login);
        pass = findViewById(R.id.editText_password);
        button = findViewById(R.id.button_login);
        progressBar = findViewById(R.id.progressBar);
        relativeLayout = findViewById(R.id.relativeLayout_login);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitUI();
    }

    public void on_button_login_click(View view) {
        relativeLayout.setAlpha((float) 0.3);
        progressBar.setVisibility(View.VISIBLE);
        Intent intent = new Intent(MainActivity.this, DBActivity.class);
        startActivity(intent);
    }
}
