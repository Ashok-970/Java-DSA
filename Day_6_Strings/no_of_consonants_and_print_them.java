
class no_of_consonants_and_print_them {
    public static void main(String[] args){
        String str="Java program";
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){
                count++;
                System.out.print(ch+" ");
            }
        }
        System.out.println(" ");
        System.out.println(count+" ");
    }
}  