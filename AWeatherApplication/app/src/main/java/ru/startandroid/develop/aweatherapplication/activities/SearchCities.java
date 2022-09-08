package ru.startandroid.develop.aweatherapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ru.startandroid.develop.aweatherapplication.MainActivity;
import ru.startandroid.develop.aweatherapplication.R;

public class SearchCities extends AppCompatActivity {
    private EditText editEntry;
    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_cities);
        realisation();
    }

    private void realisation() {
        editEntry = findViewById(R.id.editEntry);
        buttonSearch = findViewById(R.id.buttonSearch);

        buttonSearch.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            if (!TextUtils.isEmpty(editEntry.getText().toString())) {
                intent.putExtra("city", editEntry.getText().toString());
                startActivity(intent);
            } else {
                Toast.makeText(this, "Введите город", Toast.LENGTH_SHORT).show();
            }


        });
    }
}