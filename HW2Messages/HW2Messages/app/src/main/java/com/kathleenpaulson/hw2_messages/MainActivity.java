package com.kathleenpaulson.hw2_messages;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Get the Goodbye button instance
        Button goodbyeButton = (Button)findViewById(R.id.goodbyeButtonLabel);

        // Set button event handler method for the goodbye button
        goodbyeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,
                        context.getString(R.string.goodbye_button_press_event_text), duration);
                toast.show();


            }
        });

        // Get the Greeting button instance
        Button greetingButton = (Button)findViewById(R.id.greetingButtonLabel);

        // Set button event handler method for the greeting button
        greetingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context,
                        context.getString(R.string.greeting_button_press_event_text), duration);
                toast.show();
            }
        });

        // Get the Start Data Activity button instance
        Button startDataActivity = (Button)findViewById(R.id.startDataActivityLabel);

        // Set button event handler method for the button
        startDataActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, DataActivity.class);

                startActivity(intent);
            }
        });

    }
}
