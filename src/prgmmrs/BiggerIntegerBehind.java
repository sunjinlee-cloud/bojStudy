package prgmmrs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BiggerIntegerBehind {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};

        List<Integer> ans = new LinkedList<>();
        List<AA> list = new ArrayList<>();
        int target = 1000001;
        list.add(new AA(1000001, 1000001));

        //for문으로 number를 읽되
        for(int i = 0; i< numbers.length-1; i++) {
            if (target < numbers[i]) { //numbers[i]가 타겟보다 크면 리스트에 숫자가 있다는 뜻이므로
                //리스트를 돌면서 numbers[i] 보다 작은 수의 인덱스를 찾아 ans의 해당인덱스에
                //numbers[i] 넣기
                int temp = target;
                while(temp<numbers[i]) {
                    
                    temp++;
                }
            }
            //인덱스 다음의 수가 인덱스 수보다 크면 바로 링크드리스트에 넣음
            if (numbers[i]<numbers[i+1]) {
                ans.add(i+1);
            } else { //인덱스 다음의 수가 인덱스 수보다 작으면 numbers[i]를 먼저 target과 비교하고
                if (target > numbers[i]) { //target이 인덱스 수보다 크면
                //어레이리스트 돌면서 numbers[i]보다 작은값을 찾아서 해당값의 인덱스필드를 보고
                //ans의 인덱스에 numbers[i] 의 값을 넣기
                    target = numbers[i];
                }
                list.add(new AA(numbers[i], i));
                list.sort(new Comparator<AA>() {
                    @Override
                    public int compare(AA o1, AA o2) {
                        return o1.num - o2.num;
                    }
                });
            }
        }
        ans.add(-1);

        int [] answer = new int[ans.size()];
        for(int i = 0; i< ans.size(); i++) {
            answer[i] = ans.get(i);
        }

    }
}

class AA {
    public int num;
    public int index;

    AA(int num, int index) {
        this.num = num;
        this.index = index;
    }
}


//(인덱스 수, 인덱스)를 어레이리스트에 넣음
//target이 어레이리스트에 넣은 인덱스 수보다 크면 target을 인덱스 수로 바꿈
//(target을 어레이리스트에서 가장 작은 수로 유지)