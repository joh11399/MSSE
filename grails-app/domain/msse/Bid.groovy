package msse

class Bid {
    String id
    Auction auction
    User bidder
    String amount
    Date bidDate



    //static belongsTo = [users: User, auctions: Auction]

    static constraints = {
        id(blank: false, unique: true)

    }
}
