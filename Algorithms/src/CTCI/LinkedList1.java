package CTCI;

import sun.awt.image.ImageWatched;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList();
        int[] arr = {0, 2, 5, 6, 8, 0, 2, 9, 5};
        System.out.println(populateLinkedList(arr,ll));


    }

    private static LinkedList populateLinkedList(int[] arr , LinkedList ll){
        for(int i =0; i< arr.length; i++){
            ll.add(arr[i]);
        } return ll;
    }

    private static void removeDups(LinkedList linkedList){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i< linkedList.size(); i++){
            if(hs.contains(linkedList.get(i))){
                linkedList.remove(i);
            } else {
                hs.add((Integer) linkedList.get(i));
            }
        }
        Object[] newarr = hs.toArray();

        for(int i=0; i< hs.size(); i++){
            System.out.print(newarr[i]);
        }
    }

    private static int returnKth(LinkedList linkedList, int k){ return (int)linkedList.get(k); }

}
