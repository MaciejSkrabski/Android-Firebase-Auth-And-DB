package com.example.loginregister

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference

class Books : Fragment() {
    val authlistener = FirebaseAuth.AuthStateListener() {
        fun onAuthStateChanged(firebaseAuth: FirebaseAuth) {
            val user = firebaseAuth.currentUser;
            Log.d("user", "$user")
            if (user != null) {
                // User is signed in

            } else {
                // User is signed out
                Log.e("USER SIGNED OUT", "USER SIGNED OUT")
            }
            // ...
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        Log.d("BooksHere", "$authlistener")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_books, container, false)
    }


}
