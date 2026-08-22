class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0 ; 
        int end  = arr.length -1;
        while(start < end){
        int mid = start +(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else end = mid;
        }
       return start; // we cam return end also because it will run till start == end 
    }
}





// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {

//         // brute force 
//         int max =0 ; 
//         for(int i = 0 ; i<arr.length ;i++){
//             if(arr[i] > arr[max]){
//                 max = i;
//             }
//         }
//         return max;
        

        
//     }
// }