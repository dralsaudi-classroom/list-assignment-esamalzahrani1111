package com.example.project;

public class ListTester {
    public static <T> void circularLeftShift(List <T> list, int n)
    {
        DLL <T> temp = new DLL();;
        list.findFirst();
        for (int i=0;i<n;i++){
            temp.insert(list.retrieve());
            while ( !( list.last() ) ){
                list.findNext();
            }
            
            list.insert(temp.retrieve());
            temp.remove();
            list.findFirst();
            list.remove();
        }
     //   DLL <T>temp = new DLL();  
       // list.findFirst();
        
     //   for (int i=0; i<n;i++) //saving the first n elements if n>list then loop from head
       // {
    //    temp.insert(list.retrieve());
    //    if (!list.last())
      //      list.findNext();
        //    else 
        //    list.findFirst();
     //   }

        
     //   temp.findFirst();
     //   list.findFirst();
        
      //  for int (i=0 ; i<n;i++)
       //     list.remove();
        
     //   while(!(list.last())){
       //     list.findNext();
       // }
     // for (int i=0;i<n;i++){
       //   list.insert(temp.retrieve());
       //   temp.findNext();
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
        if (!(l1.empty()))
        l2.insert(l1.retrieve());
    }
}
