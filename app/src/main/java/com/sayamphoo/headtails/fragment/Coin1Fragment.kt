package com.sayamphoo.headtails.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sayamphoo.headtails.R
import kotlin.math.floor

class Coin1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v: View = inflater.inflate(R.layout.fragment_coin1, container, false)

        var math1 = 10

        val c = v.findViewById<ImageView>(R.id.icon_coin1)

        v.findViewById<FloatingActionButton>(R.id.floatingClick).setOnClickListener {
            c.setImageDrawable(inflater.context.getDrawable(R.drawable.wer))
            math1 = 0
        }

        c.setOnClickListener {
            if (math1 == 0) {
                math1 = floor(Math.random() * 3).toInt()
                setImgCoins(c, math1)
            }
        }

        return v
    }

    fun setImgCoins(img: ImageView, ranrom: Int) {
        when (ranrom) {
            0 -> img.setImageDrawable(context!!.getDrawable(R.drawable.h1))
            else -> img.setImageDrawable(context!!.getDrawable(R.drawable.h2))
        }
    }

}