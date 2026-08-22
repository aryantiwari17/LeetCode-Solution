class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length -1;
        while(start < end){
            int mid = start +(end -start)/2;
            if(arr[mid]<arr[mid+1]){ // it means we are in asc part ok
                start = mid+1;
            }
            else{ 
                end = mid; // kyunki mid hi chota hai  pichle se toh mid ko toh aage kyu dekhana haina 
                }
        }
        return start ; // we can return end too as start and end both are same; 
    }
}