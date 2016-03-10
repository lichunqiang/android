package com.light.news.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.light.news.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class GridViewActivity extends Activity implements OnItemClickListener{
	private GridView gridView;
	
	private List<Map<String, Object>> dataList;
	
	private int[] ico = {R.drawable.ic_launcher, R.drawable.ic_launcher, 
			R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher};
	
	private String[] iconName = {"one", "two", "three", "four", "five"};
	private SimpleAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridview_activity);
		gridView = (GridView) findViewById(R.id.gridViewDemo);
		
		//1.准备数据源
		//2.新建适配器(SimpleAdapter)
		//3.Gridview加载适配器
		//4.配置事件监听器(OnItemClickListner)
		
		dataList = new ArrayList<Map<String,Object>>();
		String[] from = {"text", "image"};
		int[] to  = {R.id.gridview_txt, R.id.gridview_img};
		adapter = new SimpleAdapter(this, getData(), R.layout.gridview_item, from, to);
		
		gridView.setAdapter(adapter);
		gridView.setOnItemClickListener(this);
	}

	private List<Map<String, Object>> getData() {
		int len = ico.length;
		for (int i = 0; i < len; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("image", ico[i]);
			map.put("text", iconName[i]);
			dataList.add(map);
		}
		return dataList;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
//		gridView.getItemAtPosition(position);
		Toast.makeText(this, "我是" + iconName[position], Toast.LENGTH_SHORT).show();
		
	}
}		
