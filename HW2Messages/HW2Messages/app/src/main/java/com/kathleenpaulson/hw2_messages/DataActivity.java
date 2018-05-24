package com.kathleenpaulson.hw2_messages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        final EditText nameEdit = (EditText)findViewById(R.id.editTextName);
        final EditText displayEdit = (EditText)findViewById(R.id.editTextDisplay);

        // Get the Copy button instance
        Button copy = (Button)findViewById(R.id.buttonCopy);

        //Get the EditText instance for name

        //Get the value of the name the user entered, and display it
        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String s;
                s = nameEdit.getText().toString();

                displayEdit.setText(s);

            }
        });

        // Get the Copy button instance
        Button clear = (Button)findViewById(R.id.buttonClear);

        //Get the EditText instance for name

        //Get the value of the name the user entered, and display it
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                nameEdit.setText("");
                displayEdit.setText("");
            }
        });












    }
}
