package msse

class Bid {
    String id
    Auction auction
    User bidder
    String amount
    Date bidDate
    String toString(){
        "${bidder} (${amount})"
    }

    static constraints = {
        id(blank: false, unique: true)
        auction()
        bidder()
        amount()
        bidDate()
    }
}
