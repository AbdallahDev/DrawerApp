package com.example.user.drawerapp


import android.os.Bundle
import android.app.Fragment
import android.content.Context
import android.support.v7.app.ActionBarDrawerToggle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 */
 class DrawerFragment:Fragment() {



public override fun onCreateView(inflater:LayoutInflater?, container:ViewGroup?,
savedInstanceState:Bundle?):View? {
 // Inflate the layout for this fragment

        return inflater!!.inflate(R.layout.fragment_drawer, container, false)
}

    fun showDrawer(con:Context)
    {
        //var toggle:ActionBarDrawerToggle(con,)
    }

}// Required empty public constructor
