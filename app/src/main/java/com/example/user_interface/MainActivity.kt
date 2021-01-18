package com.example.user_interface

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("작성중안 내용을 저장하지 않고 나가시겠습니까?")
        builder.setPositiveButton("확인", dialogListener)
        builder.setNegativeButton("취소", null)
        val dialog = builder.create()
        dialog.show()
    }
    val dialogListener = object : DialogInterface.OnClickListener{
        override fun onClick(dialog: DialogInterface?, which: Int) {
            finish()
        }
    }
}