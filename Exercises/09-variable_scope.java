float students = 30.0;
float rooms = 4.0;

if (rooms > 0.0) {
  System.out.println(students);
  System.out.println(rooms);
  float avg = students / rooms;
  System.out.println(avg); // success
}

System.out.println(avg); // error, avg does not exist outside of the block statement above
