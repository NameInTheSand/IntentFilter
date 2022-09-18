package com.example.intentfilter

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.intentfilter.MainActivity.Companion.NAME_AUDIO_EXTRAS
import com.example.intentfilter.MainActivity.Companion.NAME_VIDEO_EXTRAS

class MixedActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_mixed)

		val text = if (intent.action?.equals("ua.ukr.droid.dev.open_audio") == true) {
			intent.getStringExtra(NAME_AUDIO_EXTRAS)
		} else {
			intent.getStringExtra(NAME_VIDEO_EXTRAS)
		}

		Log.d("TESTTAG", intent.getStringExtra(NAME_AUDIO_EXTRAS).toString() + "AUDIO")
		Log.d("TESTTAG", intent.getStringExtra(NAME_VIDEO_EXTRAS).toString() + "Video")
		Log.d("TESTTAG", text.toString())


		findViewById<TextView>(R.id.tv_show_action).text = text
	}
}