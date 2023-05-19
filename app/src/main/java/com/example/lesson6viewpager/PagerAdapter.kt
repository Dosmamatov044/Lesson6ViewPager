package com.example.lesson6viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
private const val NUM_PAGES=4

 class  PagerAdapter (fa: FragmentActivity): FragmentStateAdapter(fa){


    override fun getItemCount(): Int {

        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {


       val bundle=Bundle()

        bundle.putInt("key",position)
        val fragment=  FirstFragment()
        fragment.arguments=bundle


        if (position==2){
return SecondFragment()

        }else{

           return fragment

        }



    }





}