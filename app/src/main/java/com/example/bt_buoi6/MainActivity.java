package com.example.bt_buoi6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.bt_buoi6.PhotoAdapter;
import com.example.bt_buoi6.PhotoData;
import com.example.bt_buoi6.ViewPhotoActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(getBaseContext(), ViewPhotoActivity.class);
            intent.putExtra("id", gridView.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotoData.init(getApplicationContext());
        ArrayList<Photo> photos = PhotoData.getPhotos();

        gridView = findViewById(R.id.gridview);
        PhotoAdapter adapter = new PhotoAdapter(photos, getApplicationContext());
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(onitemclick);
    }
}