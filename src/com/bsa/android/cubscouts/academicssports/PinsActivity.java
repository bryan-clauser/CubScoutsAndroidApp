package com.bsa.android.cubscouts.academicssports;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bsa.android.R;

public class PinsActivity extends Activity {

	/**
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		String[] names = new String[] { "Pin 1", "Pin 2", "Pin 3", "Pin 4",
				"Pin 5", "Pin 6", "Pin 7", "Pin 8" };
		ListView list = (ListView) findViewById(R.id.list);

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

			Object o = parent.getItemAtPosition(position);
			String keyword = o.toString();
			Toast.makeText(parent.getContext(), "You selected: " + keyword,
					Toast.LENGTH_LONG).show();

		}
	};
}