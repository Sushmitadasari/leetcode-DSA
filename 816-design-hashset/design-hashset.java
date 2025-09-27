class MyHashSet {
    HashSet<Integer> set1;
    public MyHashSet() {
        set1=new HashSet<>(); 
    }
    
    public void add(int key) {
        set1.add(key);
    }
    
    public void remove(int key) {
       set1.remove(key);
    }
    
    public boolean contains(int key) {
        return set1.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */