package com.light.news;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import com.light.news.common.ShowChildActivity;
import com.light.news.forms.CheckboxActivity;
import com.light.news.forms.RadioGroupActivity;
import com.light.news.layouts.LinearActivity;
import com.light.news.layouts.RelativeLayoutActivity;
import com.light.news.views.GridViewActivity;
import com.light.news.views.ListViewActivity;
import com.light.news.widgets.SpinnerActivity;


public class MainActivity extends Activity {
	
	private Button showPopActivitybtn;
	private Button showThinkActivityBtn;
	private Button showToggleButton;
	private Button showCheckboxButton;
	private Button showRadioGroupButton;
	private Button showLinearLayoutButton;
	private Button showRelativeLayoutButton;
	private Button showListeViewButton;
	private Button showGridViewButton;
	
	private Button showSpinnerButton;
	
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
        showCheckboxButton = (Button) findViewById(R.id.btn_show_checkbox_button);
        showRadioGroupButton = (Button) findViewById(R.id.btn_show_radio_group_button);
        showLinearLayoutButton = (Button) findViewById(R.id.btn_layout_line);
        showRelativeLayoutButton = (Button) findViewById(R.id.btn_layout_relative);
        
        //views
        showListeViewButton = (Button) findViewById(R.id.btn_show_listview_demo);
        showGridViewButton = (Button) findViewById(R.id.btn_show_gridview_demo);
        
        //widgets
        showSpinnerButton = (Button) findViewById(R.id.btn_show_spinner_demo);
        //init events.
        initEvents();
    }
    
    protected void initEvents() {
    	showPopActivitybtn.setOnClickListener(new ShowChildActivity(this, FActivity.class));
    	showThinkActivityBtn.setOnClickListener(new ShowChildActivity(this, ThinkActivity.class));
    	showToggleButton.setOnClickListener(new ShowChildActivity(this, ToggleButtonActivity.class));
    	showCheckboxButton.setOnClickListener(new ShowChildActivity(this, CheckboxActivity.class));
    	showRadioGroupButton.setOnClickListener(new ShowChildActivity(this, RadioGroupActivity.class));
    	showLinearLayoutButton.setOnClickListener(new ShowChildActivity(this, LinearActivity.class));
    	showRelativeLayoutButton.setOnClickListener(new ShowChildActivity(this, RelativeLayoutActivity.class));
    	
    	showListeViewButton.setOnClickListener(new ShowChildActivity(this, ListViewActivity.class));
    	showGridViewButton.setOnClickListener(new ShowChildActivity(this, GridViewActivity.class));
    	
    	showSpinnerButton.setOnClickListener(new ShowChildActivity(this, SpinnerActivity.class));
    }	

}
