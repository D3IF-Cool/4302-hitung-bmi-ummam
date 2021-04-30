package org.d3if4020.hitungbmi.ui.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.d3if4020.hitungbmi.db.BmiDao

class HistoriViewModel (private val db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
    fun hapusData() = viewModelScope.launch {
        withContext(Dispatchers.IO) {
            db.clearData()
        }
    }
}