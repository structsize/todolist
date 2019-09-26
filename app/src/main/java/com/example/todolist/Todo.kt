package com.example.todolist

open class Todo (
    @PrimaryKey var id: Long = 0,
    var title: String = "",
    var date: Long = 0
) : RealmObject(){

}
