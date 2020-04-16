package cl.desafiolatam.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import cl.desafiolatam.weather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        DailyWeather dailyWeather = new DailyWeather("Santiago", "22/05/2020", R.drawable.ic_wb_sunny_black_24dp, 25, "Celsius");
        binding.textViewCiudad.setText(dailyWeather.getCiudad());
        binding.textViewFecha.setText(dailyWeather.getFecha());
        binding.imageViewClima.setImageResource(dailyWeather.getImagenClima());
        binding.textViewTemperatura.setText(String.valueOf(dailyWeather.getTemperatura()));
        binding.textViewUnidadMedida.setText(dailyWeather.getUnidadMedida());
    }
}
