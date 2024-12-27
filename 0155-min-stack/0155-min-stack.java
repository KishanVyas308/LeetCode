class MinStack {

    List<Integer> li = new ArrayList<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        li.add(val);
    }
    
    public void pop() {
        li.remove(li.size()-1);
    }
    
    public int top() {
        return li.get(li.size()-1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<li.size() ; i++) {
            if(min > li.get(i)) {
                min = li.get(i);
            }
        }
         return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */