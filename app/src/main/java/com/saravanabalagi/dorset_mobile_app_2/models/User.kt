package com.saravanabalagi.dorset_mobile_app_2.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(val uid: Int, val uname: String?) {
    @PrimaryKey
    var id: Int = uid
    var name: String? = uname

    override fun toString(): String {
        return "$name ($id)"
    }
}