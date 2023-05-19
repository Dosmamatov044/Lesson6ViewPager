package com.example.lesson6viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.lesson6viewpager.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
//tabLayout добавить
//добавить  кнопку текстом чтобы до последного было надпись next, в последнем (В кнопке надпись финиш) перехадила в другои активити и при следующем запуске приложении запускался новы фрагмент

   lateinit var  viewBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        viewPager=viewBinding.viewPager

        val adapter=PagerAdapter(this)

viewPager.adapter=adapter















    }


    companion object{
        lateinit var  viewPager:ViewPager2


    }





}