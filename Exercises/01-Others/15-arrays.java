float[] theVals = new float[3]; // this is an array of 3 float values
theVals[0] = 10.0f;
theVals[1] = 20.0f;
theVals[2] = 15.0f;

float sum = 0.0f;

for (int i = 0; theVals.length; i++)
  sum += theVals[i];

System.out.println(sum);

// same array initialization as above execept in a far cleaner fashion
float[] theVals = { 10.0f, 20.0f, 15.0f }; // notice that they are CURLY BRACES, not brackets
