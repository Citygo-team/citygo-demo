package com.eurosportdemo.app.presentation.fragment

import androidx.fragment.app.Fragment
import io.reactivex.disposables.CompositeDisposable

open class BaseFragment: Fragment() {

    protected val bag = CompositeDisposable()

    override fun onDestroy() {
        super.onDestroy()
        bag.clear()
    }
}