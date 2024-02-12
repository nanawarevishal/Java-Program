package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class VirtualMemory{

    int pcNo;

    int totalMemory;

    int availableMemory;

    int usedMemory;

    VirtualMemory(int pcNo,int totalMemory,int availableMemory, int usedMemory){
        this.pcNo = pcNo;
        this.totalMemory = totalMemory;
        this.availableMemory = availableMemory;
        this.usedMemory = usedMemory;
    }

    public String toString(){
        return "{TotalMemory : "+this.totalMemory+" , UsedMemory: "+this.usedMemory+" , AvailableMemory: "+this.availableMemory+" }\n";
    }
}

class Disk{

    List<VirtualMemory>disk = new ArrayList<>();

    void addMemory(){
        
    }

}

class sortByAvailbaleMemory implements Comparator<VirtualMemory>{

    @Override
    public int compare(VirtualMemory o1, VirtualMemory o2) {
        return -(o1.availableMemory - o2.availableMemory);
    }
    
}

class ClientMemory{

    public static void main(String[] args) {
        
        // List<VirtualMemory>ls = new ArrayList<>();

        // ls.add(new VirtualMemory(10, 3, 10-3));
        // ls.add(new VirtualMemory(20, 3, 20-3));
        // ls.add(new VirtualMemory(15, 7, 15-7));

        // Collections.sort(ls,new sortByAvailbaleMemory());

        // System.out.println(ls);

        // VirtualMemory vm = ls.get(0);

        // System.out.println(vm);

        List<Disk>ls = new ArrayList<>();

        ls.add(new Disk(new VirtualMemory(10, 3, 10-3)));
        ls.add(new Disk(new VirtualMemory(20, 3, 20-3)));
        ls.add(new Disk(new VirtualMemory(15, 7, 15-7)));

        System.out.println(ls);
    }
}