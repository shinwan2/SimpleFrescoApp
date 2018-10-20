package com.shinwan2.simplefrescoapp

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.imageView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView.setImageURI("http://static01.nyt.com/images/2015/08/18/business/18EMPLOY/18EMPLOY-thumbStandard.jpg")
    }
}
