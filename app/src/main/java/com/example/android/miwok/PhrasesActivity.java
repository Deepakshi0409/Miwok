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
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<fam> family = new ArrayList<fam>();
        family.add(new fam("father", "epe"));
        family.add(new fam("mother", "eta"));
        family.add(new fam("son", "angsi"));
        family.add(new fam("daughter", "tune"));
        family.add(new fam("older brother", "taachi"));
        family.add(new fam("younger brother", "chalitti"));
        family.add(new fam("older sister", "tete"));
        family.add(new fam("younger sister", "kolliti"));
        family.add(new fam("grandmother", "ama"));
        family.add(new fam("grandfather", "pappa"));



        famAdapter adapter = new famAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
