package com.bsa.android.cubscouts.academicssports;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bsa.android.R;

public class AcademicsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		String[] names = getResources().getStringArray(R.array.academics_array);
		//
		// this.setListAdapter(new ArrayAdapter<Object>(this,
		// R.layout.common_list_item, R.id.textView,
		// names));

		ListView list = (ListView) findViewById(R.id.list);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, names);

		list.setAdapter(adapter);
		list.setOnItemClickListener(onListClick);
	}

	private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// super.onListItemClick(l, v, position, id);

			Object o = parent.getItemAtPosition(position);
			String keyword = o.toString();
			Toast.makeText(parent.getContext(), "You selected: " + keyword,
					Toast.LENGTH_LONG).show();

			// Intent myIntent = null;
			// if (0 == position) {
			// myIntent = new Intent(view.getContext(),
			// BeltLoopsActivity.class);
			// } else if (1 == position) {
			// myIntent = new Intent(view.getContext(), PinsActivity.class);
			// }
			//
			// if (null != myIntent) {
			// startActivityForResult(myIntent, 0);
			// }
		}
	};

	// @Override
	// protected void onListItemClick(ListView l, View v, int position, long id)
	// {
	//
	// super.onListItemClick(l, v, position, id);
	//
	// Object o = this.getListAdapter().getItem(position);
	// String keyword = o.toString();
	// Toast.makeText(this, "You selected: " + keyword, Toast.LENGTH_LONG)
	// .show();
	//
	// }
}
