package com.bignerdranch.android.cidm4385firebasedemoinclass;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText input = findViewById(R.id.editTextFirebaseMemo);

        Button button =findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                String message = input.getText().toString();
                Toast toast = Toast.makeText(context,
                        "Message: "+ message,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
