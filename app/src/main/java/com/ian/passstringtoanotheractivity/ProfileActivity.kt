package com.ian.passstringtoanotheractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val bundle=intent.extras
        val name=findViewById<TextView>(R.id.nameTv)
        val email=findViewById<TextView>(R.id.emailTv)
        val phone=findViewById<TextView>(R.id.phoneTv)
        val address=findViewById<TextView>(R.id.addressTv)

        name.setText(bundle!!.getCharSequence("jina"))
        email.setText(bundle!!.getCharSequence("email"))
        phone.setText(bundle!!.getCharSequence("phone"))
        address.setText(bundle!!.getCharSequence("address"))
    }
}