package com.example.grocery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GroceryList extends AppCompatActivity {

    ListView l1;
    String[] groceryList = {"White Bread","Rice Flour","Wheat Flour","Olive Oil","Black Gram","Frozen Peas","Eggs","Mozzarella Cheese","American Cheddar",
    "Sweet Corn","Milk","Orange Juice","Alphonso Mangoes","Tomatoes","Potatoes","Green Bell Pepper","Cauliflower","Jackfruit","Bananas","Kiwi"};
    //groceryList is the string array which contains the items which need to be displayed in the listview.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);

        l1 = findViewById(R.id.glist);

        //Here i'm using a simple ArrayAdapter to populate the list view.
        //The ArrayAdapter, by default, takes all the array elements and puts each element in a textview and returns the view.
        //Then the list view is populated with these views.

        ArrayAdapter<String> a1 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,groceryList); //simple_list_item_1 is a built-in xml file which contains the layout used by the ArrayAdapter.
        l1.setAdapter(a1);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv = (TextView) view;
                Toast.makeText(getApplicationContext(), (position+1)+": "+ tv.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
