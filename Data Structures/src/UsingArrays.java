public class UsingArrays {
    public static void main(String[] args) {

//        Arrays are a collection of similar type of Data

        int nums[] = {43, 534, 35, 543, 67};

        int gums[] = new int[5];

        System.out.println(nums[2]);
        System.out.println(nums[4]);

//        this will generate error
//        System.out.println(nums[5]);

        gums[0] = 1234;


        System.out.println(gums[0]);
        System.out.println(gums[2]);

        gums[2] = 6789;

        System.out.println(gums[2]);

//        getting the length of array
        System.out.println(nums.length);

        int len = nums.length;

        System.out.println("-----------------");
        for(int i=0;i<len;i++){
            System.out.println(nums[i]);
        }

        int tofind = 35;
        boolean found = false;

        for(int i=0;i<len;i++){
            if(nums[i] == tofind){
                System.out.println("number found!!");
                found = true;
            }
        }

        if(!found){
            System.out.println("not found");
        }

    }
}


// Write a program to check if a number is prime.