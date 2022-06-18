package com.ann.englishapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import com.ann.englishapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener, View.OnFocusChangeListener, View.OnKeyListener {
    
    private lateinit var mBinding: ActivityRegisterBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        mBinding.nameEt.onFocusChangeListener = this
        mBinding.emailEt.onFocusChangeListener = this
        mBinding.passwordEt.onFocusChangeListener = this
        mBinding.cPasswordEt.onFocusChangeListener = this
    }
    
    private fun validateName(): Boolean{
        var errorMessage: String? = null
        val value: String = mBinding.nameEt.text.toString()
        if(value.isEmpty()){
            errorMessage = "Name is required"
        }

        if(errorMessage != null){
            mBinding.nameText.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }
    
    private fun validateEmail(): Boolean{
        var errorMessage: String? = null
        val value = mBinding.emailEt.text.toString()
        if(value.isEmpty()){
            errorMessage = "Email is required"
        }else if(!Patterns.EMAIL_ADDRESS.matcher(value).matches()){
            errorMessage = "Email address is invalid"
        }

        if(errorMessage != null){
            mBinding.emailText.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    private fun validatePassword(): Boolean{
        var errorMessage: String? = null
        val value = mBinding.passwordEt.text.toString()
        if(value.isEmpty()){
            errorMessage = "Password is required"
        }else if(value.length < 6){
            errorMessage = "Password must be 6 characters long"
        }

        if(errorMessage != null){
            mBinding.passwordText.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    private fun validateConfirmPassword(): Boolean{
        var errorMessage: String? = null
        val value = mBinding.cPasswordEt.text.toString()
        if(value.isEmpty()){
            errorMessage = "Confirm password is required"
        }else if(value.length < 6){
            errorMessage = "Confirm password must be 6 characters long"
        }

        if(errorMessage != null){
            mBinding.cPasswordText.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    private fun validatePasswordAndConfirmPassword(): Boolean{
        var errorMessage: String? = null
        val password = mBinding.passwordEt.text.toString()
        val confirmPassword = mBinding.cPasswordEt.text.toString()
        if(password != confirmPassword){
            errorMessage = "Confirm password doesn't match with password"
        }

        if(errorMessage != null){
            mBinding.cPasswordText.apply{
                isErrorEnabled = true
                error = errorMessage
            }
        }

        return errorMessage == null
    }

    override fun onClick(view: View?) {

    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if(view != null){
            when(view.id){
                R.id.nameEt -> {

                    if (hasFocus) {
                        if(mBinding.nameText.isCounterEnabled){
                            mBinding.nameText.isErrorEnabled = false
                        }
                    } else {
                        validateName()
                    }
                }
                R.id.emailEt -> {
                    if (hasFocus) {
                        if(mBinding.emailText.isCounterEnabled){
                            mBinding.emailText.isErrorEnabled = false
                        }
                    } else {
                        validateEmail()
                    }
                    }
                R.id.passwordEt -> {
                    if (hasFocus) {
                        if(mBinding.passwordText.isCounterEnabled){
                            mBinding.passwordText.isErrorEnabled = false
                        }
                    } else {
                        validatePassword()
                    }
                    }
                R.id.cPasswordEt -> {
                    if (hasFocus) {
                        if(mBinding.cPasswordText.isErrorEnabled){
                            mBinding.cPasswordText.isErrorEnabled = false
                        }
                    } else {
                        validateConfirmPassword()
                    }
                }
            }
        }
    }

    override fun onKey(view: View?, event: Int, keyEvent: KeyEvent?): Boolean {
       return false
    }
}