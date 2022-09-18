package com.example.intentfilter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		findViewById<Button>(R.id.btn_open_video).setOnClickListener {
			startActivity(Intent("ua.ukr.droid.dev.open_video").also {
				it.putExtra(
					NAME_VIDEO_EXTRAS,
					findViewById<EditText>(R.id.et_action_one_data).text.toString()
				)
			})
		}

		findViewById<Button>(R.id.btn_open_audio).setOnClickListener {
			startActivity(Intent("ua.ukr.droid.dev.open_audio").also {
				it.putExtra(
					NAME_AUDIO_EXTRAS,
					findViewById<EditText>(R.id.et_action_two_data).text.toString()
				)
			})
		}
	}

	companion object {
		const val NAME_AUDIO_EXTRAS = "AUDIO"
		const val NAME_VIDEO_EXTRAS = "VIDEO"
	}
}