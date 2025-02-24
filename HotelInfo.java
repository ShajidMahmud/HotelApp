// Import necessary packages and classes
package com.is.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

// Import Android classes for handling UI elements and resources
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

// HotelInfo activity class
public class HotelInfo extends AppCompatActivity {

    // Method called when the activity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Call the superclass method
        super.onCreate(savedInstanceState);

        // Set the content view to the layout defined in activity_hotel_info.xml
        setContentView(R.layout.activity_hotel_info);

        // Set hotel logo
        ImageView imageHotelLogo = findViewById(R.id.imageHotelLogo);

        // Set the image resource using the drawable resource identifier (h1)
        imageHotelLogo.setImageResource(R.drawable.h1);

        // Set hotel address
        TextView textHotelAddress = findViewById(R.id.textHotelAddress);

        // Set the text for the hotel address
        textHotelAddress.setText("2 Chamonix Dr, Vernon Township, NJ 07462");

        // Set cost range information
        TextView textCostRange = findViewById(R.id.textCostRange);

        // Set the text for the cost range
        textCostRange.setText("Cost Range: $500 - $1000");
    }
}
