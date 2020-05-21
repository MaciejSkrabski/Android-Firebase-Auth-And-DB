package com.example.loginregister

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_fragment_navigation.*


class FragmentNavigationActivity (
    val fireBase:FirebaseDatabase = FirebaseDatabase.getInstance(),
    val databaseReference: DatabaseReference = fireBase.getReference("rozrywka"),
    rvlm: GridLayoutManager

) : AppCompatActivity ( ) {

    private val TAG = "NavAct"
    val db = FirebaseDatabase.getInstance()
    private lateinit var mDatabase: DatabaseReference
    val mAuth = FirebaseAuth.getInstance()
// ...

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
        setContentView(R.layout.activity_fragment_navigation)


        Log.d(TAG, "$mAuth")

        val bottomNavigationView = bnv
        val navController = findNavController(fragment.id)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.books, R.id.films, R.id.games))
        setupActionBarWithNavController(navController, appBarConfiguration)


        bottomNavigationView.setupWithNavController(navController)

        fun booksReference(): DatabaseReference =
            mDatabase.child("0/books")
        Log.d(TAG, booksReference().toString())
    }



}
