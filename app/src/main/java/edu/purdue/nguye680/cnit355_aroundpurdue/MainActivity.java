package edu.purdue.nguye680.cnit355_aroundpurdue;

import static android.view.Gravity.CENTER;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static int place;
    static ArrayList<Location> locations = new ArrayList<Location>();
    static ArrayList<String> names = new ArrayList<String>();
    static ArrayList<Double> lats = new ArrayList<Double>();
    static ArrayList<Double> lons = new ArrayList<Double>();
    static ArrayList<Integer> images = new ArrayList<Integer>();
    Spinner spinner;
    String[] categories = { "Purdue", "Nature", "Restaurants", "Shopping", "Activities", "Exhibitions", "21+", "Cafes", "Chill"};
    String categorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                categorySelected = categories[pos];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }


        });


        Location.A.name = "Purdue Memorial Union";
        Location.A.filter ="Purdue";
        Location.A.recommendation = "Visiting Purdue Hotel \n Study with friends \n Chill in front of the fireplace \n Attend Special events";
        Location.A.description = "Memorial Union";
        Location.A.price = "N/A";
        Location.A.rate = "⭐⭐⭐⭐";
        Location.A.location = "West Lafayette";
        Location.A.address = "101 Grant St, West Lafayette, IN 47906";
        Location.A.time = "Monday - Sunday 6:00 am - 12:00 am";
        Location.A.contact = "(765) 494-8899";
        Location.A.link = "https://www.union.purdue.edu/";
        Location.A.lat = 40.424702;
        Location.A.lon = -86.910278;
        Location.A.image = R.drawable.purdue_student_union;
        locations.add(Location.A);

        Location.B.name = "Purdue Convocations";
        Location.B.filter ="Purdue";
        Location.B.recommendation = "Watch musical \n Watch TED talk \n Watch live music";
        Location.B.description = "Convocation (live music, performances, and events)";
        Location.B.price = "$$";
        Location.B.rate = "⭐⭐⭐⭐";
        Location.B.location = "West Lafayette";
        Location.B.address = "Stewart Center, 128 Memorial Mall Dr, West Lafayette, IN 47907";
        Location.B.time = "Monday - Friday 8:00 am - 5:00 pm";
        Location.B.contact = "(765) 494-9712";
        Location.B.link = "https://www.purdue.edu/convocations/";
        Location.B.lat = 40.425980;
        Location.B.lon = -86.913760;
        Location.B.image = R.drawable.download;
        locations.add(Location.B);

        Location.C.name = "Jules Janick Horticulture Garden";
        Location.C.filter="Purdue";
        Location.C.recommendation = "";
        Location.C.description = "Horticulture Garden";
        Location.C.price = "N/A";
        Location.C.rate = "⭐⭐⭐⭐";
        Location.C.location = "West Lafayette";
        Location.C.address = "Marsteller St, West Lafayette, IN 47906";
        Location.C.time = "24 hours";
        Location.C.contact = "(765) 494-1296 \n haydenml@purdue.edu";
        Location.C.lat = 40.421900;
        Location.C.lon = -86.913790;
        Location.C.image = R.drawable.garden1;
        Location.C.link = "https://www.arboretum.purdue.edu/come-learn/horticulture-garden/";
        locations.add(Location.C);

        Location.D.name = "Purdue Horticulture Gardens";
        Location.D.filter="Purdue, Nature";
        Location.D.recommendation = "";
        Location.D.description = "Horticulture Park";
        Location.D.price = "N/A";
        Location.D.rate = "⭐⭐⭐⭐";
        Location.D.location = "West Lafayette";
        Location.D.address = "Marsteller St, West Lafayette, IN 47906";
        Location.D.time = "24 hours";
        Location.D.lat = 40.421901;
        Location.D.lon = -86.913790;
        Location.D.image = R.drawable.garden2;
        Location.D.contact = "(765) 494-1296 \n haydenml@purdue.edu";
        Location.D.link = "https://www.arboretum.purdue.edu/come-learn/horticulture-garden/";
        locations.add(Location.D);

        Location.E.name = "Ross-Ade Stadium";
        Location.E.filter="Purdue, Sports";
        Location.E.recommendation = "Watch Football \n Watch Basketball \n Watch Volleyball";
        Location.E.description = "Sporting Events";
        Location.E.price = "$$";
        Location.E.rate = "⭐⭐⭐";
        Location.E.location = "West Lafayette";
        Location.E.address = "John R Wooden Dr, West Lafayette, IN 47906";
        Location.E.time = "24 hours";
        Location.E.contact = "";
        Location.E.lat = 40.4351300;
        Location.E.lon = -86.9173900;
        Location.E.image = R.drawable.ross_ade_stadium;
        Location.E.link = "";
        locations.add(Location.E);

        Location.F.name = "Purdue Galleries";
        Location.F.filter = "Purdue, Exhibition";
        Location.F.recommendation = "";
        Location.F.description = "";
        Location.F.price = "";
        Location.F.rate = "⭐⭐⭐";
        Location.F.location = "West Lafayette";
        Location.F.address = "552 W Wood St, West Lafayette, IN 47907";
        Location.F.time = "Monday-Friday: 10:00 am - 5:00 pm";
        Location.F.contact = "(765) 494-3061";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.F.link = "https://www.cla.purdue.edu/academic/rueffschool/galleries/index.html";
        locations.add(Location.F);

        Location.G.name = "Union Rack & Roll";
        Location.G.filter = "Purdue, Activity";
        Location.G.recommendation = "Play bowling";
        Location.G.description = "Bowling";
        Location.G.price = "$";
        Location.G.rate = "⭐⭐⭐";
        Location.G.location = "West Lafayette";
        Location.G.address = "101 S Grant St, West Lafayette, IN 47906";
        Location.G.time = "Monday      10AM–9PM \n Tuesday    10AM–9PM \n Wednesday  10AM–9PM \n Thursday   10AM–11PM \n Friday       10AM–11PM \n Saturday  10AM–11PM \n Sunday       1PM–9PM";
        Location.G.contact = "(765) 494-8990";
        Location.G.lat = 40.4221186;
        Location.G.lon = -86.9098706;
        Location.G.image = R.drawable.purdue_university_art_galleries;
        Location.G.link = "https://union.purdue.edu/racknroll/index.html";
        locations.add(Location.G);

        Location.H.name = "All Fired Up";
        Location.H.filter = "Activity";
        Location.H.recommendation = "Paint the seasonal pottery";
        Location.H.description = "Pottery";
        Location.H.price = "$$";
        Location.H.rate = "⭐⭐⭐";
        Location.H.location = "West Lafayette";
        Location.H.address = "375 Brown St, West Lafayette, IN 47906";
        Location.H.time = "Monday      12PM–9PM \n Tuesday    12PM–9PM \n Wednesday  12PM–9PM \n Thursday   12PM–9PM \n Friday    12PM–9PM \n Saturday   12PM–9PM \n Sunday    12PM–5PM";
        Location.H.contact = "(765) 743-7800";
        Location.H.lat = 40.4221186;
        Location.H.lon = -86.9098706;
        Location.H.image = R.drawable.purdue_university_art_galleries;
        Location.H.link = "https://www.allfiredupwestlafayette.com/";
        locations.add(Location.H);

        Location.I.name = "Merlin’s Beard";
        Location.I.filter = "Activity";
        Location.I.recommendation = "Attend the special cat event Enjoy board games with friends";
        Location.I.description = "Board Game";
        Location.I.price = "$";
        Location.I.rate = "⭐⭐⭐⭐";
        Location.I.location = "Lafayette";
        Location.I.address = "220 Columbia Street, Lafayette, IN 47901";
        Location.I.time = "Monday Closed \nTuesday - Thursday: 6–10PM\nFriday	6–11PM\nSaturday 12PM–12AM\nSunday	12–8PM";
        Location.I.contact = "(765) 714-4441";
        Location.I.lat = 40.4221186;
        Location.I.lon = -86.9098706;
        Location.I.image = R.drawable.purdue_university_art_galleries;
        Location.I.link = "http://merlinsbeard.net/";
        locations.add(Location.I);

        Location.J.name = "Mission: Breakout Lafayette";
        Location.J.filter = "Activity";
        Location.J.recommendation = "";
        Location.J.description = "Escape Room";
        Location.J.price = "$$";
        Location.J.rate = "⭐⭐⭐";
        Location.J.location = "Lafayette";
        Location.J.address = "325 S. Earl Avenue, Lafayette, IN 47904";
        Location.J.time = "Monday  Closed \n Tuesday	12–8PM \n Wednesday	12–8PM \n Thursday	12–8PM \n Friday	12–9:45PM \n Saturday	11AM–10:15PM \n Sunday	12–8PM";
        Location.J.contact = "(765) 250-5180";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.J.link = "https://www.missionbreakoutlafayette.com/";
        locations.add(Location.J);

        Location.K.name = "Lafayette Farmers Market";
        Location.K.filter = "Activity";
        Location.K.recommendation = "Look around local markets and buy fresh veggies";
        Location.K.description = "Farmers Market";
        Location.K.price = "";
        Location.K.rate = "⭐⭐⭐";
        Location.K.location = "Lafayette";
        Location.K.address = "N 5th St, Lafayette, IN 47901";
        Location.K.time = "Saturday 8AM-12:30PM";
        Location.K.contact = "(765) 742-4044";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.K.link = "https://lafayettefarmersmarket.com/";
        locations.add(Location.K);

        Location.L.name = "Lazy Cat Lounge";
        Location.L.filter = "Activity, Chill";
        Location.L.recommendation = "Cat cafe *Cat allergy";
        Location.L.description = "Cat Cafe";
        Location.L.price = "$";
        Location.L.rate = "⭐⭐⭐";
        Location.L.location = "Lafayette";
        Location.L.address = "846 Main St, Lafayette, IN 47901";
        Location.L.time = "Monday  Closed \nTuesday	1–8PM\n Wednesday	1–8PM\n Thursday	1–8PM\n Friday	1–8PM \nSaturday	11AM–8PM Sunday Closed";
        Location.L.contact = "(812) 340-2312";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.L.link = "https://www.lazycatloungecafe.com/";
        locations.add(Location.L);

        Location.M.name = "West Lafayette Public Library";
        Location.M.filter = "Chill";
        Location.M.recommendation = "Study with friends \nChoose book for the month";
        Location.M.description = "Library";
        Location.M.price = "";
        Location.M.rate = "⭐⭐⭐";
        Location.M.location = "West Lafayette";
        Location.M.address = "208 W Columbia St, West Lafayette, IN 47906";
        Location.M.time = " Monday	Closed \nTuesday	12–8PM \nWednesday	12–8PM \nThursday	12–8PM \nFriday	12–6PM \nSaturday	10AM–6PM \nSunday	Closed";
        Location.M.contact = "(765) 743-2261";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.M.link = "https://wlaf.lib.in.us/";
        locations.add(Location.M);

        Location.N.name = "Silver Dipper";
        Location.N.filter = "Cafe";
        Location.N.recommendation = "- best : Cookie dough, Raspberry Lemon";
        Location.N.description = "Ice Cream";
        Location.N.price = "$";
        Location.N.rate = "⭐⭐⭐";
        Location.N.location = "West Lafayette";
        Location.N.address = "307 Sagamore Pkwy W C, West Lafayette, IN 47906";
        Location.N.time = "Monday	12–9PM \nTuesday	12–9PM \nWednesday	12–9PM \nThursday	12–9PM \nFriday	12–10PM \nSaturday	12–10PM \nSunday	12–9PM";
        Location.N.contact = "(765) 418-0444";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.N.link = "https://www.silverdipper.com";
        locations.add(Location.N);

        Location.O.name = "Start City Cafe";
        Location.O.filter = "Cafe";
        Location.O.recommendation = "Aesthetic Cafe for studying \nTry brunch \nCheck the West Lafayette/Lafayette new events";
        Location.O.description = "Cafe";
        Location.O.price = "$$";
        Location.O.rate = "⭐⭐⭐⭐⭐";
        Location.O.location = "Lafayette";
        Location.O.address = "210 Main St, Lafayette, IN 47901";
        Location.O.time = "Monday	7:30AM–5PM \nTuesday	7:30AM–5PM \nWednesday	7:30AM–5PM \nThursday	7:30AM–5PM \nFriday	7:30AM–5PM \nSaturday	7:30AM–5PM \nSunday	Closed";
        Location.O.contact = "(765) 420-7099";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.O.link = "starcity.coffee";
        locations.add(Location.O);

        Location.P.name = "East End Grill";
        Location.P.filter = "restaurant";
        Location.P.recommendation = "Recommendation : Chocolate cake";
        Location.P.description = "Modern American restaurant";
        Location.P.price = "$$";
        Location.P.rate = "⭐⭐⭐";
        Location.P.location = "Lafayette";
        Location.P.address = "1016 Main St, Lafayette, IN 47901";
        Location.P.time = "Monday	Closed \nTuesday	11AM–10PM \nWednesday	11AM–10PM \nThursday	11AM–10PM \nFriday	11AM–11PM \nSaturday	11AM–11PM \nSunday	11AM–9PM";
        Location.P.contact = "(765) 607-4600";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.P.link = "eastendmain.com";
        locations.add(Location.P);

        Location.Q.name = "Yatagarasu";
        Location.Q.filter = "restaurant";
        Location.Q.recommendation = "Full of real japanese restaurant vibe \nTry basic ramen first! : Rich Garlic Tonkotsu Ramen \nVegan Menu : Can replace meats to bunch of veggies";
        Location.Q.description = "Japanese ramen";
        Location.Q.price = "$$";
        Location.Q.rate = "⭐⭐⭐";
        Location.Q.location = "West Lafayette";
        Location.Q.address = "100 S Chauncey Ave STE 110, West Lafayette, IN 47906";
        Location.Q.time = "Monday	12–10PM \nTuesday	12–10PM \nWednesday	12–10PM \nThursday	12–10PM \nFriday	12–10PM \nSaturday	12–10PM \nSunday	12–10PM";
        Location.Q.contact = "(765) 479-7952";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.Q.link = "https://www.yatagarasuramen.com/";
        locations.add(Location.Q);

        Location.R.name = "Canes";
        Location.R.filter = "restaurant";
        Location.R.recommendation = "Recommendation : box combo no cole slaw extra toast";
        Location.R.description = "Chicken";
        Location.R.price = "$";
        Location.R.rate = "⭐⭐⭐";
        Location.R.location = "West Lafayette";
        Location.R.address = "100 S Chauncey Ave Ste 100, West Lafayette, IN 47906";
        Location.R.time = "Monday	10AM–12AM \nTuesday	10AM–12AM \nWednesday	10AM–12AM \nThursday	10AM–12AM \nFriday	10AM–12AM \nSaturday	10AM–12AM \nSunday	10AM–12AM";
        Location.R.contact = "(463) 213-3068";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.R.link = "";
        locations.add(Location.R);

        Location.R.name = "Triple XXX";
        Location.R.filter = "restaurant";
        Location.R.recommendation = "Recommendation : THE DUANE PURVIS ALL AMERICAN * Peanut Allergy";
        Location.R.description = "Burger";
        Location.R.price = "$";
        Location.R.rate = "⭐⭐⭐⭐";
        Location.R.location = "West Lafayette";
        Location.R.address = "2 N Salisbury St, West Lafayette, IN 47906";
        Location.R.time = "Monday	7AM–10PM \nTuesday	Closed \nWednesday	7AM–10PM \nThursday	7AM–10PM \nFriday	7AM–10PM \nSaturday	7AM–10PM \nSunday	7AM–10PM";
        Location.R.contact = "(765) 743-5373";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.R.link = "triplexxxfamilyrestaurant.com";
        locations.add(Location.R);

        Location.S.name = "Fiesta Mexican Grills";
        Location.S.filter = "restaurant";
        Location.S.recommendation = "Recommendation : Grilled chicken burrito with queso on the side";
        Location.S.description = "Mexican";
        Location.S.price = "$";
        Location.S.rate = "⭐⭐⭐⭐⭐";
        Location.S.location = "West Lafayette";
        Location.S.address = "102 N Chauncey Ave, West Lafayette, IN 47906";
        Location.S.time = "Monday	11AM–9PM \nTuesday	11AM–9PM \nWednesday	11AM–9PM \nThursday	11AM–9PM \nFriday	11AM–9PM \nSaturday	12–9PM \nSunday	Closed";
        Location.S.contact = "(765) 838-0987";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.S.link = "";
        locations.add(Location.S);

        Location.S.name = "Potbelly Sandwiches";
        Location.S.filter = "restaurant";
        Location.S.recommendation = "Recommendation : Turkey Sandwich";
        Location.S.description = "Sandwich";
        Location.S.price = "$";
        Location.S.rate = "⭐⭐⭐⭐⭐";
        Location.S.location = "West Lafayette";
        Location.S.address = "117 Northwestern Ave Suite 1, Lafayette, IN 47906";
        Location.S.time = "Monday	12–8PM \nTuesday	12–8PM \nWednesday	12–8PM \nThursday	12–8PM \nFriday	12–8PM \nSaturday	12–8PM \nSunday	12–8PM";
        Location.S.contact = "(765) 743-2993";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.S.link = "potbelly.com";
        locations.add(Location.S);

        Location.T.name = "Sunrise Diner";
        Location.T.filter = "restaurant";
        Location.T.recommendation = "Comfort food and Brunch";
        Location.T.description = "Breakfast, Lunch";
        Location.T.price = "$";
        Location.T.rate = "⭐⭐⭐⭐";
        Location.T.location = "Lafayette";
        Location.T.address = "501 Columbia St, Lafayette, IN 47901";
        Location.T.time= "Monday	12–8PM \nTuesday	12–8PM \nWednesday	12–8PM \nThursday	12–8PM \nFriday	12–8PM \nSaturday	12–8PM \nSunday	12–8PM";
        Location.T.contact = "(765) 742-4204";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.T.link = "sunrisediner.com";
        locations.add(Location.T);

        Location.U.name = "Lafayette Brewing Company";
        Location.U.filter = "restaurant";
        Location.U.recommendation = "Comfort food and Brunch";
        Location.U.description = "Breakfast, Lunch";
        Location.U.price = "$";
        Location.U.rate = "⭐⭐⭐⭐";
        Location.U.location = "Lafayette";
        Location.U.address = "501 Columbia St, Lafayette, IN 47901";
        Location.U.time= "Monday	12–8PM \nTuesday	12–8PM \nWednesday	12–8PM \nThursday	12–8PM \nFriday	12–8PM \nSaturday	12–8PM \nSunday	12–8PM";
        Location.U.contact = "(765) 742-2591";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.U.link = "https://lafbrew.com/";
        locations.add(Location.U);

        Location.V.name = "Bru Burger";
        Location.V.filter = "restaurant";
        Location.V.recommendation = "BOURBON";
        Location.V.description = "Modern American restaurant";
        Location.V.price = "$$";
        Location.V.rate = "⭐⭐⭐⭐";
        Location.V.location = "Lafayette";
        Location.V.address = "101 Main St Suite 100, Lafayette, IN 47901";
        Location.V.time= "Monday	11AM–9PM \nTuesday	11AM–9PM \nWednesday	11AM–9PM \nThursday	11AM–9PM \nFriday	11AM–10PM \nSaturday	11AM–10PM \nSunday	11AM–8PM";
        Location.V.contact = "(765) 479-7400";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.V.link = "https://www.bruburgerbar.com/";
        locations.add(Location.V);

        Location.W.name = "Harry's Chocolate Shop";
        Location.W.filter = "21+";
        Location.W.recommendation = "Buy Harry's merch \nHave free popcorns \nRecommend : Mint Julep";
        Location.W.description = "Bar";
        Location.W.price = "$";
        Location.W.rate = "⭐⭐⭐";
        Location.W.location = "West Lafayette";
        Location.W.address = "329 W State St, West Lafayette, IN 47906";
        Location.W.time= "Monday	11AM–3AM \nTuesday	11AM–3AM \nWednesday	11AM–3AM \nThursday	11AM–3AM \nFriday	11AM–3AM \nSaturday	11AM–3AM \nSunday	12PM–3AM";
        Location.W.contact = "(765) 743-1467";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.W.link = "https://www.harryschocolateshop.com/";
        locations.add(Location.W);

        Location.X.name = "The Tap";
        Location.X.filter = "21+";
        Location.X.recommendation = "Trivia every Tues, Wed, \nThursday Live Music \nRecommend : BBQ PULLED PORK Vegan Menu : Tap Fries";
        Location.X.description = "Pub";
        Location.X.price = "$$";
        Location.X.rate = "⭐⭐⭐⭐";
        Location.X.location = "West Lafayette";
        Location.X.address = "100 S Chauncey Ave, West Lafayette, IN 47906";
        Location.X.time= "Monday	11AM–12AM \nTuesday	11AM–12AM \nWednesday	11AM–12AM \nThursday	11AM–1AM \nFriday	11AM–2AM \nSaturday	11AM–2AM \nSunday	11AM–12AM";
        Location.X.contact = "(765) 588-6694";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.X.link = "https://thetapwl.com/";
        locations.add(Location.X);

        Location.Z.name = "Tippecanoe County Courthouse";
        Location.Z.filter = "Chill";
        Location.Z.recommendation = "Take picture with awesome statues \nTake picture in front of the courthouse";
        Location.Z.description = "Tour Place";
        Location.Z.price = "";
        Location.Z.rate = "⭐⭐⭐";
        Location.Z.location = "Lafayette";
        Location.Z.address = "301 Main St, Lafayette, IN 47901";
        Location.Z.time = "\nMonday	8AM–4:30PM \nTuesday	8AM–4:30PM \nWednesday	8AM–4:30PM \nThursday	8AM–4:30PM \nFriday	8AM–4:30PM \nSaturday	Closed \nSunday	Closed";
        Location.Z.contact = "(765) 423-9326";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.Z.link = "http://www.tippecanoe.in.gov/";
        locations.add(Location.Z);

        Location.a.name = "Wabash Landing 9";
        Location.a.filter = "Chill";
        Location.a.recommendation = "Go watch movie with big screen! ";
        Location.a.description = "Theater";
        Location.a.price = "$";
        Location.a.rate = "⭐⭐⭐";
        Location.a.location = "West Lafayette";
        Location.a.address = "300 E State St, West Lafayette, IN 47906";
        Location.a.time = "N/A";
        Location.a.contact = "(765) 449-7469";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.a.link = "";
        locations.add(Location.a);

        Location.b.name = "Greyhouse Coffee";
        Location.b.filter = "Cafe";
        Location.b.recommendation = "Study with Coffee and dessert - best : ";
        Location.b.description = "Cafe ";
        Location.b.price = "$$";
        Location.b.rate = "⭐⭐⭐⭐";
        Location.b.location = "West Lafayette";
        Location.b.address = "100 Northwestern Ave, West Lafayette, IN 47906";
        Location.b.time = "Monday	7AM–5PM \nTuesday	7AM–10PM \nWednesday	7AM–10PM \nThursday	7AM–10PM \nFriday	7AM–10PM \nSaturday	7AM–10PM \nSunday	7AM–10PM";
        Location.b.contact = "(765) 743-5316";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.b.link = "greyhousecoffee.com";
        locations.add(Location.b);

        Location.c.name = "Vienna Espresso Bar & Bakery";
        Location.c.filter = "Cafe";
        Location.c.recommendation = "Study with Coffee and dessert - best : ";
        Location.c.description = "Cafe ";
        Location.c.price = "$";
        Location.c.rate = "⭐⭐⭐⭐";
        Location.c.location = "West Lafayette";
        Location.c.address = "208 South St, West Lafayette, IN 47906";
        Location.c.time = "Monday	9AM–10PM \nTuesday	9AM–10PM \nWednesday	9AM–10PM \nThursday	9AM–10PM \nFriday	9AM–10PM \nSaturday	9AM–10PM \nSunday	9AM–10PM";
        Location.c.contact = "(765) 743-4446";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.c.link = "viennacoffeehouse-westlafayette.com";
        locations.add(Location.c);

        Location.d.name = "LaTea";
        Location.d.filter = "Cafe";
        Location.d.recommendation = "Bubble Tea - best : Taro bubble tea";
        Location.d.description = "Bubble Tea";
        Location.d.price = "$";
        Location.d.rate = "⭐⭐";
        Location.d.location = "West Lafayette";
        Location.d.address = "358 E State St, West Lafayette, IN 47906";
        Location.d.time = "Monday	12:30–9PM \nTuesday	12:30–9PM \nWednesday	12:30–9PM \nThursday	12:30–9PM \nFriday	12:30–10PM \nSaturday	12:30–10PM \nSunday	12:30–9PM";
        Location.d.contact = "(765) 586-9398";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.d.link = "https://www.latealounge.com/";
        locations.add(Location.d);

        Location.e.name = "The Spot";
        Location.e.filter = "21+";
        Location.e.recommendation = "Chill infront of Bonfire \nAttend special events like Karaoke, \nSpeech, or Comedy shows";
        Location.e.description = "Bar";
        Location.e.price = "$";
        Location.e.rate = "⭐⭐⭐⭐";
        Location.e.location = "Lafayette";
        Location.e.address = "409 S 4th St, Lafayette, IN 47901";
        Location.e.time = "Monday	Closed \nTuesday	5PM–12AM \nWednesday	5PM–12AM \nThursday	5PM–12AM \nFriday	5PM–2AM \nSaturday	5PM–2AM \nSunday	Closed";
        Location.e.contact = "";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.e.link = "https://www.spotspotspot.com/";
        locations.add(Location.e);

        Location.f.name = "Nine Irish Brothers";
        Location.f.filter = "21+";
        Location.f.recommendation = "Enjoy live music events on Friday and Saturday";
        Location.f.description = "Pub";
        Location.f.price = "$$";
        Location.f.rate = "⭐⭐⭐⭐";
        Location.f.location = "West Lafayette";
        Location.f.address = "119 Howard Ave, West Lafayette, IN 47906";
        Location.f.time = "Monday	11AM–11PM \nTuesday	11AM–11PM \nWednesday	11AM–11PM \nThursday	11AM–11PM \nFriday	11AM–1AM \nSaturday	11AM–1AM \nSunday	11AM–10PM";
        Location.f.contact = "(765) 746-4782";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.f.link = "nineirishbrothers.com";
        locations.add(Location.f);

        Location.g.name = "Digby’s Pub and Patio";
        Location.g.filter = "21+";
        Location.g.recommendation = "";
        Location.g.description = "Pub";
        Location.g.price = "$$";
        Location.g.rate = "⭐⭐⭐⭐";
        Location.g.location = "Lafayette";
        Location.g.address = "133 N 4th St, Lafayette, IN 47901";
        Location.g.time = "Monday	11AM–3AM \nTuesday	11AM–3AM \nWednesday	11AM–3AM \nThursday	11AM–3AM \nFriday	11AM–3AM \nSaturday	11AM–3AM \nSunday	11AM–3AM";
        Location.g.contact = "(765) 269-7179";
        Location.F.lat = 40.4221186;
        Location.F.lon = -86.9098706;
        Location.F.image = R.drawable.purdue_university_art_galleries;
        Location.g.link = "digbyspub.com";
        locations.add(Location.g);

        if(locations.size() % 2 != 0) {
            locations.add(Location.placeHolder);
        }

        for (int i = 0; i < locations.size(); i++) {
            names.add(locations.get(i).name);
            images.add(locations.get(i).image);
            lats.add(locations.get(i).lat);
            lons.add(locations.get(i).lon);
        }

        TableLayout tl = (TableLayout) findViewById(R.id.tableLayout1);

        for(int i = 0; i < names.size(); i = i + 2)
        {
            int j = i + 1;
            TableRow tr = new TableRow(this);
            TextView textview2 = new TextView(this);
            TextView textview3 = new TextView(this);
            RelativeLayout ll = new RelativeLayout(this);
            RelativeLayout ll2 = new RelativeLayout(this);
            ImageView iv = new ImageView(this);
            ImageView iv2 = new ImageView(this);

            int paddingDp = 5;
            float density = getResources().getDisplayMetrics().density;
            int paddingPixel = (int)(paddingDp * density);

            tr.setGravity(CENTER);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(paddingPixel * 39, paddingPixel * 7, 1);
            LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(paddingPixel * 39, paddingPixel * 50);


            ll.setLayoutParams(lp);
            ll2.setLayoutParams(lp);


            lp.setMargins(paddingPixel, paddingPixel, paddingPixel, 0);
            lp2.setMargins(paddingPixel, 0, paddingPixel, 0);
            tr.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT));

            textview2.setText(names.get(i));
            textview2.setTextColor(getResources().getColor(R.color.black));
            textview2.setBackgroundResource(R.color.purdue);
            textview2.setGravity(CENTER);

            textview3.setText(names.get(j));
            textview3.setTextColor(getResources().getColor(R.color.black));
            textview3.setBackgroundResource(R.color.purdue);
            textview3.setGravity(CENTER);

            iv.setImageResource(images.get(i));
            iv2.setImageResource(images.get(j));


            textview2.setLayoutParams(lp);
            textview3.setLayoutParams(lp);
            iv.setLayoutParams(lp2);
            iv2.setLayoutParams(lp2);
            ll.addView(textview2);
            ll.addView(iv);
            ll2.addView(textview3);
            ll2.addView(iv2);

            tr.addView(ll, new TableRow.LayoutParams(0));
            tr.addView(ll2, new TableRow.LayoutParams(0));
            tl.addView(tr, new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            int I = i;
            iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    place = I;
                    Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                    startActivity(intent);
                }
            });
            iv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    place = j;
                        Intent intent = new Intent(MainActivity.this, GuideActivity.class);
                        startActivity(intent);
                }
            });

            ImageButton imageButton = (ImageButton)findViewById(R.id.imageButton);

            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                    startActivity(intent);
                }
            });
        }


    }



    public void openDetailedPage(View view) {
        Intent mIntent = new Intent (this, GuideActivity.class);
        startActivity(mIntent);
    }

    public void openSavedPage(View view) {
        Intent mIntent = new Intent (this, SaveActivity.class);
        startActivity(mIntent);
    }
}