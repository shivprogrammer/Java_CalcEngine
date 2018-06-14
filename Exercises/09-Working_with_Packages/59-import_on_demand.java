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
import com.pluralsight.travel.*; // map in all the types from the com.pluralsight.travel package
import com.xyzcompany.bar.*;
Flight lax175 = new Flight(175);
Beer liteBeer = new Beer();
Passenger jane = new Passenger();
Wine merlot = new Wine();
