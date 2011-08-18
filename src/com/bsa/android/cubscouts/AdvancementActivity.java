package com.bsa.android.cubscouts;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.bsa.android.R;
import com.bsa.android.cubscouts.wolf.WolfActivity;

public class AdvancementActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

		Resources res = getResources();
		String[] ranks = res.getStringArray(R.array.ranks_array);

		ListView list = (ListView) findViewById(R.id.list);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1,
				// R.id.textView,
				// R.layout.row,
				ranks);

		list.setAdapter(adapter);
		list.setOnItemClickListener(onListClick);
	}

	/**
	 * 
	 */
	private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {

			if(2 == position)
			{
				Intent myIntent = new Intent(view.getContext(),
						WolfActivity.class);
				startActivityForResult(myIntent, 0);
			}
			else
			{
				Object o = parent.getItemAtPosition(position);
				String keyword = o.toString();
				Toast.makeText(parent.getContext(), "You selected: " + keyword,
						Toast.LENGTH_LONG).show();
			}
		}
	};

}
