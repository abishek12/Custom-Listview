package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ListView listView;

    String name[],profession[];
    int image[] = {
            R.drawable.rajesh,
            R.drawable.binod,
            R.drawable.baburam,
            R.drawable.amrit,
            R.drawable.paras,
            R.drawable.rajesh,
            R.drawable.binod,
            R.drawable.baburam,
            R.drawable.amrit,
            R.drawable.paras,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = getResources().getStringArray(R.array.name);
        profession = getResources().getStringArray(R.array.profession);

        listView = findViewById(R.id.listItem);
        CustomLayout customLayout = new CustomLayout();
        listView.setAdapter(customLayout);
    }
    public class CustomLayout extends BaseAdapter{

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = getLayoutInflater().inflate(R.layout.custom_layout,null);

            TextView txtname = v.findViewById(R.id.textView_name);
            TextView txtprof = v.findViewById(R.id.textView_profession);
            ImageView img = v.findViewById(R.id.ivProf);

            txtname.setText(name[position]);
            txtprof.setText(profession[position]);
            img.setImageResource(image[position]);


            return v;
        }
    }
}
