package com.example.myapplication.ui.perfil

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ricardo Ignacio Rodriguez Mendoza"
    }
    val text: LiveData<String> = _text
}