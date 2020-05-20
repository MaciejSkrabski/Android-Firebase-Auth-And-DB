package com.example.loginregister

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var mAuth: FirebaseAuth
    private lateinit var txt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = testing
        mAuth = FirebaseAuth.getInstance()

    }

    override fun onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        var currentUser = mAuth.currentUser
        txt.text = currentUser.toString()

    }
}
