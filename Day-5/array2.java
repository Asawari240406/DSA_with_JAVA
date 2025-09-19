public class array2
{
    public static void main(String[] args) 
    {
        int bitSet = 0;

       
        bitSet |= (1 << 2); 
        bitSet |= (1 << 5); 
        bitSet |= (1 << 7); 

        
        System.out.println("Contains 5? " + ((bitSet & (1 << 5)) != 0));
        System.out.println("Contains 3? " + ((bitSet & (1 << 3)) != 0));

        
        bitSet &= ~(1 << 5); 
        System.out.println("Contains 5 after removal? " + ((bitSet & (1 << 5)) != 0));

        
        System.out.print("Present elements: ");
        for (int i = 0; i < 32; i++) 
        {
            if ((bitSet & (1 << i)) != 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}