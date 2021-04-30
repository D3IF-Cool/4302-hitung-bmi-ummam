package org.d3if4020.hitungbmi.ui.history

import androidx.lifecycle.ViewModel
import org.d3if4020.hitungbmi.db.BmiDao

class HistoriViewModel (db: BmiDao) : ViewModel() {
    val data = db.getLastBmi()
}