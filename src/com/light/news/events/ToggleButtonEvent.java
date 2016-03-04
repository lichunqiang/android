package com.light.news.events;

import com.light.news.R;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;

public class ToggleButtonEvent implements OnCheckedChangeListener {
	private ImageView imageView;
	
	public ToggleButtonEvent(ImageView iv) {
		imageView = iv;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		/**
		 * buttonView -- 代表被点击的控件
		 * isChecked  -- 代表控件的状态: true or false
		 */
		
		imageView.setBackgroundResource(isChecked ? R.drawable.on : R.drawable.off);
	}

}
