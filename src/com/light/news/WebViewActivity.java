package com.light.news;
import com.light.news.R;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * 
 * 需要在Manifest中启用网络权限
 *
 */
public class WebViewActivity extends Activity {
	
	private WebView webView;
	
	String url = "http://www.lxpgw.com";
	
	ProgressDialog dialog;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview_activity);
		
		webView = (WebView) findViewById(R.id.webview_demo);
		
		//1. 通过Intent的方式打开一个链接
		/*
		Uri uri = Uri.parse(url);
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
		*/
		
		init();
	}

	private void init() {
		//默认使用手机内的浏览器应用打开网址
		
		//加载本地资源
		//webView.loadUrl("file://assets/example.html");
		
		//加载web资源
		webView.loadUrl(url);
		
		//覆盖webview的行为
		webView.setWebViewClient(new WebViewClient() {
			//WebviewClient帮助webview处理一些页面控制请求和请求通知
			@Override
			public boolean shouldOverrideUrlLoading(WebView view, String url) {
				//返回值是true控制网页在webview中打开, false 调用系统浏览器打开
				view.loadUrl(url);
				return true;
			}
			
		});
		
		webView.setWebChromeClient(new WebChromeClient() {
			@Override
			public void onProgressChanged(WebView view, int newProgress) {
				// newProgress 1-100之间的整数	
				if (newProgress == 100) {
					 closeDialog(newProgress);
				} else {
					openDialog(newProgress);
				}
			}

			private void openDialog(int newProgress) {
				if (dialog == null) {
					dialog = new ProgressDialog(WebViewActivity.this);
					dialog.setTitle("正在加载");
					dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
					dialog.setProgress(newProgress);
					dialog.show();
				} else {
					dialog.setProgress(newProgress);
				}
				
			}

			private void closeDialog(int newProgress) {
				if (dialog != null && dialog.isShowing()) {
					dialog.dismiss();
					dialog = null;
				}
				
			}
		});
		
		//在WebView中启用javascript
		WebSettings settings = webView.getSettings();
		settings.setJavaScriptEnabled(true); //支持javascript启用
		
		//启用缓存
		settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		
	}
	//改写物理按键-返回逻辑
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

		if (keyCode == KeyEvent.KEYCODE_BACK) {
			
			if (webView.canGoBack()) {
				webView.goBack();
				return true;
			} else {
				System.exit(1);
			}
		}
		return super.onKeyDown(keyCode, event);
	}
}
