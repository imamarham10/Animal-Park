package com.example.biologicalpark

class Animal {
    var name:String?=null
    var des:String?=null
    var image:Int?=null
    var infor:String?=null
    constructor(name:String, des:String, image: Int,infor:String)
    {
        this.name = name
        this.des = des
        this.image = image
        this.infor = infor
    }
}