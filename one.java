class one{
    public static void main(String[]args){
        int count = 0, maxCount= 100, i;
        System.out.println("First "+maxCount+" Prime Numbers:");

        for(int num=1; count<maxCount; num++)
        {
            for(i=2; num%i != 0; i++);

            if(i == num){
                System.out.print(" "+num);
                count++;
            }
        }
    }
}
