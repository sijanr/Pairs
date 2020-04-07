class Book (val title: String, val author: String, val year: Int) {

    /**
     * Get the book's title and author as a Pair
     * **/
    fun getTitleAuthor(): Pair<String,String> {
        return this.title to this.author
    }


    /**
     * Gte the book's title, author and year as a triple
     * **/
    fun getTitleAuthorYear(): Triple<String,String,Int> {
        return Triple(this.title,this.author,this.year)
    }
}