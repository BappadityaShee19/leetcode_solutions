class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res= new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int ptime = 0;
        for(String log:logs){
            String[] parts = log.split(":");
            int fnid = Integer.parseInt(parts[0]);
            String event = parts[1];
            int time = Integer.parseInt(parts[2]);

            if(event.equals("start")){
                if(!stack.isEmpty()){
                    res[stack.peek()]+= time - ptime;
                }
                stack.push(fnid);
                ptime = time;
            }
            else{
                res[stack.pop()]+= time - ptime +1;
                ptime = time +1;
            }

        }
        return res;
    }
}