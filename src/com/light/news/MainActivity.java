package com.light.news;

import com.light.news.events.TestEvent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button loginButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //������XML�ļ����뵽activity
        setContentView(R.layout.activity_main);
       /**
        * 1. ��ʼ����ǰ����Ҫ�Ŀؼ� 
        * 	findViewById - ������һ��View����,ת����Button
        * 
        * 2.
        */
        
        loginButton = (Button) findViewById(R.id.button1);
        
        initEvents();
        
        TestEvent event = new TestEvent();
    }
    
    protected void initEvents() {
    	/**
    	 * ������ķ�ʽ
    	 */
    	loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				System.out.println("clicked");
				
			}
		});
    }
    
    protected void loginClicked()
    {
    	
    }
    
    

}
