package com.bsa.android.cubscouts.wolf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bsa.android.R;

public class WolfActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		ListView list = (ListView) findViewById(R.id.list);

		String[] names = getResources().getStringArray(
				R.array.advancement_electives);

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
						WolfAdvancementActivity.class);
			} else if (1 == position) {
				myIntent = new Intent(view.getContext(),
						WolfElectivesActivity.class);
			}

			if (null != myIntent) {
				startActivityForResult(myIntent, 0);
			}
		}
	};
}
