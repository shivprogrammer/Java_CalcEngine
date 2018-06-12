void swap(int i, int j) {
  int k = i; // k obviously gets the value for i
  i = j;
  j = k;
  // print i & j
} // NOTE all of the changes that are happening to the values are only occuring to the copies, NOT the original values

int val = 10;
int val2 = 20;

swap(val1, val2); // when you call this, memory for the parameter i is allocated, and the value of val1 is copied down into that memory for i. Same thing for j, the value for val2 gets copied down into the memory allocated for j
