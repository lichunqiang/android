package com.light.news;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class FActivity extends Activity {
	private Button bt1;
	private Button bt2;
	private TextView text;
//	private Context mContext;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.factivity);
		
		bt1 = (Button) findViewById(R.id.button1_first);
		bt2 = (Button) findViewById(R.id.button1_second);
		text = (TextView) findViewById(R.id.textView1);
		
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ��һ���������Ķ���
				// �ڶ�������Ŀ���ļ�
				Intent intent = new Intent(FActivity.this, SActivity.class);
				startActivity(intent);
				
			}
		});
		/**
		 * startActivityForResult
		 */
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(FActivity.this, SActivity.class);
				startActivityForResult(intent, 2);
			}
		});
		
	}
	
	/**
	 * ͨ��startActivityForResult��ת
	 * requestCode: ����ı�ʶ
	 * resultCode: �ڶ���ҳ�淵�صı�ʶ
	 * data: �ڶ���ҳ��ش�������
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if (requestCode == 2 && resultCode == 1) {
			String content = data.getStringExtra("data");
			text.setText(content);
		}
	}
}
