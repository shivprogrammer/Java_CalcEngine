package com.pluralsight.travel;
public class Flight { ... }

package com.pluralsight.travel;
public class Passenger { ... }

///////////
package com.xyzcompany.bar;
public class Beer { ... }

package com.xyzcompany.bar;
public class Wine { ... }

package com.xyzcompay.bar;
public class Flight { ... }
///////////
import com.pluralsight.travel.*; // map in all the types from the com.pluralsight.travel package
import com.xyzcompany.bar.*;

Flight lax175 = new Flight(175); // the problem with using import on demand, is that now you'll get an error if there is a class from each package that has the same name (both of the packages now have a Flight class in them), single type imports avoid this bug
Beer liteBeer = new Beer();
Passenger jane = new Passenger();
Wine merlot = new Wine();
