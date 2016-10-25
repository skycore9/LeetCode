class MinStack {
public:
    /** initialize your data structure here. */
    MinStack() {
        
    }
    
    void push(int x) {
        if (stackMin.empty()) {
            stackMin.push(x);
        } else if (x <= stackMin.top()) {
            stackMin.push(x);
        }
        
        stackData.push(x);
    }
    
    void pop() {
        int value = stackData.top();
        stackData.pop();
        if (value == stackMin.top()) {
            stackMin.pop();
        }
    }
    
    int top() {
        return stackData.top();
    }
    
    int getMin() {
        return stackMin.top();
    }
    
private:
    stack<int> stackData;
    stack<int> stackMin;
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */