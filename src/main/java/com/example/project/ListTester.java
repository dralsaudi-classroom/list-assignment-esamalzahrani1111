package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        ArrayList temp = new ArrayList(n);  
        list.findFirst();
        for (int i=0; i<n;i++)
        {
        temp.insert(list.retrieve());
        list.remove();
        }
        temp.findFirst();
        while(!(list.last())){
            list.FindNext();
        }
       for (int i=0;i<n;i++){
           list.insert(temp.retrieve());
           temp.findNext();
       }
    }
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
      
        while (!(l1.last())){
            l1.findNext();
        }
        while (!(l1.first())){
            l2.insert(l1.retrieve());
            l1.findPrevious();
        }
        
    }
}
