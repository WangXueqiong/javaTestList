package test;

public class test {
    public static void main(String[] args){
        String ascii ="";
        ascii = ascii.trim();
        int n = ascii.length() / 6;
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0, j = 2; i < n; i++, j += 6) {
            String code = ascii.substring(j, j + 4);
            char ch = (char) Integer.parseInt(code, 16);
            sb.append(ch);
        }
        System.out.println("sb:"+sb);

        String str = null;
        String a = str==null?"??":"a";
        System.out.println(a);
    }

}
