class MyHashSet {
    int bucket = 10000;
    List<Integer>[] buckets ;
    public MyHashSet() {
        this.buckets = new LinkedList[bucket];
    }
    public int Hashing(int key){
        return key%bucket;
    }
    public void add(int key) {
        int i = Hashing(key);
        if(buckets[i]==null) buckets[i] = new LinkedList<>();
        if(buckets[i]==null||buckets[i].indexOf(key)==-1){
            buckets[i].add(key);
        }
    }
    
    public void remove(int key) {
        int i = Hashing(key);
        if(buckets[i]==null)return;
        if(buckets[i].indexOf(key)!=-1){
            buckets[i].remove(Integer.valueOf(key));
        }
    }
    
    public boolean contains(int key) {
        int i = Hashing(key);
        if(buckets[i]==null) return false;
        if(buckets[i].indexOf(key)!=-1){
            return true;
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