package com.sayamphoo.headtails.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sayamphoo.headtails.R
import com.sayamphoo.headtails.fragment.Coin1Fragment
import com.sayamphoo.headtails.fragment.Coin2Fragment
import com.sayamphoo.headtails.fragment.Coin3Fragment

private val TAB_TITLES = arrayOf(
    R.string.coins1,
    R.string.coins2,
    R.string.coins3
)

class SectionsPagerAdapter(val context: Context, val fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return context.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Coin1Fragment()
            1 -> Coin2Fragment()
            else -> Coin3Fragment()
         }
    }

}