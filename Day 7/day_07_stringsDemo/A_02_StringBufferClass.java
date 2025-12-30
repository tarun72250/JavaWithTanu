package day_07_stringsDemo;

public class A_02_StringBufferClass {

	public static void main(String[] args) {

		/*
		StringBuffer class in Java
		StringBuffer is a class in Java that represents a mutable sequence of characters.
        It provides an alternative to the immutable String class, allowing you to modify the contents of a existing 
        string without creating a new object every time.

		Here are some important features and methods of the StringBuffer class:
		The append() method is used to add characters, strings, or other objects to the end of the buffer objects.
		The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer objects.
		The delete() method is used to remove characters from the buffer.
		The reverse() method is used to reverse the order of the characters in the buffer
		*/
        //capacity() method check how many capacity of this String
		StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());//16 character by default u stored 
        sb.append("Hello");
        System.out.println(sb.capacity());//16
        sb.append("shyama shyama");
        System.out.println(sb.capacity());//32   (16*2)+2(old capacity * 2)+2
                                            //(34*2)+2 =70 new capacity 


        //length() find the actual length of the String.
        StringBuffer sb1 = new StringBuffer("Tarun");
        System.out.println(sb1.lenght());//5

        //Ques :- What is difference btw capacity() and length() mehtod

        /*
         Advantages : Mutable:Efficient:Thread-safe:
         */
        // Declaration and Initialization
        StringBuffer sb1 = new StringBuffer(); // default capacity 16
        StringBuffer sb2 = new StringBuffer("Aniket"); // initialized with string

        // append() - Appends the specified string to this character sequence.
        System.out.println("\n------append()-------");
        sb1.append("Hello ");
        sb1.append("World");
        System.out.println("Appended String: " + sb1); // Hello World

        // insert() - Inserts the string at the specified position.
        System.out.println("\n------insert()-------");
        sb2.insert(6, " Sarsiya");
        System.out.println("After insert: " + sb2); // Aniket Sarsiya

        // replace() - Replaces characters between start and end index
        System.out.println("\n------replace()-------");
        sb2.replace(0, 6, "Mr.");
        System.out.println("After replace: " + sb2); // Mr. Sarsiya

        // delete() - Removes the characters between start and end index
        System.out.println("\n------delete()-------");
        sb2.delete(0, 3);
        System.out.println("After delete: " + sb2); // Sarsiya

        // deleteCharAt() - Removes character at given index
        System.out.println("\n------deleteCharAt()-------");
        StringBuffer sb3 = new StringBuffer("Aniket");
        sb3.deleteCharAt(2);
        System.out.println("After deleteCharAt(2): " + sb3); // Anket

        // reverse() - Reverses the current character sequence
        System.out.println("\n------reverse()-------");
        StringBuffer sb4 = new StringBuffer("Learning");
        sb4.reverse();
        System.out.println("Reversed: " + sb4); // gninraeL

        // capacity() - Returns current capacity
        System.out.println("\n------capacity()-------");
        StringBuffer sb5 = new StringBuffer();
        System.out.println("Default Capacity: " + sb5.capacity()); // 16

        // ensureCapacity() - Ensures minimum capacity
        sb5.ensureCapacity(100);
        System.out.println("Ensured Capacity (100): " + sb5.capacity()); // >=100

        // length() - Returns the length (number of characters)
        System.out.println("\n------length()-------");
        StringBuffer sb6 = new StringBuffer("Java Programming");
        System.out.println("Length: " + sb6.length()); // 16

        // charAt() - Returns char at specified index
        System.out.println("\n------charAt()-------");
        System.out.println("Char at 2: " + sb6.charAt(2)); // v

        // setCharAt() - Sets character at given index
        System.out.println("\n------setCharAt()-------");
        sb6.setCharAt(5, '-');
        System.out.println("After setCharAt(5, '-'): " + sb6); // Java-Programming

        // substring() - Extracts a substring (Note: StringBuffer returns String)
        System.out.println("\n------substring()-------");
        String sub = sb6.substring(5, 9);
        System.out.println("Substring from index 5 to 9: " + sub); // -Pro

        // toString() - Converts StringBuffer to String
        System.out.println("\n------toString()-------");
        String str = sb6.toString();
        System.out.println("Converted to String: " + str);

        // Comparison (Note: No equals() override for StringBuffer)
        System.out.println("\n------equals() in StringBuffer-------");
        StringBuffer cmp1 = new StringBuffer("Test");
        StringBuffer cmp2 = new StringBuffer("Test");
        System.out.println("cmp1.equals(cmp2): " + cmp1.equals(cmp2)); // false, reference comparison
        System.out.println("cmp1.toString().equals(cmp2.toString()): " + cmp1.toString().equals(cmp2.toString())); // true    
}

}
