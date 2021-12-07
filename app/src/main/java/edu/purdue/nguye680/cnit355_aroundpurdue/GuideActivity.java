package edu.purdue.nguye680.cnit355_aroundpurdue;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        TextView lblMain = (TextView)findViewById(R.id.lblMain);
        lblMain.setText(MainActivity.locations.get(MainActivity.place).name);

        TextView txtRate = (TextView)findViewById(R.id.txtRate);
        txtRate.setText(MainActivity.locations.get(MainActivity.place).rate);

        ImageView imageView = (ImageView)findViewById(R.id.img);
        imageView.setImageResource(MainActivity.locations.get(MainActivity.place).image);

        TextView txtFilter = (TextView)findViewById(R.id.txtFilter);
        txtFilter.setText(MainActivity.locations.get(MainActivity.place).filter);

        TextView txtDescription = (TextView)findViewById(R.id.txtDescription);
        txtDescription.setText(MainActivity.locations.get(MainActivity.place).description);

        TextView txtContact = (TextView)findViewById(R.id.txtContact);
        txtContact.setText(txtContact.getText() + MainActivity.locations.get(MainActivity.place).contact);

        TextView txtPrice = (TextView)findViewById(R.id.txtPrice);
        txtPrice.setText(txtPrice.getText() + MainActivity.locations.get(MainActivity.place).price);

        TextView txtLocation = (TextView)findViewById(R.id.txtLocation);
        txtLocation.setText(txtLocation.getText() + MainActivity.locations.get(MainActivity.place).location);

        TextView txtTime = (TextView)findViewById(R.id.txtTime);
        txtTime.setText(txtTime.getText() + MainActivity.locations.get(MainActivity.place).time);

        TextView txtRecommendation = (TextView)findViewById(R.id.txtRecommendation);
        txtRecommendation.setText(txtRecommendation.getText() + MainActivity.locations.get(MainActivity.place).recommendation);
    }
}