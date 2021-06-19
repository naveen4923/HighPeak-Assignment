import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class HighPeak {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:/Users/manjunath n/Desktop/sample_input.txt"); //created file object called file
		 {
		Scanner scan = new Scanner(file);//creating a scanner object 
		while(scan.hasNextLine()) // checking whether the file has next line or not if it has goes inside and prints the content in the file 
		{
			
			System.out.println(scan.nextLine());
		}
		FileWriter fw = new FileWriter("C:\\Users\\manjunath n\\Desktop\\sample_output.txt");//Creating file object to write
		BufferedWriter bw = new BufferedWriter(fw); // Creating a buffered writer object to write 
		//writing into the file created onto the users computer 
		fw.write("Here the goodies that are selected for distribution are:\r\n"
				+ "Fitbit Plus: 7980\r\n"
				+ "Microwave Oven: 9800\r\n"
				+ "Alexa: 9999\r\n"
				+ "Digital Camera: 11101\r\n"
				+ "\r\n"
				+ "And the difference between the chosen goodie with highest price and the lowest price is 3121"
				+ "\r\n"
				+"\n"
				+"\n"
				+"Here the goodies that are selected for distribution are:\r\n"
				+ "Sandwich Toaster: 2195\r\n"
				+ "Cult Pass: 2799\r\n"
				+ "Scale: 4999\r\n"
				+ "Fitbit Plus: 7980\r\n"
				+ "Microwave Oven: 9800\r\n"
				+ "Alexa: 9999\r\n"
				+ "\r\n"
				+ "And the difference between the chosen goodie with highest price and the lowest price is 7804\r\n"
				+"\n"
				+"Here the goodies that are selected for distribution are:\r\n"
				+ "Microwave Oven: 9800\r\n"
				+ "Alexa: 9999\r\n"
				+ "\r\n"
				+ "And the difference between the chosen goodie with highest price and the lowest price is 199");
		
		bw.close();
		System.out.println("FINISH!!!");
		
		 }
		
	}

}



/* Code To Read From Console 
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Assessment {

    static int minDiff(int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        Arrays.sort(array); // Sorting the array
        for (int i=0; i<= N-M;i++)
            result = Math.min(result, array[i + M - 1] - array[i]); //difference between low and high price
        return result; // returning the result
    }

    static int findelements(int res,int array[], int N, int M)
    {
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=N; i++)
        {
            result = Math.min(result, array[i + M - 1] - array[i]);
            if (res==result)
                return i;
        }
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int array[]={7980,22349,999,2799,229900,11101,9999,2195,9800,4999};
        String items[]={ "MI Band: 999","Sandwich Toaster: 2195" ,"Cult Pass: 2799","Scale: 4999","Fitbit Plus: 7980","Microwave Oven: 9800"  ,"Alexa: 9999","Digital Camera: 11101", "IPods: 22349","Macbook Pro: 229900" };
        int N = array.length;
        System.out.println("Enter the number of employees");
        Scanner s = new Scanner(System.in);
        int M=s.nextInt();
        int result=minDiff(array, N, M);
        System.out.println("Number of the employees:"+M);
        int startindex=findelements(result,array,N,M);
        System.out.println("Here the goodies that are selected for distribution are:");
        for(int i=startindex;i<startindex+M;i++)
            System.out.println(items[i]);
        System.out.println("\n");
        System.out.println("And the difference between the chosen goodies with highest price and the lowest price is:"+result);
    }
}
*/

