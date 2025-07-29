
class string_builder {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder("Logic");
        sb.append("While");
        System.out.println("After append:"+sb);
        sb.insert(5, "and");
        System.out.println("After insert:"+sb);
        sb.replace(0, 5, "Loop");
        System.out.println("After replace:"+sb);
        sb.delete(4,8);
        System.out.println("After delete:"+sb);
        sb.reverse();
        System.out.println("After reverse:"+sb);
        String finalstring=sb.toString();
        System.out.println("Final String:"+finalstring);
    }
}  