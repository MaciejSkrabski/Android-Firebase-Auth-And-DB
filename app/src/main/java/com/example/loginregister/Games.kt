package com.example.loginregister

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.database.snapshot.ChildrenNode

val childEventListener = object : ChildEventListener {
    override fun onChildAdded(dataSnapshot: DataSnapshot, previousChildName: String?) {
        Log.d("TAG", "onChildAdded:" + dataSnapshot.key!!)

        // A new comment has been added, add it to the displayed list
        val comment = dataSnapshot.getValue<>()

        // ...
    }



    class Games : Fragment() {
        val db = FirebaseDatabase.getInstance()
        val databaseReference = db.getReference("rozrywka/2/games");

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

        databaseReference.addListenerForSingleValueEvent()
        Log.d("GamesHere", "$authlistener")
        Log.d("games dbinstance", "$db")
        Log.d("databaseReference", "$databaseReference")



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_games, container, false)
    }

}

class DataSource {

    companion object{

        fun createDataSet(){


            var databaseMifkada = FirebaseDatabase.getInstance().getReference("mifkada")



            val postListener = object : ValueEventListener {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    if(dataSnapshot!!.exists()){
                        list.clear()
                        for (e in dataSnapshot.children){
                            val post = e.getValue(BlogPost::class.java)
                            list.add(post!!)
                        }
                    }
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    // Getting Post failed, log a message
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
                }
            }

            databaseMifkada.addValueEventListener(postListener)

            return list
        }
    }
}
