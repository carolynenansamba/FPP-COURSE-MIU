//package DATASTRUCTURES;
//
//import java.util.Iterator;
//import java.util.LinkedList;
//
//public class MyHashtable{
//    private int numberOfElements;
//    private static int INNITIAL_SIZE = 19;
//    private int tablesize;
////    to avoid collision with same index,every index is implemented with linkedList
//    private LinkedList[] table;
//
////    public MyHashtable(){
////        this[INNITIAL_SIZE];
////    }
//    public MyHashtable(int tablesize){
//        this.tablesize = tablesize;
//        table = new LinkedList[tablesize];
//        numberOfElements = 0;
//    }
//    public void put(Object key,Object value){//not allow null keys
//        if(key== null)return;
//        //get the big integer corresponding to the subject
//        //assumes key is not null
//        int hashcode = key.hashCode();
//        //compress down to a table slot
//        int hashValue = hash(hashcode);
//        //create the array
//        Entry e = new Entry(key,value);
//        boolean keyAlreadyInUse = false;
//        if(table[hashValue]!=null){
//            for(Object ob :table[hashValue]){
//                Entry ent = Entry(ob);
//                if(ent.key.equals(key)){
//                    keyAlreadyInUse = true;
//                    ent.value = value;//update value for this entry
//                    return;
//                }
//            }
//        }
//        if(!keyAlreadyInUse){//now place it in the table
//            if(table[hashValue]== null){
//                table[hashValue] = new LinkedList();
//            }
//            table[hashValue].add(e);
//            numberOfElements++;
//
//        }
//
//    }
//
//    public Object get(Object key){//null key not allowed
//        if(key==null)return null;//get the big integer corresponding to the object
//        int hashcode = key.hashCode();//compress down to the table slot
//        int hashValue = hash(hashcode);
//        //if slot given by hash not yet in use,return null
//        if(table[hashValue]== null)return null;
//        //now look for the desired entry,each index is a linked list
//        //so iterator is used to retrieve the correct match
//        Entry e = null;
//        for(Iterator it = table[hashValue].iterator();it.hasNext();){
//            e = (Entry)it.next();
//            if(e.key.equals(key)){
//                return e.value;
//            }
//        }
//        return null;
//    }
//
//    public String toString(){
//        String n = System.getProperty("line.separator");
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0;i<table.length;++i){
//            if(table[i]!=null){
//                sb.append("Index[" + i + "]" + " ");
//                Entry next = null;
//                for(Iterator it = table[i].iterator();it.hasNext();){
//                    next = (Entry)it.next();
//                    if(next.value!=null)
//                        sb.append(next + n);
//                }
//            }
//        }
//
//        return sb.toString();
//    }
//    private int hash(int bigNum){
//        bigNum = Math.abs(bigNum);
//        return bigNum%tablesize;
//    }
//    private int size(){
//        return numberOfElements;
//    }
//    public boolean isEmpty(){
//        if(numberOfElements==0)return true;
//        else return false;
//    }
//
//    private class Entry{
//        private Object key;
//        private Object value;
//        Entry(Object key,Object value){
//            this.key = key;
//            this.value = value;
//
//        }
//        public String toString(){
//            return key.toString() + "->" + value.toString();
//        }
//    }
//}
