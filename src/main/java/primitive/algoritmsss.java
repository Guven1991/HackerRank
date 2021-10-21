package primitive;

import java.util.ArrayList;
import java.util.List;

public class algoritmsss{
    public static void main(String[] args) {

        List<Integer> numberList = List.of(1,5,234,8,34,5,16,44);

        int maxNumber=0;
        for (int i = 0; i < numberList.size(); i++) {
            if(maxNumber<numberList.get(i))
            maxNumber = numberList.get(i);
        }
        System.out.println(maxNumber);

    }
}
