/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mSearchBoxEditText;

    private TextView mUrlDisplayTextView;

    private TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }

    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////
    // (2) Create a menu xml called 'main.xml' in the res->menu folder
    // (3) Add one menu item to your menu
    // (4) Give the menu item an id of @+id/action_search
    // (5) Set the orderInCategory to 1
    // (6) Show this item if there is room (use app:showAsAction, not android:showAsAction)
    // (7) Set the title to the search string ("Search") from strings.xml
    // Do 2 - 7 in menu.xml ///////////////////////////////////////////////////////////////////////

    // (8) Override onCreateOptionsMenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // (9) Within onCreateOptionsMenu, use getMenuInflater().inflate to inflate the menu
        // Lo que hacemos con esto es sobreescribir la creación del menu con el que hemos creado
        // nosotros.
        getMenuInflater().inflate(R.menu.main, menu);
        // (10) Return true to display your menu
        return true;
    }

    // (11) Override onOptionsItemSelected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // (12) Within onOptionsItemSelected, get the ID of the item that was selected
        // (13) If the item's ID is R.id.action_search, show a Toast and return true to tell Android that you've handled this menu click
        if(item.getItemId()==R.id.action_search) {
            Toast toast = Toast.makeText(getApplicationContext(), R.string.textToShow, Toast.LENGTH_SHORT);
            // (14) Don't forgot to call .show() on your Toast
            toast.show();
            return true;
        }
        // (15) If you do NOT handle the menu click, return super.onOptionsItemSelected to let Android handle the menu click
        return super.onOptionsItemSelected(item);
    }

}
