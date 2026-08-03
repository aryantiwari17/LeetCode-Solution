class MinStack {
    Stack<Integer> st ; 
    Stack<Integer> hst;

    public MinStack() {
        st = new Stack<>(); 
        hst = new Stack<>();
        
    }
    
    public void push(int value) {
        st.push(value); 
        if(hst.isEmpty() || value <= hst.peek()) hst.push(value);
        
    }
    
    public void pop() {
        if(st.isEmpty()) return;   // not writing -1 because void 

        int temp = st.pop(); 
        if(temp == hst.peek()) hst.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1; 
        return st.peek();

    }
    
    public int getMin() {
        if(hst.isEmpty()) return -1; 
        return hst.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */