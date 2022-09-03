package Arrays;

import java.util.Arrays;
import static Arrays.reverseArray.*;
public class A15_arrayArrange {

public static void main(String[] args) {
    String names[]={"54", "546", "548", "60"};
    Arrays.sort(names);
    reverse(names,0,names.length-1);
    //System.out.println(Arrays.toString(name));

    for (int i = 0; i < names.length; i++) {
        System.out.print(names[i]);
    }
}
}
