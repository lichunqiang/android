package com.light.news.forms;

import com.light.news.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class RadioGroupActivity extends Activity implements OnCheckedChangeListener {
	private RadioGroup rg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.radio_group_activity);
		
		RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group);
		
		rg.setOnCheckedChangeListener(this);
	}
	@Override
	public void onCheckedChanged(RadioGroup gr, int checkedId) {
		
		switch (checkedId) {
		case R.id.radio_group_one:
			Log.i("tag", "篮球被选中");
			break;
		case R.id.radio_group_two:
			Log.i("tag", "足球被选中");
			break;
		default:
			break;
		}
		
	}
}
