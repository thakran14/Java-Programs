class ParkingSystem {
    
    public int bigspace;
    
    public int medspace;
    
    public int smallspace;

    public ParkingSystem(int big, int medium, int small) {
        
        bigspace = big;
            medspace = medium; 
            smallspace =small;
        
    }
    
    public boolean addCar(int carType) {
        
        if (carType==0 || carType>3)
            return false;
        
        if(carType==1 && bigspace>0)
        {
            --bigspace;
            return true;
            
        }
        
        
         else if(carType==2 && medspace >0 )
        {
            --medspace;
            return true;
            
        }
        
        else if(carType==3 && smallspace>0)
        {
            --smallspace;
            return true;
            
        }
        else return false;
        
          }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */