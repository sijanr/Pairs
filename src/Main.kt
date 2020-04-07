fun main() {

    val book: Book = Book("Middlegame","Seanan McGuire", 2020)
    val(_,_,year) = book.getTitleAuthorYear()
    println("Here is your book ${book.getTitleAuthor().first} written by" +
            " ${book.getTitleAuthor().second} in $year")

}