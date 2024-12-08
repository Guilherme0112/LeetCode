package Two_Sum;


class Main{
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3, 4};
            int[] indices = {1, 5};

            int n1 = nums[indices[0]];
            int n2 = nums[indices[1]];

            System.out.println();
            System.out.println(n1 + n2);

        } catch (Exception e) {
            System.out.println();
            System.out.println("Erro: " + e.getMessage());
        }
    }
}