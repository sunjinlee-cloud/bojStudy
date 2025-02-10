package prgmmrs;

import java.util.*;

//망할놈아
//로직을 아예 다시짜야함. 아직 다 못풀었음


public class DoingAssignment {
    public static void main(String[] args) {
        String [][] plans = {{"UmmLang", "11:00", "10"}, {"MSA", "11:08", "1"}, {"Redis", "11:10", "1"}, {"Kafka", "11:12", "1"}};


        for(int i = 0; i< plans.length; i++) {
            String [] temp = plans[i][1].split(":");
            int startTime = Integer.parseInt(temp[0])*60 + Integer.parseInt(temp[1]);
            int endTime = startTime + Integer.parseInt(plans[i][2]);
            plans[i][1] = String.valueOf(startTime);
            plans[i][2] = String.valueOf(endTime);
        }

        Arrays.sort(plans, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]);
            }
        });

        int now = 0;
        Stack<String> stack = new Stack<>();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();


        for(int i = 0; i<plans.length; i++) {
            if(i == plans.length-1) {
                ans.add(plans[plans.length-1][0]);
            } else {
                now = Integer.parseInt(plans[i+1][1]);
                if (now == Integer.parseInt(plans[i][2])) { //이전과제 끝시간 = 다음과제 시작시간인 경우
                    ans.add(plans[i][0]);
                } else if (now < Integer.parseInt(plans[i][2])) { //이전과제 끝시간이 다음과제 시작시간보다 늦는경우
                    stack.push(plans[i][0]);
                    map.put(plans[i][0], Integer.parseInt(plans[i][2]) - now);
                } else {  //이전과제 끝내고 다음과제까지 시간이 남는 경우
                    ans.add(plans[i][0]);
                    int temp = now - Integer.parseInt(plans[i][2]); //남은시간을 temp 로 명명
                    if (stack.empty()) continue; //스택에 미룬과제가 없는 경우
                    else if (temp >= map.get(stack.peek())) { //스택에 과제가 있고, 남는시간(temp)이 미룬과제 처리시간보다 긴경우
                        while(!stack.empty() && temp>=map.get(stack.peek())) {
                            temp -= map.get(stack.peek());
                                ans.add(stack.pop());
                        }
                    } else { //스택에 미룬과제가 있고, 남는시간(temp)이 미룬과제 처리시간보다 부족한 경우
                        int a = map.get(stack.peek()) - temp;
                        map.put(stack.peek(), a);
                    }
                }
            } 

        }

        while(!stack.empty()) {
            ans.add(stack.pop());
        }
        String[] answer = ans.toArray(new String[ans.size()]);
        System.out.println(Arrays.toString(answer));
    }
}

//5번, 10번테스트케이스 안된 풀이 - 이거 안되어서 now 도입함 - 여기서 어디가 문젠지 모르겠음, 게시판 반례 다맞음
//if (Integer.parseInt(plans[i][2]) == Integer.parseInt(plans[i+1][1])) {
//                ans.add(plans[i][0]);
//            } else if(Integer.parseInt(plans[i][2]) > Integer.parseInt(plans[i+1][1])) {
//                stack.add(plans[i][0]);
//                map.put(plans[i][0], Integer.parseInt(plans[i][2]) - Integer.parseInt(plans[i+1][1]));
//            } else {
//                ans.add(plans[i][0]);
//                if (stack.empty()) continue;
//                else {
//                    if(Integer.parseInt(plans[i+1][1]) - Integer.parseInt(plans[i][2]) >= map.get(stack.peek())) {
//                        int temp = Integer.parseInt(plans[i+1][1]) - Integer.parseInt(plans[i][2]);
//                        while(!stack.empty() && temp>=map.get(stack.peek())) {
//                            temp -= map.get(stack.peek());
//                            ans.add(stack.pop());
//                        }
//                    } else {
//                        int temp = map.get(stack.peek());
//                        int minus = Integer.parseInt(plans[i+1][1]) - Integer.parseInt(plans[i][2]);
//                        map.put(stack.peek(), temp - minus);
//                    }
//                }
//            }