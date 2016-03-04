package com.light.news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SActivity extends Activity {
	private Button btn;
	private String content = "���";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sactivity);
		
		/**
		 * �ش���ҳ��1ʵ������һ��Intent����
		 */
		btn = (Button) findViewById(R.id.second_page_button1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent data = new Intent();
				data.putExtra("data", content);
				
				setResult(1, data);
				finish();
			}
		});
	}
}
