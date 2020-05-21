package com.example.loginregister

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var nav: NavController
    private lateinit var mail: EditText
    private lateinit var pwd: EditText
    private lateinit var reg: Button
    private lateinit var log: TextView

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = Firebase.auth

        mail = email
        pwd = password
        reg = register
        log = login


        reg.setOnClickListener { Log.d("inputs", "${mail.text}, ${pwd.text}")
        createAccount(mail.text.toString().trim(), pwd.text.toString())
        }
        log.setOnClickListener {
            Log.d("login", "try to start login activity")
            val intent = Intent (this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        Log.i("currentUser", "$currentUser")
        //updateUI(currentUser)
    }

    fun createAccount(email:String, password:String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d("createuser", "createUserWithEmail:success")
                    val user = auth.currentUser
                    //updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.d("createuser", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    //updateUI(null)
                }

                // ...
            }
    }


}