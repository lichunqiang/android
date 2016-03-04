package com.light.news.common;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 
 * ʵ����OnClickListener, Ϊ��ǰ��Activity��Ŀ��Activity
 *
 */
public class ShowChildActivity implements OnClickListener {
	
	private Context displayContext;
	private Class<?> targetClass;
	
	public ShowChildActivity(Context _context, Class<?> _cls) {
		displayContext = _context;
		targetClass = _cls;
	}

	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent(displayContext, targetClass);
		//start activity with no result.
		displayContext.startActivity(intent);
		
	}

}
