package com.bsa.android.cubscouts.weblos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bsa.android.R;

public class WeblosActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		ListView list = (ListView) findViewById(R.id.list);

		String[] names = getResources().getStringArray(
				R.array.achievements_electives);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, names);

		list.setAdapter(adapter);
		list.setOnItemClickListener(onListClick);
	}

	/**
	 * 
	 */
	private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {

			Intent myIntent = null;
			if (0 == position) {
				myIntent = new Intent(view.getContext(),
						WeblosAchievementsActivity.class);
			} else if (1 == position) {
				myIntent = new Intent(view.getContext(),
						WeblosElectivesActivity.class);
			}

			if (null != myIntent) {
				startActivityForResult(myIntent, 0);
			}
		}
	};
}
