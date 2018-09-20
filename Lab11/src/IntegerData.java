public class IntegerData{

	//Two fields or instance variables. 
	private int[] arr;
	private int iNumElements; 	//# of elements in the array, not the size of the array.

	//Constructor. Initializes both instance variables. Does not
	// create a new array.
	public IntegerData(int[] array, int iNumElementsLoc) 
	{
		arr = array;
		iNumElements = iNumElementsLoc;
	}

	// Displays the ith element
	public void DisplayAt(int i)
	{
		System.out.printf("Value at index %d is: %d\n", i, arr[i]);
	}

	// Display all elements in the array that have a value
	public void DisplayAll()
	{
		for(int i = 0; i < iNumElements; i++)
		{
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

	// Key - value to search in the array
	// return value - index where key was found
	public int Find(int key)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(key == arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	// insert an element in the array.
	public void Insert(int n)
	{
		arr[iNumElements] = n;
		iNumElements++;
	}

	
	// delete 'key' from the array. 
	// which means that you must move up rest of the elements.
	public void Delete(int key)
	{
		int loc = Find(key);
		if(loc > -1)
		{
			for(int i = loc; i < iNumElements; i++)
			{
				arr[i] = arr[i+1];
			}
			iNumElements--;
		}
	}


	// sort the array using bubble sort
	public void BubbleSort() {
		int out, in;
		int temp;

		for (out = iNumElements - 1; out > 0; out--) // outer loop (backward)
		{
			for (in = 0; in < out; in++) // inner loop (forward)
			{

				// combined the old "swap" into the "if" loop
				if (arr[in] > arr[in + 1]) {
					temp = arr[in];
					arr[in] = arr[in + 1];
					arr[in + 1] = temp;
				} // end if
			} // inner for loop
		} // outer for loop
	} // end bubbleSort()

} // end MyArrayClass()