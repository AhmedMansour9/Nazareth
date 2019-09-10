package com.nazareth;

import android.app.Activity;
import android.content.Context;
import android.view.View;

import com.nazareth.Activites.Navigation;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;

public class NavigationDrawer {
    Activity context;
    public NavigationDrawer(Activity context){
     this.context=context;

    }
    public void Navigation(Toolbar toolbar){


        Navigation.toggle = new ActionBarDrawerToggle(
                context, Navigation.drawer, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        Navigation.drawer.addDrawerListener(Navigation.toggle);
        Navigation.toggle.syncState();

        Navigation.toggle.setDrawerIndicatorEnabled(false);
        toolbar.setNavigationIcon(R.drawable. ic_menu);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (Navigation.drawer.isDrawerOpen(GravityCompat.START)) {
                    Navigation.drawer.closeDrawer(GravityCompat.START);
                } else {
                    Navigation.drawer.openDrawer(GravityCompat.START);
                }
            }
        });
    }
}
