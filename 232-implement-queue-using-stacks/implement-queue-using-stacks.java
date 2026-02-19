class MyQueue {
    List<Integer> lst;
    public MyQueue() {
        lst=new ArrayList<>();
    }
    
    public void push(int x) {
        lst.add(x);
    }
    
    public int pop() {
        return lst.remove(0);
    }
    
    public int peek() {
        return lst.get(0);
    }
    
    public boolean empty() {
        return lst.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */