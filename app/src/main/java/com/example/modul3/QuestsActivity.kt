package com.example.modul3

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QuestsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quests)
        val rec: RecyclerView = findViewById(R.id.recyclers)
        rec.layoutManager = GridLayoutManager(this, 3)
        rec.adapter = QuestRecycler(this, MyObj().list)

    }
}