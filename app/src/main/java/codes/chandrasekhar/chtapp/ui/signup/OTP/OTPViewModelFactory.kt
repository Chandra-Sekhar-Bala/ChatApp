package codes.chandrasekhar.chtapp.ui.signup.OTP

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OTPViewModelFactory(private val application: Application) : ViewModelProvider.Factory{
    /**
     * Creates a new instance of the given `Class`.
     *
     * @param modelClass a `Class` whose instance is requested
     * @return a newly created ViewModel
     */
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(OTPViewModel::class.java))
            OTPViewModel(this.application) as T
        else
            throw IllegalArgumentException("ViewModel not found")
    }
}