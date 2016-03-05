package com.light.news.layouts;

import com.light.news.R;
import com.light.news.common.ShowChildActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayoutActivity extends Activity implements OnClickListener {
	private Button btn1;
	private Button btn2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.relative_layout_activity);
		
		Button btn1 = (Button) findViewById(R.id.relative_button1);
		//show goods layout
		Button btn2 = (Button) findViewById(R.id.relative_button2);
		
		btn1.setOnClickListener(this);
		//匿名类
		btn2.setOnClickListener(new ShowChildActivity(this, GoodsLayout.class));
	}

	@Override
	public void onClick(View button) {
		Toast t = Toast.makeText(this, "hello", Toast.LENGTH_SHORT);
		t.show();
	}
}
