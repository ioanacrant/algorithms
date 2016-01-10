class Entry{
    int key;
    float value;
    Entry next;
    Entry(int k, float v){
        key=k;
        value=v;
        next=null;
    }
}
class HashTable{
    private float load;
    private Entry[] table;
    private int size;

    public HashTable(){
        table = new Entry[128];
        for (int i=0;i<128;i++){
            table[i]=null;
        }
        load=0.75;
        size=0;
    }
    public void add(int key, float value){
        if (size>load*table.length){
            resize();
        }
        int index = key % table.length;
        if (table[index]==null){
            table[index]=new Entry(key, value);
        }
        else{
            Entry e = table[index];
            while (e!=null){
                if (e.key==key){
                    e.value=value;
                    break;
                }
                e=e.next;
            }
            e.next=new Entry(key,value);
        }
        size++;
    }
    public float get(int key){
        int index = key%table.length;

        Entry e = table[index];
        while (e!=null){
            if (e.key==key){
                return e.value;
            }
            e=e.next;
        }
        return -1;
    }
    public void remove(int key){
    //...
    }
    public void resize(){
        //make new and copy
    }
}
