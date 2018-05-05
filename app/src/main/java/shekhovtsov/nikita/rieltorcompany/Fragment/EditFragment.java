package shekhovtsov.nikita.rieltorcompany.Fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import shekhovtsov.nikita.rieltorcompany.Adapters.DBGridViewAdapter;
import shekhovtsov.nikita.rieltorcompany.Tables.PaymentPatternActivity;
import shekhovtsov.nikita.rieltorcompany.R;
import shekhovtsov.nikita.rieltorcompany.Tables.RegionActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class EditFragment extends Fragment {

    private String tables[] = { "Форма выплат", "Банк-партнер", "Оплата", "Покупатель", "Сделка", "Риэлтор",
            "Недвижимость", "Регион", "Арендатор" };
    private GridView gridView;


    public EditFragment() {
    }

    public static EditFragment newInstance() {
        Bundle args = new Bundle();
        EditFragment fragment = new EditFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit, container, false);
        gridView = view.findViewById(R.id.gridView_tables_edit);
        DBGridViewAdapter dbGridViewAdapter = new DBGridViewAdapter(view.getContext(), tables);
        gridView.setAdapter(dbGridViewAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    default:
                        break;
                    case 0:
                        Intent intentPP = new Intent(view.getContext(), PaymentPatternActivity.class);
                        startActivity(intentPP);
                        break;
                    case 7:
                        Intent intentRegion = new Intent(view.getContext(), RegionActivity.class);
                        startActivity(intentRegion);
                }
            }
        });
        return view;
    }

}
