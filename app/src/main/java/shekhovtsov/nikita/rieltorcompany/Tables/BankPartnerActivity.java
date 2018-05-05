package shekhovtsov.nikita.rieltorcompany.Tables;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import shekhovtsov.nikita.rieltorcompany.R;

public class BankPartnerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_partner);
    }

    public void on_button_back_bank_partner_click(View view) {
        super.onBackPressed();
    }
}
