package com.light.news.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.light.news.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class ListViewActivity extends Activity implements OnItemClickListener, OnScrollListener {
	
	private ListView listView;
	
	private ArrayAdapter<String> arr_adapter;
	private SimpleAdapter simple_adapter;
	private List<Map<String, Object>> dataList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview_activity);
		
		listView = (ListView) findViewById(R.id.listViewDemo);
		
		//新建一个适配器
//		String[] arr_data = {"第一列", "第二列", "第三列", "第四列",};
//		arr_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr_data);
//		
//		listView.setAdapter(arr_adapter);
		
		
		//simpleAdapter
		dataList = new ArrayList<Map<String,Object>>();
		simple_adapter = new SimpleAdapter(this, getData(), R.layout.listview_item, new String[]{"pic", "text"}, new int[]{R.id.listview_img_view, R.id.listview_txt_view});
		
		listView.setAdapter(simple_adapter);
		
		listView.setOnItemClickListener(this);
		listView.setOnScrollListener(this);
	}

	private List<Map<String, Object>> getData() {
		for (int i = 0; i < 20; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("pic", R.drawable.ic_launcher);
			map.put("text", "Hello" + i);
			dataList.add(map);
		}
		return dataList;
	}

	@Override
	public void onScrollStateChanged(AbsListView view, int scrollState) {
		
		switch (scrollState) {
			case SCROLL_STATE_FLING:
				Log.i("ListView", "用户在手指离开屏幕之前，由于用力滑了一下，视图仍依靠惯性滑动");
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("pic", R.drawable.ic_launcher);
				map.put("text", "New...");
				dataList.add(map);
				simple_adapter.notifyDataSetChanged();
				break;
			case SCROLL_STATE_IDLE:
				Log.i("ListView", "视图已停止滑动");
				break;
			case SCROLL_STATE_TOUCH_SCROLL:
				Log.i("ListView", "手指没离开屏幕");
				break;
		}
	}

	@Override
	public void onScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {

		String text = listView.getItemAtPosition(position) + "";
		Toast.makeText(this, "position=" + position + " text=" + text, Toast.LENGTH_SHORT).show();
	}
}
