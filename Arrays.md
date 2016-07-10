<h3>Java Arrays</h3>

<p>Normally, array is a collection of similar type of elements that have contiguous memory location.</p>

<p>Java array is an object the contains elements of similar data type. It is a data structure where we store similar elements. We can store only fixed set of elements in a java array.</p>

<p>Array in java is index based, first element of the array is stored at 0 index.</p>

<h3>Declaring a Variable to Refer to an Array</h3>

<p>The preceding program declares an array (named anArray) with the following line of code:</p>

```Java
    // declares an array of integers
    int[] anArray;
```

<h3>Creating, Initializing, and Accessing an Array</h3>

<p>One way to create an array is with the new operator and initializing its size with a value in the brackets.</p>

``` Java
    // create an array of integers
    anArray = new int[10];
```

<p>If this statement is missing, then the compiler prints an error "Variable anArray may not have been initialized", and compilation fails.</p>

<p>Values can be assigned to each element in the array by accessing the element and asigning it a value depending on the array type using the assignment operator</p>

``` Java   
    anArray[0] = 100; // initialize first element
    anArray[1] = 200; // initialize second element
    anArray[2] = 300; // and so forth
```

<p>Each array element is accessed by its numerical index:</p>

``` Java
    System.out.println("Element 1 at index 0: " + anArray[0]);
    System.out.println("Element 2 at index 1: " + anArray[1]);
    System.out.println("Element 3 at index 2: " + anArray[2]);
```

<p>Alternatively, you can use the shortcut syntax to create and initialize an array. The length of the array is determined by the number of values provided between braces and separated by commas.</p>

``` Java
    int[] anArray = { 
        100, 200, 300,
        400, 500, 600, 
        700, 800, 900, 1000
    };
```
