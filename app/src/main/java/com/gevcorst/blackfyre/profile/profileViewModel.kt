package com.gevcorst.blackfyre.profile

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.Job


class profileViewModel(application: Application) : AndroidViewModel(application){
    /**
     * viewModelJob allows us to cancel all coroutines started by this ViewModel.
     */
    private var viewModelJob = Job()
   private val favorites = MutableLiveData<List<Favorite>>()
    fun getFavorites():LiveData<List<Favorite>>{

        return favorites
    }


}
data class Favorite(val name:String, val profileImage:String,
                    val address:String, val services:ArrayList<String>,val hours:Hours){
}
data class Hours(val start:String, val close:String){

}