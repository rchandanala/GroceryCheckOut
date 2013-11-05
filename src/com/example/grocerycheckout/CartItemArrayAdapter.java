package com.example.grocerycheckout;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.grocerycheckout.models.CartItem;

public class CartItemArrayAdapter extends ArrayAdapter<CartItem> {

	public CartItemArrayAdapter(Context context, List<CartItem> cartItems) {
		super(context, R.layout.cart_item, cartItems);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		CartItem ci= this.getItem(position);
		// TODO Auto-generated method stub
		View view = convertView;
		if (view == null) {
			LayoutInflater inflater = LayoutInflater.from(getContext());
			//LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.cart_item, null);
		}
		TextView tvQuantity = (TextView) view.findViewById(R.id.tvQuantity);
		TextView tvProductName = (TextView) view.findViewById(R.id.tvProductName);
		TextView tvCartItemPrice = (TextView) view.findViewById(R.id.tvCartItemPrice);
		tvCartItemPrice.setText(ci.getPrice().toString());
		tvProductName.setText(ci.getProduct().getName());
		tvQuantity.setText(String.valueOf(ci.getQuantity()));
		return view;
	}
}
