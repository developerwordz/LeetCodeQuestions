class MyHashSet {
    int numBuckets = 15000;
    List<Integer>[] buckets;
    public MyHashSet() {
        buckets = new LinkedList[numBuckets];
    }
    private int Hashed(int key){
        return key%10000;
    }
    public void add(int key) {
        int i = Hashed(key);
        if(buckets[i] == null) buckets[i]=new LinkedList<>();
        if(buckets[i].indexOf(key)==-1) buckets[i].add(key);
    }
    
    public void remove(int key) {
    int i = Hashed(key);

    if (buckets[i] == null) {
        return;
    }

    int index = buckets[i].indexOf(key);

    if (index != -1) {
        buckets[i].remove(index);
    }
}

    
    public boolean contains(int key) {
        int i = Hashed(key);
        if(buckets[i]!=null&&buckets[i].indexOf(key)!=-1){
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