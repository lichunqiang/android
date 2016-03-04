package com.light.news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Activity的生命周期
 * onCreate
 * onStart
 * onResume - 获取焦点，显示到界面最顶端
 * onPause - 失去焦点 - 弹出一个dialog时
 * onStop - 弹出一个新的activity
 * onDestory
 * onRestart
 * 
 * 活动状态 - Active/Running Activity处于界面的最顶端,获取焦点
 * 暂停状态 (paused) Activity失去焦点，但对用户可见
 * 停止状态 (Stopped) Activity被完全遮挡，但保留所有状态和成员信息
 * 非活动状态 (Killed) Activity 被停止，调用了 onDestory.
 */
public class ThinkActivity extends Activity {
	final String TAG = "tag";
	
	private Button lunchBtn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.think_activity);
		Log.i(TAG, "ThinkActivity --> onCreate");
		
		lunchBtn = (Button) findViewById(R.id.btn_lunch_second);
		
		lunchBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ThinkActivity.this, ThinkSecondActivity.class);
				
				startActivity(intent);
				
			}
		});
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(TAG, "ThinkActivity --> onStart");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(TAG, "ThinkActivity --> onPause");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i(TAG, "ThinkActivity --> onResume");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(TAG, "ThinkActivity --> onStop");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "ThinkActivity --> onDestroy");
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(TAG, "ThinkActivity --> onRestart");
	}
}
