class Solution {
    public static void main(String[] args) {
        boolean a = false, b = true;

        
        String result = booleanOperations(a, b);

       
        System.out.println(result);
    }

       public static String booleanOperations(boolean a, boolean b) {
        String result = "";
        result += (a && b) + " ";
        result += (a || b) + " ";
        result += (!a) + " ";
        return result;
    }
}
