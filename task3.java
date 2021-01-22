class ReMeth {
    public static void main(String args[]) {

        int nums[] = {4, 6, 8, 10, 25, -3, 7, -9, 9, 8, 0};
        int t;
        int size = nums.length; // кол-во элементов в массиве

        // отобразить исходный массив
        System.out.print("Исходный массив: ");
        for(int i = 0; i < size; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        System.out.print("Кратные трём: ");
        for(int i = 0; i < size; i++) {
            if(nums[i] % 3 == 0)
                System.out.print(nums[i] + " ");
        }
    }
}
