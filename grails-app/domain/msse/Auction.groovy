package msse

class Auction {
    String id
    User owner
    String name
    String description
    Date begDate
    Date endDate
    String minAmount
    String buyAmount
    String toString(){
        "${name}"
    }
    static constraints = {
        id(blank: false, unique: true)
        owner()
        name()
        description()
        begDate(min: new Date())
        endDate()
        minAmount()
        buyAmount()
    }
}
