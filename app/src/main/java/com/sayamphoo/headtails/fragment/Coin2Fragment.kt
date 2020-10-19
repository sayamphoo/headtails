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

class Coin2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_coin2, container, false)

        var math1 = 10
        var math2 = 10

        val c1 = v.findViewById<ImageView>(R.id.icon_coin1)
        val c2 = v.findViewById<ImageView>(R.id.icon_coin2)

        v.findViewById<FloatingActionButton>(R.id.floatingClick).setOnClickListener {
            c1.setImageDrawable(inflater.context.getDrawable(R.drawable.wer))
            c2.setImageDrawable(inflater.context.getDrawable(R.drawable.wer))
            math1 = 0
            math2 = 0
        }

        c1.setOnClickListener {
            if (math1 == 0) {
                math1 = floor(Math.random() * 3).toInt()
                math2 = floor(Math.random() * 3).toInt()

                setImgCoins(c1, math1)
                setImgCoins(c2, math2)
            }
        }

        c2.setOnClickListener {
            if (math2 == 0) {
                math1 = floor(Math.random() * 3).toInt()
                math2 = floor(Math.random() * 3).toInt()

                setImgCoins(c1, math1)
                setImgCoins(c2, math2)
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