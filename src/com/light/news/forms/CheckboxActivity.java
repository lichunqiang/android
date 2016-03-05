package com.light.news.forms;

import com.light.news.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class CheckboxActivity extends Activity implements OnCheckedChangeListener {
	private CheckBox ckOne;
	private CheckBox ckTwo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.checkbox_activity);
		
		CheckBox ckOne = (CheckBox) findViewById(R.id.checkbox_one);
		CheckBox ckTwo = (CheckBox) findViewById(R.id.checkbox_two);
			
		//init buttons.
		ckOne.setOnCheckedChangeListener(this);
		ckTwo.setOnCheckedChangeListener(this);
	}

	@Override
	public void onCheckedChanged(CompoundButton button, boolean isChecked) {
		
		int id = button.getId();
		
		if (id == R.id.checkbox_one) {
			Log.i("tag", "One is Checked");
		}
		
		if (id == R.id.checkbox_two) {
			Log.i("tag", "Two is Checked");
		}
		
		if (isChecked) {
			String text = (String) button.getText();
			Log.i("tag", text);
		}
	}
}
