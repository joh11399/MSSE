package msse

class User {
    String username
    String email
    String password
    String fullName
    String addressStreet
    String addressCity
    String addressState
    String addressZip
    String toString(){
        "${fullName} (${username})"
    }

    static constraints = {
        username(blank: false, unique: true)
        fullName()
        password(password: true)
        addressState(inList:["AL",	"AK",	"AZ",	"AR",	"CA",	"CO",	"CT",	"DE",	"FL",	"GA",	"HI",
                             "ID",	"IL",	"IN",	"IA",	"KS",	"KY",	"LA",	"ME",	"MD",	"MA",	"MI",
                             "MN",	"MS",	"MO",	"MT",	"NE",	"NV",	"NH",	"NJ",	"NM",	"NY",	"NC",
                             "ND",	"OH",	"OK",	"OR",	"PA",	"RI",	"SC",	"SD",	"TN",	"TX",	"UT",
                             "VT",	"VA",	"WA",	"WV",	"WI",	"WY" ])
    }
}
