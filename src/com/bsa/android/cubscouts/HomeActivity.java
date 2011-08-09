package com.bsa.android.cubscouts;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bsa.android.R;
import com.bsa.android.cubscouts.academicssports.AcademicsSportsActivity;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		Resources res = getResources();
		String[] main = res.getStringArray(R.array.main_array);

		ListView list = (ListView) findViewById(R.id.list);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,
				// R.id.textView,
				// R.layout.row,
				main);

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
				myIntent = new Intent(view.getContext(), CalendarActivity.class);
			} else if (1 == position) {
				myIntent = new Intent(view.getContext(),
						AdvancementActivity.class);
			}

			else if (2 == position) {
				myIntent = new Intent(view.getContext(),
						AcademicsSportsActivity.class);
			}

			if (null != myIntent) {
				startActivityForResult(myIntent, 0);
			}
		}
	};

}
