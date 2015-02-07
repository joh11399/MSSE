package msse



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class AuctionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Auction.list(params), model:[auctionInstanceCount: Auction.count()]
    }

    def show(Auction auctionInstance) {
        respond auctionInstance
    }

    def create() {
        respond new Auction(params)
    }

    @Transactional
    def save(Auction auctionInstance) {
        if (auctionInstance == null) {
            notFound()
            return
        }

        if (auctionInstance.hasErrors()) {
            respond auctionInstance.errors, view:'create'
            return
        }

        auctionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'auction.label', default: 'Auction'), auctionInstance.id])
                redirect auctionInstance
            }
            '*' { respond auctionInstance, [status: CREATED] }
        }
    }

    def edit(Auction auctionInstance) {
        respond auctionInstance
    }

    @Transactional
    def update(Auction auctionInstance) {
        if (auctionInstance == null) {
            notFound()
            return
        }

        if (auctionInstance.hasErrors()) {
            respond auctionInstance.errors, view:'edit'
            return
        }

        auctionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Auction.label', default: 'Auction'), auctionInstance.id])
                redirect auctionInstance
            }
            '*'{ respond auctionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Auction auctionInstance) {

        if (auctionInstance == null) {
            notFound()
            return
        }

        auctionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Auction.label', default: 'Auction'), auctionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'auction.label', default: 'Auction'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
