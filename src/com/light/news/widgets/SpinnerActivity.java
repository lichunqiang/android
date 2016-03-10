package com.light.news.widgets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.light.news.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class SpinnerActivity extends Activity implements OnItemSelectedListener {

	private List<String> list;
	private TextView textView;
	private Spinner spinner;
	private SimpleAdapter adapter;
	private List<Map<String, Object>> dataList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.spinner_activity);

		textView = (TextView) findViewById(R.id.spinner_display_text);
		spinner = (Spinner) findViewById(R.id.spinner);

		textView.setText("您选择城市是北京");

		// 设置数据源
		list = new ArrayList<String>();
		dataList = new ArrayList<Map<String, Object>>();

		list.add("北京");
		list.add("上海");
		list.add("深圳");
		list.add("广州");

		// 初始化适配器
//		adapter = new ArrayAdapter(this, list);
		getData();
		adapter = new SimpleAdapter(this, dataList,
				R.layout.spinner_item, new String[] { "image",
						"text" }, new int[] { R.id.spinner_image, R.id.spinner_text });
		// 设置下拉列表样式
		adapter.setDropDownViewResource(R.layout.spinner_item);

		spinner.setAdapter(adapter);
		spinner.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {

		// list.get(position);
		textView.setText("您选择的城市是" + adapter.getItem(position));

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		Toast.makeText(this, "Null", Toast.LENGTH_SHORT).show();
	}

	private void getData() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("image", R.drawable.ic_launcher);
		map.put("text", "北京");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("image", R.drawable.ic_launcher);
		map2.put("text", "上海");
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("image", R.drawable.ic_launcher);
		map3.put("text", "广州");
		Map<String, Object> map4 = new HashMap<String, Object>();
		map4.put("image", R.drawable.ic_launcher);
		map4.put("text", "深圳");
		dataList.add(map);
		dataList.add(map2);
		dataList.add(map3);
		dataList.add(map4);
	}
}
