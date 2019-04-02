/*
    * Implementaiton of an Ordered list using an array
*/

public class OrderedList_inArraySlots{
    private List_inArraySlots list; 
    
    public OrderedList_inArraySlots() { 
        list = new List_inArraySlots(); 
    }
    
    // returns the size
    public int size() { 
        return list.size(); 
    }
    
    // returns the String representation
    public String toString() { 
        return list.toString(); 
    }
    
    // add a value
    public boolean add(int value) {
        int correctIndex = sort(value,0, list.size());
        list.add(correctIndex, value);
        return true;
    }
    
    //sort using recursion, linear
    private int sort(int value, int firstIndex, int lastIndex) {
        if (firstIndex == lastIndex) { 
            return firstIndex;
        }
        if (value < list.get(firstIndex)) {
            return firstIndex;
        }
        else {
            return sort(value, firstIndex+1, lastIndex)
        };
    }    
    
    public int get(int index) { 
        return list.get(index); 
    }
    
    public int remove(int index) {
     return list.remove(index); 
 }
}