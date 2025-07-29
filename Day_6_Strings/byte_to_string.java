
class byte_to_string {
    public static void main(String[] args){
        String str="Java programming";
        byte[] bytes = str.getBytes();
        System.out.print("Bytes: ");
        for(byte b: bytes){
            System.out.print(b+" ");
        }
        System.out.println();
        
    }
}  