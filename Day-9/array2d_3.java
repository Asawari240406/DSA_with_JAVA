// Spiral Order Traversal of a 2D Array
public class array2d_3
{
    public static void main(String args[]) 
    {
        int matrix[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;  
        int endCol = matrix[0].length - 1; 

        System.out.println("Spiral Order Traversal:");
        
        while(startRow <= endRow && startCol <= endCol) 
        {
           
            for(int j = startCol; j <= endCol; j++) 
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            
            for(int i = startRow + 1; i <= endRow; i++) 
            {
                System.out.print(matrix[i][endCol] + " ");
            }

           
            if(startRow < endRow) 
            {  
                for(int j = endCol - 1; j >= startCol; j--) 
                {  
                    System.out.print(matrix[endRow][j] + " ");
                }
            }

            
            if(startCol < endCol) 
            {  
                for(int i = endRow - 1; i > startRow; i--) 
                {   
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
}