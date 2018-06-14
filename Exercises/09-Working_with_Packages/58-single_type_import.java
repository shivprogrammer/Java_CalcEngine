package com.pluralsight.travel;
public class Flight { ... }

package com.pluralsight.travel;
public class Passenger { ... }

///////////
package com.xyzcompany.bar;
public class Beer { ... }

package com.xyzcompany.bar;
public class Wine { ... }

///////////
import com.pluralsight.travel.Flight; // this tells the compiler that whenever we use the class Flight, what we're really referring to is the fully qualified class com.pluralsight.travel.Flight
import com.xyzcompany.bar.Beer;
import com.pluralsight.travel.Passenger;
import com.xyzcompany.bar.wine;

Flight lax175 = new Flight(175);
Beer liteBeer = new Beer();
Passenger jane = new Passenger();
Wine merlot = new Wine();
