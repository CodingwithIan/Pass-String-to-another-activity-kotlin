package com.ian.passstringtoanotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<EditText>(R.id.editTextTextPersonName)
        val email=findViewById<EditText>(R.id.editTextTextPersonEmail)
        val mobile=findViewById<EditText>(R.id.editTextTextPersonPhone)
        val address=findViewById<EditText>(R.id.editTextTextPersonAddress)
        val button=findViewById<FloatingActionButton>(R.id.floatingActionButton)

        button.setOnClickListener {
            val intent= Intent(this@MainActivity,ProfileActivity::class.java)
            val bundle=Bundle()
            bundle.putString("jina",name.text.toString())
            bundle.putString("email",email.text.toString())
            bundle.putString("phone",mobile.text.toString())
            bundle.putString("address",address.text.toString())

            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}