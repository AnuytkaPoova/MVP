package com.a_ches.mvp.common

import com.a_ches.mvp.common.UserTable
import com.a_ches.mvp.common.UserTable.COLUMN

object UserTable {
    const val TABLE = "users"
    val CREATE_SCRIPT = String.format(
        "create table %s ("
                + "%s integer primary key autoincrement,"
                + "%s text,"
                + "%s text" + ");",
        TABLE, COLUMN.ID, COLUMN.NAME, COLUMN.EMAIL
    )

    object COLUMN {
        const val ID = "_id"
        const val NAME = "name"
        const val EMAIL = "email"
    }
}