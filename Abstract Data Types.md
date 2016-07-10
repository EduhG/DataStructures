
<h3>Abstract Data Types</h3>

<p>An Abstract Data Type is a class of objects whose logical behavior is defined by a set of values and a set of operations</p>

<p>An abstract data type is simply a grouping of subprograms and the data that they manipulate (encapsulation) that includes only the data representation of one specific data type and the subprograms that provide the operations for that type</p>

<h3>Classifying Types and Operations</h3>

<p>Types, whether built-in or user-defined, can be classified as mutable or immutable. The objects of a mutable type can be changed: that is, they provide operations which when executed cause the results of other operations on the same object to give different results. So Date is mutable, because you can call setMonth and observe the change with the getMonth operation. But String is immutable, because its operations create new String objects rather than changing existing ones. Sometimes a type will be provided in two forms, a mutable and an immutable form. StringBuilder, for example, is a mutable version of String (although the two are certainly not the same Java type, and are not interchangeable).</p>