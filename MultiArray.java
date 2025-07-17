class MultiArray{
    public static void main(String[] args) {
        int arr[][]=new int[3][5];
        
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
            
        }
        for(int x[]:arr){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}