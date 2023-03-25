package array_1;

import java.util.Arrays;

/*You have been given a random integer array/list(ARR) 
and a number X. Find and return the triplet(s) in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.*/

/*Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5*/

public class CountTripletSumWithDuplicatePairsAsWell {
	
	public static void main(String[] args) {
		
//		int arr[] = {1, 2, 3, 4, 5, 6, 7 };
//		int num = 19;
		
		int arr[] = {2, -5, 8, -6, 0, 5, 10, 11, -3};
		int num = 10;
		
		System.out.println(tripletSum(arr, num));
	}

	public static int tripletSum(int[] arr, int num) {
		Arrays.sort(arr);
		int n = arr.length;
		int numTriplets = 0;
		for (int i = 0; i < n; i++) {
			int pairSumFor = num - arr[i];
			int numPairs = pairSum(arr, (i + 1), (n - 1), pairSumFor);
			numTriplets += numPairs;
		}
		return numTriplets;
	}

	private static int pairSum(int[] arr, int startIndex, int endIndex, int num) {
		int numPair = 0;
		while (startIndex < endIndex) {
			if (arr[startIndex] + arr[endIndex] < num) {
				startIndex++;
			} else if (arr[startIndex] + arr[endIndex] > num) {
				endIndex--;
			} else {
				int elementAtStart = arr[startIndex];
				int elementAtEnd = arr[endIndex];
				if (elementAtStart == elementAtEnd) {
					int totalElementsFromStartToEnd = (endIndex - startIndex) + 1;
					numPair += (totalElementsFromStartToEnd * (totalElementsFromStartToEnd - 1) / 2);
					return numPair;
				}
				int tempStartIndex = startIndex + 1;
				int tempEndIndex = endIndex - 1;
				while (tempStartIndex <= tempEndIndex && arr[tempStartIndex] == elementAtStart) {
					tempStartIndex += 1;
				}
				while (tempEndIndex >= tempStartIndex && arr[tempEndIndex] == elementAtEnd) {
					tempEndIndex -= 1;
				}

				int totalElementsFromStart = (tempStartIndex - startIndex);
				int totalElementsFromEnd = (endIndex - tempEndIndex);
				numPair += (totalElementsFromStart * totalElementsFromEnd);
				startIndex = tempStartIndex;
				endIndex = tempEndIndex;
			}
		}
		return numPair;
	}
}
