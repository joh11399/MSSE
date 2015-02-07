import msse.Auction
import msse.Bid
import msse.User

class BootStrap {

    def init = { servletContext ->
        environments{
            development {

                def u1 = new User(username: 'joh11399', password: 'P@$sW*rD', email: 'd', fullName: 'Dan Johnson', addressStreet: 'd', addressCity: 'd', addressState: 'MN', addressZip: 'd').save(failOnError: true)
                def u2 = new User(username: 'haj11399', password: 'P@$sW*rD', email: 'd', fullName: 'Heather Johnson', addressStreet: 'd', addressCity: 'd', addressState: 'MN', addressZip: 'd').save(failOnError: true)

                def a1 = new Auction(id: 'auct-1', name:'first', description: 'first auction', begDate: Date.parse('MM/dd/yyyy', '03/01/2015'), endDate: Date.parse('MM/dd/yyyy', '03/01/2015'), minAmount: '10', buyAmount: '100', owner: u1).save(failOnError: true)

                new Bid(id: 'testBid1', auction: a1, bidder: u1, amount: '20', bidDate: Date.parse('MM/dd/yyyy', '03/01/2015')).save(failOnError: true)
/*
                a1.addToBids(b1)
                u1.addToBids(b1)
*/



                if (!User.count()) {


                    //new User(username: 'Haj', password: 'ppppP@$sW*rD', fullName: 'Heather Johnson', email: 'd', addressStreet: 'd', addressCity: 'd', addressState: 'MN', addressZip: 'd').save(failOnError: true)

                    /*
                    [
                            'Dan Johnson': ['Blue Monday', 'Temptation', 'True Faith'],
                            'Heather Johnson': ['One More Time', 'Lucky', 'Around the World']
                    ].each { def name, def tracks ->
                        def user = new User(name: name)
                        user.save(failOnError: true)
                        tracks.each { def track ->
                            new Song(artist: artist, title: track).save(failOnError: true)
                        }
                        log.info("Saved artist ${artist.name} (${artist.id})")
                    }
                    */
                }

                if (!Auction.count()) {

/*
                    println('added auction test1')
                    new Auction(id: 'test2', description: 'here, two..', endDate: Date.parse('MM/dd/yyyy', '04/01/2015'), user: User.findByUsername('Haj'), billingType: 'Hourly').save(failOnError: true)
                    println('added auction test2')
                    new Auction(id: 'test3', description: 'ok, hereTHREE', endDate: Date.parse('MM/dd/yyyy', '05/01/2015'), user: User.findByUsername('joh11399'), billingType: 'Hourly').save(failOnError: true)
                    println('added auction test3')*/
                }

                if (!Bid.count()) {
                }
            }

            test{

            }
        }
    }
    def destroy = {
    }
}
