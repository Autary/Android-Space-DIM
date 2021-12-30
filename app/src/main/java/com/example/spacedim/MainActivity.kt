package com.example.spacedim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navCtrl = this.findNavController(R.id.mainNavHostFrag)
        // android:label in navigation.xml not working, fix by this code
        navCtrl.addOnDestinationChangedListener{
            ctrl, dest, args -> title = dest.label
        }
        NavigationUI.setupActionBarWithNavController(this, navCtrl)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navCtrl = this.findNavController(R.id.mainNavHostFrag)
        return navCtrl.navigateUp()
    }
}