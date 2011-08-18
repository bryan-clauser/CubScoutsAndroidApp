package com.bsa.android.cubscouts.wolf;

import com.bsa.android.R;
import com.bsa.android.cubscouts.wolf.data.WolfActivityDetail;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class WolfAdvancementActivityDetail extends Activity {
	private TextView name; 
	private TextView description;	
	private TextView required;
	private TextView preparation;
	private TextView notes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wolf_activity_detail);
		this.name = (TextView) findViewById(R.id.wolf_activity_detail_name);
		this.description = (TextView) findViewById(R.id.wolf_activity_detail_description);
		this.required = (TextView) findViewById(R.id.wolf_activity_detail_required);
		this.preparation = (TextView) findViewById(R.id.wolf_activity_detail_preparation);
		this.notes = (TextView) findViewById(R.id.wolf_activity_detail_note);
		Bundle bundle = getIntent().getExtras();
		int position = bundle.getInt("com.bsa.android.cubscouts.wolf.activity");
		WolfActivityDetail activity = WolfActivityDetail.fromPostion(position);

		this.name.setText(activity.getName());
		String descriptionText = activity.getDescription();
		if (descriptionText != null && descriptionText.length() > 0)
		this.description.setText(descriptionText);

		String requiredText = activity.getRequired();
		if (requiredText != null && requiredText.length() > 0)
		this.required.setText(requiredText);

		String preparationText = activity.getPreparation();
		if (preparationText != null && preparationText.length() > 0)
		this.preparation.setText(preparationText);
		
		String notesText = activity.getNotes();
		if (notesText != null && notesText.length() > 0)
		this.notes.setText(notesText);
	}
}
