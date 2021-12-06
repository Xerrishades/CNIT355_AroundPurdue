package edu.purdue.nguye680.cnit355_aroundpurdue;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GuideActivity extends AppCompatActivity {

    ImageView btnSave;
    Location locationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        TextView lblMain = (TextView)findViewById(R.id.lblSave);
        lblMain.setText(MainActivity.locations.get(MainActivity.place).name);

        TextView txtRate = (TextView)findViewById(R.id.txtRate);
        txtRate.setText(MainActivity.locations.get(MainActivity.place).rate);

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

        btnSave = (ImageView) findViewById(R.id.imgUnsave);
        locationName = MainActivity.locations.get(MainActivity.place);

        if(SaveActivity.savedLocations.contains(locationName)) {
            System.out.println("already Saved");
            btnSave.setImageDrawable(getResources().getDrawable(R.drawable.save));
        }
    }

    public void clickLink(View view) {

       String website = MainActivity.locations.get(MainActivity.place).link;
       Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
       startActivity(mIntent);
    }


    public void onClickSave(View view) {
        if(!SaveActivity.savedLocations.contains(locationName)) {
            System.out.println("saving");
            btnSave.setImageDrawable(getResources().getDrawable(R.drawable.save));

            SaveActivity.savedLocations.add(locationName);

        } else {
            System.out.println("unsaving");
            btnSave.setImageDrawable(getResources().getDrawable(R.drawable.unsave));
            SaveActivity.savedLocations.remove(locationName);
        }

        for(int i = 0; i < SaveActivity.savedLocations.size() ; i++){

            System.out.println(SaveActivity.savedLocations.get(i).name);

        }

    }
}
