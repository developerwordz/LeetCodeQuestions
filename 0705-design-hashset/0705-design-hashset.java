class MyHashSet {
    int bucketcount = 10000;
    List<Integer> buckets[];
    public MyHashSet() {
        buckets = new List[bucketcount];
    }
    public int hash(int key){
        return key%bucketcount;
    }
    
    public void add(int key) {
        int i = hash(key);
        if(buckets[i]==null) buckets[i] = new LinkedList<>();
        if(buckets[i].indexOf(key)==-1){
            buckets[i].add(key);
        }
    }
    
    public void remove(int key) {
        int i = hash(key);
        if(buckets[i]==null) return;
        if(buckets[i].indexOf(key)!=-1){
            buckets[i].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int i = hash(key);
        if(buckets[i]!=null){
            return buckets[i].contains(key);
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */