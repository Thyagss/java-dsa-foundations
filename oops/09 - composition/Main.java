class UnionCabinet {
    
    int year;
    
    UnionCabinet(int year) {
        this.year = year;
    }
    
    void unionBudget() {
        System.out.println("This " + this.year + " will be good financial year");
    }
}

class PrimeMinister {
    
    private UnionCabinet unioncabinet; 

    // Composition 
    PrimeMinister(int cabinetYear) {
        this.unioncabinet = new UnionCabinet(cabinetYear);
    }
    
    void blueSheetApproval() {
        
        unioncabinet.unionBudget();
        
        System.out.println("The proposal align with the ruling party's core manifesto, so i'm approving it");
    }
    
}

public class Main {
    public static void main(String[] args) {
        
        PrimeMinister pm = new PrimeMinister(2026);
        pm.blueSheetApproval();
    }     
}
