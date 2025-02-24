// Import necessary packages and classes
package com.is.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// Main activity class
public class MainActivity extends AppCompatActivity {

    // Method called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Call the superclass method
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_main.xml
        setContentView(R.layout.activity_main);

        // Find the button in the layout by its ID
        Button btnNavigate = findViewById(R.id.btnNavigate);

        // Set a click listener on the button
        btnNavigate.setOnClickListener(new View.OnClickListener() {

            // Override the onClick method to define the behavior when the button is clicked
            @Override
            public void onClick(View v) {

                // Create an intent to navigate to the HotelInfo activity
                Intent intent = new Intent(MainActivity.this, HotelInfo.class);

                // Start the HotelInfo activity
                startActivity(intent);
            }
        });
    }
}
