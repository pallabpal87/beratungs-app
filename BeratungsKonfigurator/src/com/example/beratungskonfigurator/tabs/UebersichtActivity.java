package com.example.beratungskonfigurator.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.beratungskonfigurator.R;

public class UebersichtActivity extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return (LinearLayout)inflater.inflate(R.layout.tab_uebersicht_layout, container, false);
	}

	

}