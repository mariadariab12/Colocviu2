package ro.pub.cs.systems.eim.colocviu2;

import android.os.Bundle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText serverPortEditText = null;
    private EditText clientAddressEditText = null;
    private EditText clientPortEditText = null;
    private EditText cityEditText = null;
    private Spinner informationTypeSpinner = null;
    private TextView weatherForecastTextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serverPortEditText = (EditText)findViewById(R.id.server_port_edit_text);
//        Button connectButton = (Button) findViewById(R.id.connect_button);
//        connectButton.setOnClickListener(connectButtonClickListener);

        clientAddressEditText = (EditText)findViewById(R.id.client_address_edit_text);
        clientPortEditText = (EditText)findViewById(R.id.client_port_edit_text);
        cityEditText = (EditText)findViewById(R.id.city_edit_text);
        informationTypeSpinner = (Spinner)findViewById(R.id.information_type_spinner);
//        Button getWeatherForecastButton = (Button) findViewById(R.id.get_weather_forecast_button);
//        getWeatherForecastButton.setOnClickListener(getWeatherForecastButtonClickListener);
        weatherForecastTextView = (TextView)findViewById(R.id.weather_forecast_text_view);
    }
}