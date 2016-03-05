package com.light.news;

import com.light.news.common.ShowChildActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button showPopActivitybtn;
	private Button showThinkActivityBtn;
	private Button showToggleButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * 1. 初始化当前所需要的控件 
         * 	findViewById - 返回是一个View对象,转化成Button
         */
        
        showPopActivitybtn = (Button) findViewById(R.id.btn_show_open_activity);
        showThinkActivityBtn = (Button) findViewById(R.id.btn_show_think_activity);
        showToggleButton = (Button) findViewById(R.id.btn_show_toggle_button);
        
        initEvents();
    }
    
    protected void initEvents() {
    	showPopActivitybtn.setOnClickListener(new ShowChildActivity(this, FActivity.class));
    	showThinkActivityBtn.setOnClickListener(new ShowChildActivity(this, ThinkActivity.class));
    	showToggleButton.setOnClickListener(new ShowChildActivity(this, ToggleButtonActivity.class));
    }	

}
