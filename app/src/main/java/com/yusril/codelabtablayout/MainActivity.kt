package com.yusril.codelabtablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.yusril.codelabtablayout.viewpager.SectionsPagerAdapter

class MainActivity : AppCompatActivity() {
    companion object{
        @StringRes
        private  val TAB_TITLES= intArrayOf(
                R.string.tab_text_1,
                R.string.tab_text_2
        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // viewpager
        val sectionsPagerAdapter=SectionsPagerAdapter(this)
        // inisialisasi view pager
        val viewPager:ViewPager2=findViewById(R.id.view_pager)
        viewPager.adapter=sectionsPagerAdapter// set adapter view pager

        // inisialisasi tab
        val tabs:TabLayout=findViewById(R.id.tabs)
        // masukan tab dan view pager
        /*
        * Dengan menerapkan TabLayoutMediator, maka Fragment yang tampil pada ViewPager2
        * akan sesuai dengan posisi yang dipilih pada tab. Selain itu, di sini Anda juga
        * menentukan judul dari masing-masing Tab dengan menggunakan
        * TAB_TITLE yang diambil sesuai dengan urutan posisinya.
        * */
        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
        supportActionBar?.elevation=0f
    }
}