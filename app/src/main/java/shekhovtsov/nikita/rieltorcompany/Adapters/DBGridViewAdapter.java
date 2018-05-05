package shekhovtsov.nikita.rieltorcompany.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import shekhovtsov.nikita.rieltorcompany.R;


public class DBGridViewAdapter extends BaseAdapter {

    private Context context;
    private String items[];
    private LayoutInflater inflater;

    public DBGridViewAdapter (Context context, String items[]) {
        this.context = context;
        this.items = items;
    }


    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView;
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            gridView = inflater.inflate(R.layout.item_gridview, null);
        }
        TextView report = gridView.findViewById(R.id.report_text);
        report.setText(items[position]);
        return gridView;
    }
}
