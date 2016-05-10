package com.mobile.stockr.stockr_android;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import yahoofinance.YahooFinance;



import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    @Override
    public void onClick(View v) {
        Button btnSearch = (Button) v;
        TextView lblValueDisplay = (TextView) v;
        lblValueDisplay.setText("TEST");
    }
}
