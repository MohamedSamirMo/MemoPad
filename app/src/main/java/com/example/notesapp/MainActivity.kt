package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.notesapp.viewmodel.NoteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    // باستخدام Hilt لتهيئة الـ ViewModel مباشرة
    private val noteViewModel: NoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // لا تحتاج إلى `setUpViewModel` بعد الآن لأن Hilt يقوم بإدارة ذلك.
        // يمكنك البدء في استخدام noteViewModel هنا
    }
}
