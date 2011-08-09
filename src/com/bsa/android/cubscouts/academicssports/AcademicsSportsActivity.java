package com.bsa.android.cubscouts.academicssports;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bsa.android.R;

/**
 * @author bryan
 * 
 */
public class AcademicsSportsActivity extends Activity {

	List<IconRow> model = new ArrayList<IconRow>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common_listview);

//		model.add(new IconRow("Belt Loops", "Some Belt Loop Stuff"));
//		model.add(new IconRow("Pins", "Some Pins Loop Stuff"));

		ListView list = (ListView) findViewById(R.id.list);

		// ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		// //android.R.layout.simple_list_item_1,
		// //R.id.textView,
		// R.layout.row,
		// names);
//		IconRowAdapter adapter = new IconRowAdapter();
//		list.setAdapter(adapter);
		
		List<String> names = new ArrayList<String>();
		names.add("Belt Loops");
		names.add("Pins");


		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_list_item_1,
		// R.id.textView,
				//R.layout.row, 
				names);

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
						BeltLoopsActivity.class);
			} else if (1 == position) {
				myIntent = new Intent(view.getContext(), PinsActivity.class);
			}

			if (null != myIntent) {
				startActivityForResult(myIntent, 0);
			}
		}
	};

	class IconRowAdapter extends ArrayAdapter<IconRow> {
		IconRowAdapter() {
			super(AcademicsSportsActivity.this, R.layout.row, model);
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View row = convertView;
			IconRowHolder holder = null;

			if (row == null) {
				LayoutInflater inflater = getLayoutInflater();

				row = inflater.inflate(R.layout.row, parent, false);
				holder = new IconRowHolder(row);
				row.setTag(holder);
			} else {
				holder = (IconRowHolder) row.getTag();
			}

			return (row);
		}
	}

	static class IconRowHolder {
		private TextView name = null;
		private TextView address = null;
		private ImageView icon = null;

		IconRowHolder(View row) {
			name = (TextView) row.findViewById(R.id.title);
			address = (TextView) row.findViewById(R.id.desc);
			icon = (ImageView) row.findViewById(R.id.icon);
		}

		void populateFrom(IconRow ic) {
			name.setText(ic.getName());
			address.setText(ic.getDesc());
			icon.setImageResource(R.drawable.ball_red);

		}
	}

}