class MyStack {
    private Deque<Integer> stack;

    public MyStack() {
        this.stack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.stack.addFirst(x);
    }
    
    public int pop() {
        return this.stack.removeFirst();
    }
    
    public int top() {
        return this.stack.peekFirst();
    }
    
    public boolean empty() {
        return this.stack.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */