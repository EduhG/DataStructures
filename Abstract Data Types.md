
<h3>Abstract Data Types</h3>

<p>An Abstract Data Type is a class of objects whose logical behavior is defined by a set of values and a set of operations</p>

<p>Abstract Data Types are used to separate the notions of specification (what kind of thing we're working with and what operations can be performed on it) and implementation (how the thing and its operations are actually implemented).</p>

<p>An abstract data type is simply a grouping of subprograms and the data that they manipulate (encapsulation) that includes only the data representation of one specific data type and the subprograms that provide the operations for that type</p>

<h3>Classifying Types and Operations</h3>

<p>Types, whether built-in or user-defined, can be classified as mutable or immutable. The objects of a mutable type can be changed: that is, they provide operations which when executed cause the results of other operations on the same object to give different results. So Date is mutable, because you can call setMonth and observe the change with the getMonth operation. But String is immutable, because its operations create new String objects rather than changing existing ones. Sometimes a type will be provided in two forms, a mutable and an immutable form. StringBuilder, for example, is a mutable version of String (although the two are certainly not the same Java type, and are not interchangeable).</p>

<p>The operations of an abstract type are classified as follows:</p>

<ul>
    <li> ** Creators **: Create new objects of the type. A creator may take an object as an argument, but not an object of the type being constructed.</li>
    <li> ** Producers **: Create new objects from old objects of the type. The concat method of String, for example, is a producer: it takes two strings and produces a new one representing their concatenation.</li>
    <li> ** Observers**: They take objects of the abstract type and return objects of a different type. The size method of List, for example, returns an int.</li>
    <li> ** Mutators ** change objects. The add method of List, for example, mutates a list by adding an element to the end.</li>
</ul>

<h3>Abstract Data Type Examples</h3>

<p> ** int ** is Java’s primitive integer type. int is immutable, so it has no mutators.</p>

<p> ** List ** is Java’s list interface. List is mutable. List is also an interface, which means that other classes provide the actual implementation of the data type. These classes include ArrayList and LinkedList.</p>

<p> ** String ** is Java’s string type. String is immutable.</p>


