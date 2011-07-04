package com.bsa.android.cubscouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bsa.android.R;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);

		Button calendarButton = (Button) findViewById(R.id.calendar);

		calendarButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(),
						CalendarActivity.class);
				startActivityForResult(myIntent, 0);
			}

		});

		Button advancementButton = (Button) findViewById(R.id.advancement);

		advancementButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(),
						AdvancementActivity.class);
				startActivityForResult(myIntent, 0);
			}

		});

		Button academicSportsButton = (Button) findViewById(R.id.academics_sports);

		academicSportsButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Intent myIntent = new Intent(view.getContext(),
						AcademicsSportsActivity.class);
				startActivityForResult(myIntent, 0);
			}

		});

	}

}
