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
        //将布局XML文件引入到activity
        setContentView(R.layout.activity_main);
       /**
        * 1. 初始化当前所需要的控件 
        * 	findViewById - 返回是一个View对象,转化成Button
        * 
        * 2.
        */
        
        loginButton = (Button) findViewById(R.id.button1);
        
        initEvents();
        
        TestEvent event = new TestEvent();
    }
    
    protected void initEvents() {
    	/**
    	 * 匿名类的方式
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
