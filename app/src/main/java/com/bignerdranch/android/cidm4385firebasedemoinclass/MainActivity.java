package com.bignerdranch.android.cidm4385firebasedemoinclass;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Write a message to the database
        final FirebaseDatabase database = FirebaseDatabase.getInstance();

        final EditText input = findViewById(R.id.editTextFirebaseMemo);

        Button button =findViewById(R.id.buttonSubmit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Context context = getApplicationContext();
                String message = input.getText().toString();

                DatabaseReference myRef = database.getReference("message_inClass" );
                myRef.setValue("Hello, World! " + message);

                Toast toast = Toast.makeText(context,
                        "Message: "+ message,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
