package com.bsa.android.cubscouts.tiger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bsa.android.R;

public class TigerElectivesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		ListView list = (ListView) findViewById(R.id.list);

		String[] names = getResources().getStringArray(R.array.tiger_electives);

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
