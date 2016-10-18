package com.olavgg

class Book {
    String title

    static constraints = {
    }
    
    static mapping = {
        version false
        id generator:'sequence', params:[sequence:'book_seq']

        id index:'book_id_idx'
    }
}
