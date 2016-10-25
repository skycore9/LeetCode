class Queue {
public:
    // Push element x to the back of queue.
    void push(int x) {
        stackPush.push(x);
    }

    // Removes the element from in front of queue.
    void pop(void) {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.top());
                stackPush.pop();
            }
        }
        stackPop.pop();
    }

    // Get the front element.
    int peek(void) {
        if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.top());
                stackPush.pop();
            }
        }
        return stackPop.top();
    }

    // Return whether the queue is empty.
    bool empty(void) {
        return stackPush.empty() && stackPop.empty();
    }
private:
    stack<int> stackPush;
    stack<int> stackPop;
};