StringBuilder sb = new StringBuilder(40);
sb.capacity(); //returns 40

Flight myFlight = new Flight(175);
String location = "Florida";

sb.append("I flew to ");
sb.append(location);
sb.append(" on ");
sb.append(myFlight);

// sb would return "I flew to Florida on Flight #175", but remember that a StringBuilder IS NOT a String

int time = 9;
int pos = sb.length() - " on ".length() - myFlight.toString().length();

sb.insert(pos, " at ");
sb.insert(pos + 4, time);

String message = sb.toString(); // returns "I flew to Florida at 9 on Flight #175"
