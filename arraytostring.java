1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
import java.util.stream.Collectors;
 
/*
 * A Java program to convert an array to string.
 */
 
public class ArrayToString {
 
    public static void main(String[] args) {
 
        String[] stringArray = { "My", "name", "is", "Gaurav", "!" };
 
        // 1. Using the Arrays.toString() method
        String string1 = convertArrayToStringUsingToString(stringArray);
        System.out.println("An array converted to string using Arrays.toString(): " + string1);
 
        // 2. Using the StringBuilder.append() method
        String string2 = convertArrayToStringUsingAppend(stringArray);
        System.out.println("An array converted to string using StringBuilder.append(): " + string2);
 
        // 3. Using the String.join() method
        String string3 = convertArrayToStringUsingJoin(stringArray);
        System.out.println("An array converted to string using String.join(): " + string3);
 
        // 4. Using the Collectors.joining() method
        String string4 = convertArrayToStringUsingJoining(stringArray);
        System.out.println("An array converted to string using Collectors.joining(): " + string4);
 
    }
 
    // 1. Using the Arrays.toString() method
    public static String convertArrayToStringUsingToString(String[] stringArray) {
        return Arrays.toString(stringArray);
    }
 
    // 2. Using the StringBuilder.append() method
    public static String convertArrayToStringUsingAppend(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
 
        for (int i = 0; i < stringArray.length; i++) {
            stringBuilder.append(stringArray[i]);
        }
        return stringBuilder.toString();
    }
 
    // 3. Using the String.join() method
    public static String convertArrayToStringUsingJoin(String[] stringArray) {
        String str = String.join(" ", stringArray);
        return str;
    }
 
    // 4. Using the Collectors.joining() method
    public static String convertArrayToStringUsingJoining(String[] stringArray) {
        String str = Arrays.stream(stringArray).collect(Collectors.joining());
        return str;
    }
 
}
