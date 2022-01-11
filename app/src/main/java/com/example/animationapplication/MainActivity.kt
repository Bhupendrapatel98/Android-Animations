package com.example.animationapplication

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.VISIBLE
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.example.animationapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var animFadeIn: Animation
    lateinit var animFadeOut: Animation
    lateinit var animBlink: Animation
    lateinit var animZoomIn: Animation
    lateinit var animZoomOut: Animation
    lateinit var animRotate: Animation
    lateinit var animMove: Animation
    lateinit var animSlideUp: Animation
    lateinit var animSlideDown: Animation
    lateinit var animBounce: Animation
    lateinit var animSequential: Animation
    lateinit var animTogether: Animation
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainBinding.btnFadeIn.setOnClickListener{
            animFadeIn = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_in)
            mainBinding.txtFadeIn.startAnimation(animFadeIn)
        }

        mainBinding.btnFadeOut.setOnClickListener{
            animFadeOut = AnimationUtils.loadAnimation(applicationContext, R.anim.fade_out)
            mainBinding.txtFadeOut.startAnimation(animFadeOut)
        }

        mainBinding.btnBlink.setOnClickListener{
            animBlink = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)
            mainBinding.txtBlink.startAnimation(animBlink)
        }

        mainBinding.btnZoomIn.setOnClickListener{
            animZoomIn = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_in)
            mainBinding.txtZoomIn.startAnimation(animZoomIn)
        }

        mainBinding.btnZoomOut.setOnClickListener{
            animZoomOut = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom_out)
            mainBinding.txtZoomOut.startAnimation(animZoomOut)
        }

        mainBinding.btnRotate.setOnClickListener{
            animRotate = AnimationUtils.loadAnimation(applicationContext, R.anim.rotate)
            mainBinding.txtRotate.startAnimation(animRotate)
        }

        mainBinding.btnMove.setOnClickListener{
            animMove = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
            mainBinding.txtMove.startAnimation(animMove)
        }

        mainBinding.btnSlideUp.setOnClickListener{
            animSlideUp = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_up)
            mainBinding.txtSlideUp.startAnimation(animSlideUp)
        }

        mainBinding.btnSlideDown.setOnClickListener{
            animSlideDown = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_down)
            mainBinding.txtSlideDown.startAnimation(animSlideDown)
        }

        mainBinding.btnBounce.setOnClickListener{
            animBounce = AnimationUtils.loadAnimation(applicationContext, R.anim.bounce)
            mainBinding.txtBounce.startAnimation(animBounce)
        }

        mainBinding.btnSequential.setOnClickListener{
            animSequential = AnimationUtils.loadAnimation(applicationContext, R.anim.sequential)
            mainBinding.txtSeq.startAnimation(animSequential)
        }

        mainBinding.btnTogether.setOnClickListener{
            animTogether = AnimationUtils.loadAnimation(applicationContext, R.anim.together)
            mainBinding.txtTog.startAnimation(animTogether)
        }

    }
}