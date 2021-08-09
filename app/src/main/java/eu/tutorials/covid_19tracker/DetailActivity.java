package eu.tutorials.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private  int positionCountry;
    TextView tvCountry,tvCases,tvRecovered,tvCritical,tvActive,tvTodayCases,tvTotalDeaths,tvTodayDeaths,tvTests,tvTestsPerOneMillion,tvOneCasePerPeople,tvOneDeathPerPeople,tvOneTestPerPeople,tvPopulation,tvContinent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Details of "+AffectedCountries.countryModelList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);
        tvTests = findViewById(R.id.tvTests);
        tvTestsPerOneMillion = findViewById(R.id.tvTestsPerOneMillion);
        tvOneCasePerPeople = findViewById(R.id.tvOneCasePerPeople);
        tvOneDeathPerPeople = findViewById(R.id.tvOneDeathPerPeople);
        tvOneTestPerPeople = findViewById(R.id.tvOneTestPerPeople);
        tvPopulation = findViewById(R.id.tvPopulation);
        tvContinent = findViewById(R.id.tvContinent);



        tvCountry.setText(AffectedCountries.countryModelList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelList.get(positionCountry).getCases());
        tvRecovered.setText(AffectedCountries.countryModelList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryModelList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryModelList.get(positionCountry).getActive());
        tvTodayCases.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelList.get(positionCountry).getTodayDeaths());
        tvTests.setText(AffectedCountries.countryModelList.get(positionCountry).getTests());
        tvTestsPerOneMillion.setText(AffectedCountries.countryModelList.get(positionCountry).getTestsPerOneMillion());
        tvOneCasePerPeople.setText(AffectedCountries.countryModelList.get(positionCountry).getOneCasePerPeople());
        tvOneDeathPerPeople.setText(AffectedCountries.countryModelList.get(positionCountry).getOneDeathPerPeople());
        tvOneTestPerPeople.setText(AffectedCountries.countryModelList.get(positionCountry).getOneTestPerPeople());
        tvPopulation.setText(AffectedCountries.countryModelList.get(positionCountry).getPopulation());
        tvContinent.setText(AffectedCountries.countryModelList.get(positionCountry).getContinent());
    }

    // Back button on top
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}