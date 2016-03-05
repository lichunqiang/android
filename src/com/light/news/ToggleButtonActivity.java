package com.light.news;

import com.light.news.events.ToggleButtonEvent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends Activity {
	private ToggleButton btn;
	private ImageView iv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.toggle_button_activity);
		
		//初始化控件
		btn = (ToggleButton) findViewById(R.id.toggleButton1);
		iv = (ImageView) findViewById(R.id.imageView1);
		
		//设置监听事件
		btn.setOnCheckedChangeListener(new ToggleButtonEvent(iv));
	}
}
