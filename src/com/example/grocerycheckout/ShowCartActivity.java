package com.example.grocerycheckout;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ListView;

import com.example.grocerycheckout.models.CartItem;

public class ShowCartActivity extends Activity {
	ListView lvCartItems;
	CartItemArrayAdapter adapter;
	List<CartItem> cartItems = CartItem.getStaticCartList();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_cart);
		_configureViews();
	}
	
	public void _configureViews() {
		adapter = new CartItemArrayAdapter(this, cartItems);
		lvCartItems = (ListView) findViewById(R.id.lvCartItems);
		lvCartItems.setAdapter(adapter);
		registerForContextMenu(lvCartItems);
	}
	
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
	                                ContextMenuInfo menuInfo) {
	    super.onCreateContextMenu(menu, v, menuInfo);
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.cart_context_menu, menu);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show_cart, menu);
		return true;
	}

}
